package repaso;

public class Rectangulo extends Figura {
	
	private float altura;
	private float base;
	
	
	public Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangulo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public Rectangulo(String nombre,float altura, float base) {
		super(nombre);
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (base + altura);
	}
	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("A=");
		sb.append(altura+"-"+"B=");
		sb.append(base);
		return sb.toString();
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(altura);
		result = prime * result + Float.floatToIntBits(base);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		if (!super.equals(obj) || Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (!super.equals(obj) || Float.floatToIntBits(base) != Float.floatToIntBits(other.base))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rectangulo [altura=" + this.altura + ", base=" + this.base + "]";
	}
	
	
	

}
