package poo;
import java.util.Date;
import java.util.GregorianCalendar;


public class empleados {

	public static void main(String[] args) {
		
		registros listaEmpleados[]=new registros[3];
		
		listaEmpleados[0]=new registros("JAckssd",10000,10,01,1997);
		listaEmpleados[1]=new registros("JAckssd",10000,10,01,1997);
		listaEmpleados[2]=new registros("JAckssd",10000,10,01,1997);
		
		
		for (registros e:listaEmpleados) {
			System.out.println("EL nombre es " + e.getnombre() );
		}
	}

}

class registros {
	
	private String nombre;
	private double sueldo;
	private Date fecha_contrato;
	
	public registros(String nombre, double sueldo,int dia,int mes, int anio) {
	
		if(mayorCero(dia) && mayorCero(anio) && mayorCero(mes) && mayorCero(sueldo)) {
			this.nombre=nombre;
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
	
	public String  getnombre() {
		
		return(nombre);
		
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

}
