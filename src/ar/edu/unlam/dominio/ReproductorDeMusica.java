package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReproductorDeMusica {

	private String nombreDelReproductor;
	private LinkedList<ListaDeRepoduccion> listaDeReproduccion;
	private ArrayList<Usuario> almacenarUsuario;

	public ReproductorDeMusica(String nombreDelReproductor) {
		this.nombreDelReproductor=nombreDelReproductor;
		this.listaDeReproduccion=new LinkedList<>();
		this.almacenarUsuario=new ArrayList<>();
		

	}

	public boolean agregarUsuario(Usuario usuario) {
		if (this.almacenarUsuario.size()==0) {
			almacenarUsuario.add(usuario);
			return true;
		}
		return false;
	}

	public boolean agregarListaDeReproduccion(ListaDeRepoduccion listaDeReproduccion2) {
		return this.listaDeReproduccion.add(listaDeReproduccion2);
	}

	public boolean agregarCancion(Cancion cancion) {
		for (ListaDeRepoduccion listaRepo : listaDeReproduccion) {
			if (listaRepo.getIndiceDeLista()==cancion.getIndicardorParaQueLista()) {
				listaRepo.agregarCancion(cancion);
				return true;
			}
		}
		return false;
	}

	
	
}
