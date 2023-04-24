package ar.edu.unlam.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.Cancion;
import ar.edu.unlam.dominio.Genero;
import ar.edu.unlam.dominio.ListaDeRepoduccion;
import ar.edu.unlam.dominio.ReproductorDeMusica;
import ar.edu.unlam.dominio.Usuario;

public class ReproductorDeMusicaTest {
	

	ReproductorDeMusica repo=new ReproductorDeMusica("SPOTIFY");
	
	Genero genero;
	
	
	@Test
	public void validarGuardarDatos() {
		
		Usuario usuario=null;
		String apodoDelUsuario="Usuario1";
		String gmailDelUsuario="usuario1@gmail.com";
		String contraseniaDelUsuario="Contra123";
		int edadDelUsuario=20;
		String fechaDeCumpleUsuario="20/1/2023";
		boolean evaluarAgregarUsuario=false;
		
		
		usuario=new Usuario(apodoDelUsuario,gmailDelUsuario,contraseniaDelUsuario,edadDelUsuario,fechaDeCumpleUsuario);
		
		
		evaluarAgregarUsuario=repo.agregarUsuario(usuario);
		assertTrue(evaluarAgregarUsuario);
		
		
	}
	
	@Test
	public void validarCrearLista() {
		
		ListaDeRepoduccion listaDeReproduccion=null;
		
		Integer indiceDeLista=1;
		String nombreDeLaLista="Lista 1";
		boolean evaluarAgregarListaAlReproductor=false;
		
		
		listaDeReproduccion=new ListaDeRepoduccion(indiceDeLista,nombreDeLaLista);
		
		
		evaluarAgregarListaAlReproductor=repo.agregarListaDeReproduccion(listaDeReproduccion);
		assertTrue(evaluarAgregarListaAlReproductor);
			
	}
	
	@Test
	public void validarAgregarUnaCancion() {
		
		ListaDeRepoduccion listaDeReproduccion=null;
		
		Integer indiceDeLista=0;
		String nombreDeLaLista="Lista 1";
		boolean evaluarAgregarListaAlReproductor=false;
		
		listaDeReproduccion=new ListaDeRepoduccion(indiceDeLista,nombreDeLaLista);
		evaluarAgregarListaAlReproductor=repo.agregarListaDeReproduccion(listaDeReproduccion);
		
		
		
		Cancion cancion=null;
		
		String nombreDeLaCancion="Cancion Uno";
		genero=Genero.ROCK;
		Double duracionDeCancion=03.22;
		Integer indicardorParaQueLista=0;
		
		boolean validarAgregarCancion=false;
		
		cancion=new Cancion(nombreDeLaCancion,genero,duracionDeCancion,indicardorParaQueLista);
		
		validarAgregarCancion=repo.agregarCancion(cancion);
		assertTrue(validarAgregarCancion);
		
		
	}
	
	
	
	
}
