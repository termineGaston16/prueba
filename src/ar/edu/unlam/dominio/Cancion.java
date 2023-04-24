package ar.edu.unlam.dominio;

public class Cancion {

	private String nombreDeLaCancion;
	private Genero genero;
	private Double duracionDeCancion;
	private Integer indicardorParaQueLista;

	public Cancion(String nombreDeLaCancion, Genero genero, Double duracionDeCancion, Integer indicardorParaQueLista) {
		this.nombreDeLaCancion=nombreDeLaCancion;
		this.genero=genero;
		this.duracionDeCancion=duracionDeCancion;
		this.indicardorParaQueLista=indicardorParaQueLista;
	}

	public String getNombreDeLaCancion() {
		return nombreDeLaCancion;
	}

	public void setNombreDeLaCancion(String nombreDeLaCancion) {
		this.nombreDeLaCancion = nombreDeLaCancion;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Double getDuracionDeCancion() {
		return duracionDeCancion;
	}

	public void setDuracionDeCancion(Double duracionDeCancion) {
		this.duracionDeCancion = duracionDeCancion;
	}

	public Integer getIndicardorParaQueLista() {
		return indicardorParaQueLista;
	}

	public void setIndicardorParaQueLista(Integer indicardorParaQueLista) {
		this.indicardorParaQueLista = indicardorParaQueLista;
	}

}
