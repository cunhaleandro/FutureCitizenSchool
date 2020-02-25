package br.com.futureCitizenSchool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "debtors")
public class UserDebtors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;
	
	@Column(name = "debtor")
	protected String debtor;

	public UserDebtors() {

	}

	public UserDebtors(int id, String debtors) {
		super();
		this.id = id;
		this.debtor = debtor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDebtors() {
		return debtor;
	}

	public void setDebtors(String debtors) {
		this.debtor = debtors;
	}
	

}
