package InversionOfControl.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import interfaces.CreacionInformes;
import interfaces.EmpleadosAnnotations;

@Component
public class Comerciales implements EmpleadosAnnotations{
	/*
	 * Se puede usar en métodos setters, atributos y en métodos normales
	 */
	@Autowired
	private CreacionInformes nuevoInforme;
	
	
	/*@Autowired
	public Comerciales(CreacionInformes nuevoInforme) {
		super();
		this.nuevoInforme = nuevoInforme;
	}*/

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
