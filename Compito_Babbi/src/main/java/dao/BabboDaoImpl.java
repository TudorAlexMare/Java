package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.DB;
import model.Babbo;

public class BabboDaoImpl implements BabboDao {

	DB db;
	Connection connection;
	PreparedStatement ps;
	ResultSet rs;

	public BabboDaoImpl() {
		db = new DB();
		connection = db.getConnection();
	}

	@Override
	public ArrayList<Babbo> getListaBabbi() {

		ArrayList<Babbo> listaBabbi = new ArrayList<Babbo>();

		try {
			ps = connection.prepareStatement(FIND_ALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				Babbo babbo = new Babbo();
				babbo.setId(rs.getInt("id"));
				babbo.setUsername(rs.getString("username"));
				babbo.setPassword(rs.getString("password"));
				babbo.setNominativo(rs.getString("nominativo"));
				babbo.setRole(rs.getString("role"));
				babbo.setMezzo(rs.getString("mezzo"));
				babbo.setZona(rs.getString("zona"));

				if (!babbo.getRole().equals("amministratore"))
					listaBabbi.add(babbo);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return listaBabbi;
	}

}
