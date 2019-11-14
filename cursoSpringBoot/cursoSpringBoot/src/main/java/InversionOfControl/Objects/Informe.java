package InversionOfControl.Objects;

import org.springframework.stereotype.Component;

import interfaces.CreacionInformes;

@Component
public class Informe implements CreacionInformes{

	public String getInforme() {
		return "Esta es la presentación del informe";
		
	}

	@Override
	public String getInformeFinanciero() {
		
		return "ESTE ES UN INFORME FINANCIERO DEL TRIMESTRE 1";
	}

}
