package repaso;

public abstract class Figura implements Model {
	static private float maximaSuperficie;
	private String nombre;
	
	
	//constructores
	public Figura() {
		super();
	}

	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	// metodos abstractos de negocio
	public abstract float calcularPerimetro();
	public abstract float calcularSuperficie();
	public abstract String getValores();
	
	
   // getter y setters
	public static float getMaximaSuperficie() {
		return maximaSuperficie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Figura other = (Figura) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + "]";
	}
	
	

	
}
