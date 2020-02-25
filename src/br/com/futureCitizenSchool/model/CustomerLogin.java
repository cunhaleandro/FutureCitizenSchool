package br.com.futureCitizenSchool.model;

public class CustomerLogin {
	private int id;
	private String customer;
	private String login;
	private String pass;

	public CustomerLogin() {

	}

	public CustomerLogin(int id, String customer, String login, String pass) {
		super();
		this.id = id;
		this.customer = customer;
		this.login = login;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
