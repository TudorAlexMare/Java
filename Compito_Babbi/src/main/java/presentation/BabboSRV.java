package presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BabboDao;
import dao.BabboDaoImpl;
import model.Babbo;

@WebServlet("/lista-babbi")
public class BabboSRV extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BabboDao repoBabbo;

	// Costruttore
    public BabboSRV() {
		this.repoBabbo = new BabboDaoImpl();
    }


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Babbo> listaBabbi = repoBabbo.getListaBabbi();

		request.setAttribute("key2", listaBabbi);
		request.getRequestDispatcher("babbiAdmin.jsp").forward(request, response);
	}

}
