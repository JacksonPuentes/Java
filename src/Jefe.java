import java.util.Scanner;

public class Jefe extends Empleado{
	
	private double incentivo;
	
	public Jefe(String nombre, double sueldo,int dia,int mes, int anio, double porcentaje) {
		
		super( nombre, sueldo, dia, mes, anio);
		
		incentivo=calculoIncentivo(porcentaje);
		
	}
	
	public double calculoIncentivo(double porcentaje1) {
		
		double resultado=super.getsueldo()*((porcentaje1/100));
		
		return resultado;
		
	}
	
	public String setDescipcionPersonal() {
		
		return ("Nombre: " + super.SetMostrarNombre() + "\n Sueldo: " + (super.getsueldo()+incentivo) + "\n Fecha de contrato: " + super.getcontrato());
		
	}
	
	static public double agregarDatoDouble() {
		
		Scanner lugar = new Scanner(System.in);
	    double valor = lugar.nextDouble();
	    
	    lugar.close();
	    
	    return valor;
		
	}

}
