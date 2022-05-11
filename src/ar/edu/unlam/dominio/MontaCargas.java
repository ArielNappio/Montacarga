package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class MontaCargas {

	private Integer pesoMax;
	private ArrayList<Carga> cargas;
	private boolean sobrePeso;
	private Integer pesoActual;

	public MontaCargas(int pesoMax) {
		this.pesoMax = pesoMax;
		this.cargas = new ArrayList<>();

	}

	public Integer getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(Integer pesoMax) {
		this.pesoMax = pesoMax;
	}
	/*
	 * public Boolean agregarCarga(Carga cargamento) { boolean retorno = false; if
	 * (!cargas.contains(cargamento)) { cargas.add(cargamento); retorno = true; }
	 * return retorno; }
	 */

	public boolean agregarCargas(Carga cargamento) {
		Integer PesoActual = totalActual();
		boolean retorno = false;
		if (!cargas.contains(cargamento) && (PesoActual + cargamento.getPeso()) <= pesoMax) {
			cargas.add(cargamento);
			retorno = true;

		}
		return retorno;
	}

	public Integer totalActual() {
		Integer totalCargado = 0;
		for (Carga I : cargas) {
			if (I.getPeso() <= pesoMax) {
				totalCargado += I.getPeso();
			}
		}
		return totalCargado;
	}

	public Integer descargarPorPeso(Integer pesoADescargar) {
		Integer totalDescargado = null;

		for (Carga I : cargas) {
			if (I.getPeso() <= pesoMax && I.getPeso() >= pesoADescargar) {
				totalDescargado = I.getPeso() - pesoADescargar;
			}
		}
		return totalDescargado;
	}

	public Integer DescargarTodo() {
		int variable = 0;
		cargas.clear();

		for (Carga carga : cargas) {
			variable = carga.getPeso();
		}
		return variable;
	}

	public boolean isSobrePeso() {
		return sobrePeso;
	}

	public void setSobrePeso(boolean sobrePeso) {
		this.sobrePeso = sobrePeso;
	}

	public Integer getPesoActual() {
		return pesoActual;
	}

	public void setPesoActual(Integer pesoActual) {
		this.pesoActual = pesoActual;
	}

}
