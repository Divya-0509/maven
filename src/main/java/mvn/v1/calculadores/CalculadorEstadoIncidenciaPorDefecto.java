package mvn.v1.calculadores;

import org.openxava.calculators.*;

import mvn.v1.modelo.*;

public class CalculadorEstadoIncidenciaPorDefecto implements ICalculator {

	public Object calculate() throws Exception {
		EstadoIncidencia laDePorDefecto = EstadoIncidencia.findLaDePorDefecto();
		return laDePorDefecto == null?null:laDePorDefecto.getId();
	}
	
}
