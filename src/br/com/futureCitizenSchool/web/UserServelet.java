package br.com.futureCitizenSchool.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.futureCitizenSchool.dao.UserDao;
import br.com.futureCitizenSchool.model.User;

@WebServlet("/")
public class UserServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;

	public void init() {
		userDao = new UserDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertUser(request, response);
				break;
			case "/delete":
				deleteUser(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateUser(request, response);
				break;
			case "/list":
				listUser(request, response);
				break;
			default:
				listUser(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<User> listOfUser = UserDao.getAllUser();
		request.setAttribute("listUser", listOfUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		User existingUser = userDao.getUser(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);

	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

		String aName = request.getParameter("aName");
		String bCpf = request.getParameter("bCpf");
		String cRg = request.getParameter("cRg");
		String dBirthday = request.getParameter("dBirthday");
		String eRegistrionDate = request.getParameter("eRegistrionDate");
		String fMotherName = request.getParameter("fMotherName");
		String gFatherName = request.getParameter("gFatherName");
		String hParentPhone = request.getParameter("hParentPhone");
		String iParentEmail = request.getParameter("iParentEmail");

		User newUser = new User(aName, bCpf, cRg, dBirthday, eRegistrionDate, fMotherName, gFatherName, hParentPhone,
				iParentEmail);
		userDao.saveUser(newUser);
		response.sendRedirect("listOfUser");

	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String aName = request.getParameter("aName");
		String bCpf = request.getParameter("bCpf");
		String cRg = request.getParameter("cRg");
		String dBirthday = request.getParameter("dBirthday");
		String eRegistrionDate = request.getParameter("eRegistrionDate");
		String fMotherName = request.getParameter("fMotherName");
		String gFatherName = request.getParameter("gFatherName");
		String hParentPhone = request.getParameter("hParentPhone");
		String iParentEmail = request.getParameter("iParentEmail");

		User user = new User(id, aName, bCpf, cRg, dBirthday, eRegistrionDate, fMotherName, gFatherName, hParentPhone,
				iParentEmail);
		userDao.updateUser(user);
		response.sendRedirect("listOfUser");
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		userDao.deleteUser(id);
		response.sendRedirect("listOfUser");
	}

}
