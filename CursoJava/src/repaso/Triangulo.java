package repaso;

public class Triangulo extends Figura {

	private float altura;
	private float base;
	
	
	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Triangulo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public Triangulo(String nombre, float altura, float base) {
		super(nombre);
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public float calcularPerimetro() {
		 int hipotenusa = (int) Math.sqrt((base*base)+(altura*altura));
	      return base+altura+hipotenusa;
		
	}
	@Override
	public float calcularSuperficie() {
		return(base*altura)/2;
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
		Triangulo other = (Triangulo) obj;
		if (!super.equals(obj) || Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (!super.equals(obj) || Float.floatToIntBits(base) != Float.floatToIntBits(other.base))
			return false;
		return true;
	}
	
	
	
}
