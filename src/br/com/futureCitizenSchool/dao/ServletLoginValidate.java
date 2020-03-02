package br.com.futureCitizenSchool.dao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.futureCitizenSchool.model.CustomerLogin;

public class ServletLoginValidate extends HttpServlet {
	private static final long serialVersionUID = 7633293501883840556L;
	 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                         throws ServletException, IOException{
 
        HttpSession session = request.getSession(); //obtem a sessao do usuario, caso exista
 
        CustomerLogin user = null;
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
            request.getRequestDispatcher("erroLogin.jsp" ).forward(request, response);
        }
        else{
            //se o dao retornar um usuario, coloca o mesmo na sessao
            session.setAttribute("user", user);
            request.getRequestDispatcher("logado.jsp" ).forward(request, response);
        }
 
    }
 
}



