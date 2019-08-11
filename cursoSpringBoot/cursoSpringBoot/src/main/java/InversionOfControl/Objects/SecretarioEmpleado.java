package InversionOfControl.Objects;

import interfaces.CreacionInformes;
import interfaces.Empleados;

public class SecretarioEmpleado implements Empleados{
	//ATRIBUTOS
	public CreacionInformes informeNuevo;
	private String nombreEmpresa;
	private String email;
	
	//GETS AND SETS
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestionar la agenda de los Jefes";
	}

	public String getInforme() {
		return "Informe creado por el Secretario: "+ informeNuevo.getInforme();
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
