import java.util.Random;

public class Mago {

	//TODO Declarar las variables
	//Usar el tipo de dato apropiado
	//Tener en cuenta los modificadores de Acceso
	private int poder = 0;
	private int salud = 0;
	private String nombre;
	private char genero;
	private String asistente;
	private String afiliacion;
	
	//TODO Constructores
	public Mago(String nombre, int poder, int salud) {
		this.nombre = nombre;
		this.poder = poder;
		this.salud = salud;
	}
	
	//TODO Declarar y Programar Metodos
	public void curar(Mago m)
	{
		Random r = new Random();
		int saludActual = m.getSalud();
		int curacion = 0;
		if(saludActual>0)
		{
			int variable = 5;
		curacion = r.nextInt(saludActual);
		}else{
			System.out.println(m.getNombre() + " ha muerto! RIP!");
			return;
		}
		int saludNueva = saludActual + curacion;
		m.setSalud(saludNueva);
		System.out.println(this.nombre + " ha curado a " + m.getNombre()
		+ ". El hechizo le dio +" + curacion +" de salud."
		+" La nueva salud de " + m.getNombre() + " es " + m.getSalud());
	}
	
	public void atacar(Mago m)
	{
		Random r = new Random();
		int miPoder = getPoder();
		int valorAtaque = r.nextInt(miPoder);
		int nuevaSaludOponente = m.getSalud() - valorAtaque;
		m.setSalud(nuevaSaludOponente);
		System.out.println(this.nombre + "ataco a " + m.getNombre() + "con un poder de "+ valorAtaque
				+ "\nLa salud de " + m.getNombre() + " es " + m.getSalud());
	}
	
	//TODO Generar Getters y Setters
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setPoder(int poder)
	{
		this.poder = poder;
	}
	
	public int getPoder()
	{
		return poder;
	}
	
	public void setSalud(int salud)
	{
		this.salud = salud;
	}
	
	public int getSalud()
	{
		return salud;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getAsistente() {
		return asistente;
	}

	public void setAsistente(String asistente) {
		this.asistente = asistente;
	}

	public String getAfiliacion() {
		return afiliacion;
	}

	public void setAfiliacion(String afiliacion) {
		this.afiliacion = afiliacion;
	}
	
	public boolean esIgual(Mago otroMago)
	{
		boolean iguales = false;
		if(this.nombre==otroMago.getNombre()
				&& this.salud == otroMago.getSalud()
				&& this.poder == otroMago.getPoder())
		{
			iguales = true;
		}
		
		return iguales;
	}
	
}
