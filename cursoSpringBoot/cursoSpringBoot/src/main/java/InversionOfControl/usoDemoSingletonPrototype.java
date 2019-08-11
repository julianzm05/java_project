package InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import InversionOfControl.Objects.DirectorEmpleado;
import InversionOfControl.Objects.SecretarioEmpleado;


public class usoDemoSingletonPrototype {

	public static void main(String[] args) {
		
		//Carga de XML de configuracion
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContexts/applicationContext2.xml");
		//Petición de Beans al contenedor Spring
		SecretarioEmpleado maria=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		SecretarioEmpleado pedro=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		System.out.println("EMPRESA MARIA: "+maria.getNombreEmpresa());
		maria.setNombreEmpresa("Empresa NUEVA 2");
		System.out.println("EMPRESA MARIA 2: "+maria.getNombreEmpresa());
		System.out.println("EMPRESA PEDRO 2: "+pedro.getNombreEmpresa());
		System.out.println("---------------------------------------------");
		/*
		 * Spring por defecto trabajo con el uso Singleton por ende ambas instancias son la misma y un cambio en una de ellas afecta a la otra.
		 * Se cambia en el XML de singleton a prototype
		 */
		DirectorEmpleado director=contexto.getBean("miDirectorEmpleado",DirectorEmpleado.class);
		System.out.println("INFORME: "+director.getInforme());
		
		contexto.close();
		
	}

}
