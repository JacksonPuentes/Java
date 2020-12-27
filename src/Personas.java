import java.util.Scanner;

abstract public class Personas {
	
	private String nombre;
	
	public Personas(String nombre){
		
		this.nombre=nombre;		
		
	}
	
	public String SetMostrarNombre() {
		
		return nombre;
		
	}
	
	public abstract String setDescipcionPersonal();
	
	static public String nuevObjeto() {
		
		
		Scanner lugar = new Scanner(System.in);
	    String nombre = lugar.nextLine();
	    
	    lugar.close();
		
		return nombre;
		
	}

}
