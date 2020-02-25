package br.com.futureCitizenSchool.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.futureCitizenSchool.model.CustomerLogin;

public class CustomerDao {
	public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/futureCitizenSchool", "root", "recode12");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
        return connection;
    }
 
 
    public CustomerLogin getUsuario( String login, String pass ){
        Connection c = this.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = c.prepareStatement("select id, customerName from customer where login = ? and pass = ?");
            ps.setString(1, login);
            ps.setString(2, pass);
 
            rs = ps.executeQuery();
 
            if ( rs.next() ){
                CustomerLogin user = new CustomerLogin();
                user.setId( rs.getInt("id") );
                user.setLogin(login);
                user.setPass(pass);
                user.setCustomerName ( rs.getString("customerName") );
 
                return user;
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally{
            if (rs != null ) {
                try { rs.close(); } catch (SQLException e) { ; }
                rs = null;
            }
            if (ps != null ) {
                try { ps.close(); } catch (SQLException e) { ; }
                ps = null;
            }
            if (c != null ) {
                try { c.close(); } catch (SQLException e) { ; }
                c = null;
            }
        }
        return null;
    }
}
