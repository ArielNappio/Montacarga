package ar.edu.unlam.dominio;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void queSeCreeCargaAlMontaCargasYQueNoPaseElSobrePeso() {

		Boolean resultadoEsperado = true;
		Boolean resultadoObtenido = null;

		MontaCargas montate = new MontaCargas(10000);

		Carga cargamento = new Carga(10);

		resultadoObtenido = montate.agregarCargas(cargamento);

		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@org.junit.Test
	public void SumaDeTodoElPeso() {

		Integer resultadoEsperado = 500;
		Integer resultadoObtenido = 0;

		MontaCargas montate = new MontaCargas(1000);

		Carga cargammentoDos = new Carga(100);
		Carga cargamento = new Carga(400);

		montate.agregarCargas(cargamento);
		montate.agregarCargas(cargammentoDos);

		resultadoObtenido = montate.totalActual();
		assertEquals(resultadoEsperado, resultadoObtenido);
		System.out.println(resultadoObtenido = montate.totalActual());
	}

	@org.junit.Test
	public void queSeDescargueTodo() {

		Integer resultadoEsperado = 0;
		Integer resultadoObtenido = null;

		MontaCargas montate = new MontaCargas(1000);

		Carga cargammentoDos = new Carga(100);
		Carga cargamento = new Carga(400);

		montate.agregarCargas(cargamento);
		montate.agregarCargas(cargammentoDos);

		montate.totalActual();
		resultadoObtenido = montate.DescargarTodo();

		assertEquals(resultadoEsperado, resultadoObtenido);

	}

}
