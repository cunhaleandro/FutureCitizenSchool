package br.com.futureCitizenSchool.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.futureCitizenSchool.dao.CustomerDao;
import br.com.futureCitizenSchool.model.Customer;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                         throws ServletException, IOException{
 
        HttpSession session = request.getSession(); //obtem a sessao do usuario, caso exista
 
        Customer user = null;
        String login_form = request.getParameter("customerName"); // Pega o Login vindo do formulario
        String pass_form = request.getParameter("pass"); //Pega a senha vinda do formulario
 
        try {
            CustomerDao dao = new CustomerDao(); //cria uma instancia do DAO usuario
            user = dao.getLogin(login_form, pass_form);
        }
        catch ( Exception e ){
 
        }
 
        //se nao encontrou usuario no banco, redireciona para a pagina de erro!
        if ( user == null ) {
            session.invalidate();
            request.getRequestDispatcher("error.jsp" ).forward(request, response);
        }
        else{
            //se o dao retornar um usuario, coloca o mesmo na sessao
            session.setAttribute("Customer", user);
            request.getRequestDispatcher("log.jsp" ).forward(request, response);
        }
 
    }
 
}



