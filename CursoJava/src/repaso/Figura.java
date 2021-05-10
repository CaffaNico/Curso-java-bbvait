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

	
}
