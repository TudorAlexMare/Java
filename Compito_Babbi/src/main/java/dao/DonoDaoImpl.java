package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.DB;
import model.Dono;

public class DonoDaoImpl implements DonoDao {

	DB db;
	Connection connection;
	PreparedStatement ps;
	ResultSet rs;

	public DonoDaoImpl() {
		db = new DB();
		connection = db.getConnection();
	}

	@Override
	public ArrayList<Dono> getListDoni() {

		ArrayList<Dono> listaDoni = new ArrayList<Dono>();

		try {
			ps = connection.prepareStatement(FIND_ALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				Dono dono = new Dono();
				dono.setDescrizione(rs.getString("descrizione"));
				dono.setDisponibilita(rs.getInt("disponibilita"));
				dono.setId(rs.getInt("id"));
				listaDoni.add(dono);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return listaDoni;
	}

}

