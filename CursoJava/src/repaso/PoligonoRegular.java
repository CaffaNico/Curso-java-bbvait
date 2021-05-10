package repaso;

public class PoligonoRegular extends Figura {
	private float apotema;
	private int CantidadDeLados;
	private int lado;
	
	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getValores() {
		// TODO Auto-generated method stub
		return null;
	}
	public PoligonoRegular() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PoligonoRegular(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	public float getApotema() {
		return apotema;
	}
	public void setApotema(float apotema) {
		this.apotema = apotema;
	}
	public int getCantidadDeLados() {
		return CantidadDeLados;
	}
	public void setCantidadDeLados(int cantidadDeLados) {
		CantidadDeLados = cantidadDeLados;
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CantidadDeLados;
		result = prime * result + Float.floatToIntBits(apotema);
		result = prime * result + lado;
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
		PoligonoRegular other = (PoligonoRegular) obj;
		if (CantidadDeLados != other.CantidadDeLados)
			return false;
		if (Float.floatToIntBits(apotema) != Float.floatToIntBits(other.apotema))
			return false;
		if (lado != other.lado)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PoligonoRegular [apotema=" + this.apotema + ", CantidadDeLados=" + this.CantidadDeLados + ", lado=" + this.lado + "]";
	}
	
	
	

}
