package InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import InversionOfControl.Objects.Comerciales;
import interfaces.EmpleadosAnnotations;

public class usoSingletonPrototype {

	public static void main(String[] args) {
		//Cargar el XML de configuración
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContexts/applicationContextAnnotations.xml");
		//Pedir Bean
		EmpleadosAnnotations antonio=contexto.getBean("comerciales",Comerciales.class);
		EmpleadosAnnotations maria=contexto.getBean("comerciales",Comerciales.class);
		//Apuntar al mismo objeto en memoria?
		if(antonio == maria) {
			System.out.println("Apuntan al mismo objeto en memoria");
			System.out.println(antonio +"\n"+maria);
		}else {
			System.out.println("No apuntan al mismo objeto en memoria");
			System.out.println(antonio +"\n"+maria);
		}
	}

}
