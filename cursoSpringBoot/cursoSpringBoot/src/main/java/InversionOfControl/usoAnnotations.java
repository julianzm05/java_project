package InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import InversionOfControl.Objects.Comerciales;
import interfaces.EmpleadosAnnotations;
public class usoAnnotations {

	public static void main(String[] args) {
		//Cargar el XML de configuración
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContexts/applicationContextAnnotations.xml");
		//Pedir Bean
		EmpleadosAnnotations antonio=contexto.getBean("comerciales",Comerciales.class);
		System.out.println("Tareas: "+antonio.getTareas());
		System.out.println("Informe: "+antonio.getInforme());
		contexto.close();
	}
}
