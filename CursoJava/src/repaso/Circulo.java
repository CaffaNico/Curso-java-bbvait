package repaso;

public class Circulo extends Figura {
	private float radio;
	
	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circulo(String nombre,float radio) {
		super(nombre);
		this.radio = radio;
	}

	@Override
	public float calcularPerimetro() {
		return 2 * (float)Math.PI * this.radio;
	}

	@Override
	public float calcularSuperficie() {
		return this.radio + this.radio ;
		
	}

	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("R=");
		sb.append(radio);
		return sb.toString();
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(radio);
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
		Circulo other = (Circulo) obj;
		if (!super.equals(obj) || Float.floatToIntBits(radio) != Float.floatToIntBits(other.radio))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + this.radio + "]";
	}
	
}
