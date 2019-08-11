package InversionOfControl.Objects;

import interfaces.CreacionInformes;
import interfaces.Empleados;

public class DirectorEmpleado implements Empleados{

	private CreacionInformes informeNuevo;
	
	//Método init. Ejecuta tareas antes de que el bean esté disponible
	public void metodoInicial() {
		System.out.println("Dentro del metodo init se ejecutan las taras que se hacen antes de entregar el bean");
	}
	
	//Método destroy. Ejecutar tareas después de que el bean haya sido utilizado
	public void metodoFinalizar() {

		System.out.println("Dentro del metodo destroy se ejecutan las taras que se hacen después de utlizar el bean");
	}
	//Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		//Inyección de dependencias por constructor
		this.informeNuevo=informeNuevo;
	}
	
	public String getTareas() {
		return "Gestionar la plantilla de la empresa";
	}

	public String getInforme() {
		return "Informe creado por el Director: "+ informeNuevo.getInforme();
	}

}
