package InversionOfControl.Objects;

import org.springframework.stereotype.Component;

import interfaces.CreacionInformes;

@Component
public class InformeEspecial implements CreacionInformes{

	@Override
	public String getInforme() {
		return "Presentación de informe especializado";
	}

	@Override
	public String getInformeFinanciero() {
		return "Presentación de informe financiero especializado";
	}

}
