package InversionOfControl;

import java.text.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import InversionOfControl.Objects.Comerciales;
import InversionOfControl.Objects.DirectorEmpleado;
import InversionOfControl.Objects.DirectorFinanciero;
import InversionOfControl.Objects.EmpleadosConfig;
import interfaces.EmpleadosAnnotations;
public class usoAnnotations {

	public static void main(String[] args) {
		//Cargar el XML de configuración
		//ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContexts/applicationContextAnnotations.xml");
		//cargar clase de configuración
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		//Pedir Bean
		EmpleadosAnnotations antonio=contexto.getBean("directorFinanciero",EmpleadosAnnotations.class);
		System.out.println("Tareas: "+antonio.getTareas());
		System.out.println("Informe: "+antonio.getInforme());
		contexto.close();
	}
}
