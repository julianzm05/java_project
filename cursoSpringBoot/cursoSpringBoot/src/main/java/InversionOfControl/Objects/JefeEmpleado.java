package InversionOfControl.Objects;

import interfaces.CreacionInformes;
import interfaces.Empleados;

public class JefeEmpleado implements Empleados{
	
	private CreacionInformes informeNuevo;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		//Inyección de dependencias por constructor
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	}

	public String getInforme() {
		return "Informe creado por el Jefe: "+ informeNuevo.getInforme();
	}
}
