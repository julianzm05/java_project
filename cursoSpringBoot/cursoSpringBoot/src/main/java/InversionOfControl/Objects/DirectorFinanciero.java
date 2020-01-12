package InversionOfControl.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import interfaces.CreacionInformes;
import interfaces.Empleados;
import interfaces.EmpleadosAnnotations;

public class DirectorFinanciero implements EmpleadosAnnotations{
	//ATTRIBUTES
	private InformeEspecial informe;
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
	//CONSTRUCTORS
	public DirectorFinanciero(InformeEspecial informe) {
		super();
		this.informe = informe;
	}
	//METHODS
	@Override
	public String getTareas() {
		return "Gestión y direción de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		return String.format("%s\n%s\n%s",informe.getInformeFinanciero(),nombreEmpresa,email);
	}

}
