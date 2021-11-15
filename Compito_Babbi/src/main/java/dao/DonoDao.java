package dao;

import java.util.ArrayList;

import model.Dono;

public interface DonoDao {

	String FIND_ALL = "select * from dono";

	ArrayList<Dono> getListDoni();

}
