import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Empleado extends Personas {
	
	private double sueldo;
	private Date fecha_contrato;
	
	public Empleado(String nombre, double sueldo,int dia,int mes, int anio) {
	
		super(nombre);
		
		if(mayorCero(dia) && mayorCero(anio) && mayorCero(mes) && mayorCero(sueldo)) {
			this.sueldo=sueldo;
			GregorianCalendar fecha=new GregorianCalendar(anio,mes,dia);
			fecha_contrato=fecha.getTime();
		}
		
	}
	
	public boolean mayorCero(int estudiar) {
		
		return (estudiar>0);
		
	}
	
	public boolean mayorCero(double estudiar) {
		
		return (estudiar>0);
		
	}

	
	public double  getsueldo() {
		
		return(sueldo);
		
	}
	
	public Date  getcontrato() {
		
		return(fecha_contrato);
		
	}
	
	public void setAumentoSueldo(double porcentaje) {
		
		double nuevoSueldo=porcentaje/100;
				
		sueldo=sueldo*nuevoSueldo;
	}
	
	public String setDescipcionPersonal() {
		
		return ("Nombre: " + super.SetMostrarNombre() + "\n Sueldo: " + sueldo + "\n Fecha de contrato: " + fecha_contrato);
		
	}
	
	static public int tipoEmpleado() {
		
		System.out.println("\n Que tipo de empleado registra? ");
		System.out.println("1)Empleado comun");
		System.out.println("2)Jefe");
		System.out.println("Elija su opcion: ");
		
		Scanner lugar = new Scanner(System.in);
	    int opcion = lugar.nextInt();
	    
	    lugar.close();
	    
	    return opcion;
	    
	}

}
