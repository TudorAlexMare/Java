package dao;

import java.util.ArrayList;

import model.Babbo;

public interface BabboDao {

	String FIND_ALL = "select * from babbo";

	ArrayList<Babbo> getListaBabbi();

}
