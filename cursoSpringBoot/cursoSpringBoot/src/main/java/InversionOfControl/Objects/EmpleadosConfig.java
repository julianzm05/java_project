package InversionOfControl.Objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import interfaces.EmpleadosAnnotations;

@Configuration
@ComponentScan("InversionOfControl.Objects")
@PropertySource("classpath:datosEmpresa.properties")
public class EmpleadosConfig {
	
	//definir Bean para InformeEspecial
	@Bean
	public InformeEspecial informeEspecial() {
		return new InformeEspecial();
	}
	
	//definir Bean para director financiero
	@Bean
	public EmpleadosAnnotations directorFinanciero() {
		return new DirectorFinanciero(informeEspecial());
	}
}
