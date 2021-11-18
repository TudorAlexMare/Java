package model;

public class Dono {

	private int id;
	private String descrizione;
	private int disponibilita;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(int disponibilita) {
		this.disponibilita = disponibilita;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dono [id=");
		builder.append(id);
		builder.append(", descrizione=");
		builder.append(descrizione);
		builder.append(", disponibilita=");
		builder.append(disponibilita);
		builder.append("]");
		return builder.toString();
	}

}