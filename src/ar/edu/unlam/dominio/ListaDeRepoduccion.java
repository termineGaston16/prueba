package ar.edu.unlam.dominio;

import java.util.HashSet;

public class ListaDeRepoduccion {

	private Integer indiceDeLista;
	private String nombreDeLaLista;
	private HashSet<Cancion> listaCancion;
	

	public ListaDeRepoduccion(Integer indiceDeLista, String nombreDeLaLista) {
		this.indiceDeLista=indiceDeLista;
		this.nombreDeLaLista=nombreDeLaLista;
		this.listaCancion=new HashSet<>();
	}

	public Integer getIndiceDeLista() {
		return indiceDeLista;
	}

	public void setIndiceDeLista(Integer indiceDeLista) {
		this.indiceDeLista = indiceDeLista;
	}

	public String getNombreDeLaLista() {
		return nombreDeLaLista;
	}

	public void setNombreDeLaLista(String nombreDeLaLista) {
		this.nombreDeLaLista = nombreDeLaLista;
	}

	public void agregarCancion(Cancion cancion) {
		listaCancion.add(cancion);
	}

	

}
