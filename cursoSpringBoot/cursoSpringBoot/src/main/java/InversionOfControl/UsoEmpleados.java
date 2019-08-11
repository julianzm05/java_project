package InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import InversionOfControl.Objects.SecretarioEmpleado;
import interfaces.Empleados;



public class UsoEmpleados {

	public static void main(String[] args) {
		//Creación de objetos de tipo Empleado sin usar srpint;
		//Empleados empleado1=new JefeEmpleado();
		//Empleados empleado2=new SecretarioEmpleado();
		//Empleados empleado3=new DirectorEmpleado();
		//System.out.println(empleado1.getTareas());
		//System.out.println(empleado2.getTareas());
		//System.out.println(empleado3.getTareas());
		
		//Se crea el contexto
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContexts/applicationContext.xml");
		//Se obtiene el Bean manajedor de contexto;
		Empleados empleado=contexto.getBean("miEmpleado",Empleados.class);
		//se usa el objeto
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		
		//Inyección de dependencias con setters
		
		Empleados empleado2=contexto.getBean("miSecretarioEmpleado",Empleados.class);
		System.out.println(empleado2.getTareas());
		System.out.println(empleado2.getInforme());
		System.out.println("--------------------------------------------------------");
		SecretarioEmpleado secretario=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		System.out.println("Email: "+secretario.getEmail());
		System.out.println("Empresa: "+secretario.getNombreEmpresa());
		contexto.close();
		
		
		
	}

}
