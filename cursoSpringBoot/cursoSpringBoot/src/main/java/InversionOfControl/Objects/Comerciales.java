package InversionOfControl.Objects;

import org.springframework.stereotype.Component;

import interfaces.EmpleadosAnnotations;

@Component("comercial")
public class Comerciales implements EmpleadosAnnotations{

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender y Vender";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe Generado por el comercial";
	}

}
