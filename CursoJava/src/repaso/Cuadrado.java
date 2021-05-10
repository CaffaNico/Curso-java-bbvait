package repaso;

public class Cuadrado extends Figura {
	
	private float lado;
	
	

	public Cuadrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(String nombre,float lado) {
		super(nombre);
		this.lado = lado;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return 4*lado;
	}

	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("L=");
		sb.append(lado);
		return sb.toString();
	}
	

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(lado);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuadrado other = (Cuadrado) obj;
		//Una ves que se que es un cuadrado le agrego la validacion del nombe
		if (!super.equals(obj) || Float.floatToIntBits(lado) != Float.floatToIntBits(other.lado))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + this.lado + "]";
	}
	
	
	

}
