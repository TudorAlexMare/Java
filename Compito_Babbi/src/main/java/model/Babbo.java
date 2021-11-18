package model;

public class Babbo {

	private int id;
	private String username;
	private String password;
	private String nominativo;
	private String role;
	private String mezzo;
	private String zona;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String ruolo) {
		this.role = ruolo;
	}

	public String getMezzo() {
		return mezzo;
	}

	public void setMezzo(String mezzo) {
		this.mezzo = mezzo;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Babbo [id=");
		builder.append(id);
		builder.append(", username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", nominativo=");
		builder.append(nominativo);
		builder.append(", ruolo=");
		builder.append(role);
		builder.append(", mezzo=");
		builder.append(mezzo);
		builder.append(", zona=");
		builder.append(zona);
		builder.append("]");
		return builder.toString();
	}


}
