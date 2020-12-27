import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int contadorComun=0;
		int contadorJefe=0;
		double valor=0;
		boolean bandera=true;
		String objeto;
		Personas empleadosComunes[]=new Personas[10];
		Personas empleadosJefes[]=new Personas[10];
		
		while(bandera){
			
			System.out.println("\n Bienvenido \n");
			System.out.println("1)Para agregar Empleado");
			System.out.println("2)Para mostrar Empleados");
			System.out.println("0)Salir \n");
			
			System.out.println("Ingrese la opcion deseada: ");
			Scanner lugar = new Scanner(System.in);
		    int opcion = lugar.nextInt();
		    
		    lugar.close();
		    
		    if (opcion==1) {
		    	
		    	opcion = Empleado.tipoEmpleado();
		    	
		    	if (opcion == 1) {
		    		
		    		System.out.println("Ingrese el nombre de la persona");
		    		
		    		objeto=Personas.nuevObjeto();
			    	
			    	empleadosComunes[contadorComun]=new Empleado(objeto,10000,10,01,1997);
			    	
			    	contadorComun++;
		    		
		    	}
		    	
		    	else if (opcion==2) {
		    		
		    		System.out.println("Ingrese el nombre de la persona");
		    		
		    		objeto=Personas.nuevObjeto();
		    		
		    		System.out.println("Ingrese el incentivo: ");
		    		
		    		valor=Jefe.agregarDatoDouble();
			    	
		    		empleadosJefes[contadorJefe]=new Jefe(objeto,20000,10,01,1997,valor);
			    	
		    		contadorJefe++;
		    		
		    		
		    	}
	
		    }
		    
		    else if (opcion==0) {
		    	
		    	System.out.println("..::Adios::..");		    	
		    	bandera=false;
		    	
		    }
		    
		    else if (opcion==2) {
		    	
		    	System.out.println(".::Empleados::.");
		    	
		    	for(int i=0;i<contadorComun;i++) {		
		    		
		    		System.out.println("\n" + empleadosComunes[i].setDescipcionPersonal());	
				}
		    	
		    	
		    	System.out.println(".::Jefes::.");
		    	
		    	for(int i=0;i<contadorJefe;i++) {	
		    		System.out.println("\n" + empleadosJefes[i].setDescipcionPersonal());	
				}
		    	
		    	
		    }			
		}

	}

}
