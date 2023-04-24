package ar.edu.unlam.dominio;

public class Usuario {

	private String apodoDelUsuario;
	private String gmailDelUsuario;
	private String contraseniaDelUsuario;
	private int edadDelUsuario;
	private String fechaDeCumpleUsuario;

	public Usuario(String apodoDelUsuario, String gmailDelUsuario, String contraseniaDelUsuario, int edadDelUsuario,
			String fechaDeCumpleUsuario) {
		this.apodoDelUsuario=apodoDelUsuario;
		this.gmailDelUsuario=gmailDelUsuario;
		this.contraseniaDelUsuario=contraseniaDelUsuario;
		this.edadDelUsuario=edadDelUsuario;
		this.fechaDeCumpleUsuario=fechaDeCumpleUsuario;

}

	public String getApodoDelUsuario() {
		return apodoDelUsuario;
	}

	public void setApodoDelUsuario(String apodoDelUsuario) {
		this.apodoDelUsuario = apodoDelUsuario;
	}

	public String getGmailDelUsuario() {
		return gmailDelUsuario;
	}

	public void setGmailDelUsuario(String gmailDelUsuario) {
		this.gmailDelUsuario = gmailDelUsuario;
	}

	public String getContraseniaDelUsuario() {
		return contraseniaDelUsuario;
	}

	public void setContraseniaDelUsuario(String contraseniaDelUsuario) {
		this.contraseniaDelUsuario = contraseniaDelUsuario;
	}

	public int getEdadDelUsuario() {
		return edadDelUsuario;
	}

	public void setEdadDelUsuario(int edadDelUsuario) {
		this.edadDelUsuario = edadDelUsuario;
	}

	public String getFechaDeCumpleUsuario() {
		return fechaDeCumpleUsuario;
	}

	public void setFechaDeCumpleUsuario(String fechaDeCumpleUsuario) {
		this.fechaDeCumpleUsuario = fechaDeCumpleUsuario;
	}
	
	
	
	
}