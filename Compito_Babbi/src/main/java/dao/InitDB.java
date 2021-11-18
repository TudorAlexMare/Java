package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.DB;

public class InitDB {

	static DB db = new DB();
	static Connection connessione;
	static Statement stat;

	public static void creaTabellaBabbi() {
		String query = "CREATE TABLE IF NOT EXISTS babbo(" + "id int AUTO_INCREMENT PRIMARY KEY,"
				+ "username varchar(20) UNIQUE," + "password varchar(25)," + "nominativo varchar(20),"
				+ "role varchar(15)," + "mezzo varchar(20)," + "zona varchar(25))";

		connessione = db.getConnection();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void creaTabellaDoni() {
		String query = "CREATE TABLE IF NOT EXISTS dono(" + "id int AUTO_INCREMENT PRIMARY KEY,"
				+ "descrizione varchar(20)," + "disponibilita BIT)";

		connessione = db.getConnection();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		creaTabellaBabbi();
		creaTabellaDoni();
	}
}