package br.com.futureCitizenSchool.model;

public class CustomerLogin {
	private int id;
	private String customerName;
	private String login;
	private String pass;

	public CustomerLogin() {

	}

	public CustomerLogin(int id, String customerName, String login, String pass) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.login = login;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
