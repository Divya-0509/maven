package mvn.v1.calculadores;

import org.openxava.calculators.*;

import mvn.v1.modelo.*;

public class CalculadorProyectoPorDefecto implements ICalculator {

	public Object calculate() throws Exception {
		Proyecto unico = Proyecto.findUnico();
		return unico == null?null:unico.getId();
	}

}
