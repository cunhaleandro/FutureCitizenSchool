package com.br.futureCitizenSchool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Debtors")
public class UserDebtors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;
	
	@Column(name = "debtors")
	protected String debtors;

	public UserDebtors() {

	}

	public UserDebtors(int id, String debtors) {
		super();
		this.id = id;
		this.debtors = debtors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDebtors() {
		return debtors;
	}

	public void setDebtors(String debtors) {
		this.debtors = debtors;
	}
	

}
