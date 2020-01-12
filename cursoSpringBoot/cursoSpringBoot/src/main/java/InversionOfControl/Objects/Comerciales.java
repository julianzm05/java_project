package InversionOfControl.Objects;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import interfaces.CreacionInformes;
import interfaces.EmpleadosAnnotations;

@Component
//@Scope("prototype")
public class Comerciales implements EmpleadosAnnotations{
	/*
	 * Se puede usar en métodos setters, atributos y en métodos normales
	 */
	@Autowired
	@Qualifier("informeEspecial")
	private CreacionInformes nuevoInforme;
	
	
	/*@Autowired
	public Comerciales(CreacionInformes nuevoInforme) {
		super();
		this.nuevoInforme = nuevoInforme;
	}*/
	
	//Ejecución de código después de la creación del Bean
	@PostConstruct //funciona solo con singleton
	public void ejecutaDesdeCreacion() {
		System.out.println("Ejecutado después de la creacíon del Bean");
	}
	
	//Ejecución de código antes de la destrucción del Bean
	@PreDestroy //funciona solo con singleton
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutado antes de la destrucción del Bean");
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender y Vender";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}

}
