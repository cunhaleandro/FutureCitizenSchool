package br.com.futureCitizenSchool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;

	@Column(name = "aName")
	protected String aName;

	@Column(name = "bCpf")
	protected String bCpf;

	@Column(name = "cRg")
	protected String cRg;

	@Column(name = "dBirthday")
	protected String dBirthday;

	@Column(name = "eRegistrionDate")
	protected String eRegistrionDate;

	@Column(name = "fMotherName")
	protected String fMotherName;

	@Column(name = "gFatherName")
	protected String gFatherName;

	@Column(name = "hParentPhone")
	protected String hParentPhone;

	@Column(name = "iParentEmail")
	protected String iParentEmail;

	public User() {

	}

	public User(String aName, String bCpf, String cRg, String dBirthday, String eRegistrionDate, String fMotherName,
			String gFatherName, String hParentPhone, String iParentEmail) {
		super();
		this.aName = aName;
		this.bCpf = bCpf;
		this.cRg = cRg;
		this.dBirthday = dBirthday;
		this.eRegistrionDate = eRegistrionDate;
		this.fMotherName = fMotherName;
		this.gFatherName = gFatherName;
		this.hParentPhone = hParentPhone;
		this.iParentEmail = iParentEmail;
	}

	public User(int id, String aName, String bCpf, String cRg, String dBirthday, String eRegistrionDate,
			String fMotherName, String gFatherName, String hParentPhone, String iParentEmail) {
		super();
		this.id = id;
		this.aName = aName;
		this.bCpf = bCpf;
		this.cRg = cRg;
		this.dBirthday = dBirthday;
		this.eRegistrionDate = eRegistrionDate;
		this.fMotherName = fMotherName;
		this.gFatherName = gFatherName;
		this.hParentPhone = hParentPhone;
		this.iParentEmail = iParentEmail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getbCpf() {
		return bCpf;
	}

	public void setbCpf(String bCpf) {
		this.bCpf = bCpf;
	}

	public String getcRg() {
		return cRg;
	}

	public void setcRg(String cRg) {
		this.cRg = cRg;
	}

	public String getdBirthday() {
		return dBirthday;
	}

	public void setdBirthday(String dBirthday) {
		this.dBirthday = dBirthday;
	}

	public String geteRegistrionDate() {
		return eRegistrionDate;
	}

	public void seteRegistrionDate(String eRegistrionDate) {
		this.eRegistrionDate = eRegistrionDate;
	}

	public String getfMotherName() {
		return fMotherName;
	}

	public void setfMotherName(String fMotherName) {
		this.fMotherName = fMotherName;
	}

	public String getgFatherName() {
		return gFatherName;
	}

	public void setgFatherName(String gFatherName) {
		this.gFatherName = gFatherName;
	}

	public String gethParentPhone() {
		return hParentPhone;
	}

	public void sethParentPhone(String hParentPhone) {
		this.hParentPhone = hParentPhone;
	}

	public String getiParentEmail() {
		return iParentEmail;
	}

	public void setiParentEmail(String iParentEmail) {
		this.iParentEmail = iParentEmail;
	}
	

}
