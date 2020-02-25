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

	@Column(name = "student")
	protected String stundent;

	@Column(name = "cpf")
	protected String cpf;

	@Column(name = "rg")
	protected String rg;

	@Column(name = "birthday")
	protected String birthday;

	@Column(name = "registrionDate")
	protected String registrionDate;

	@Column(name = "motherName")
	protected String motherName;

	@Column(name = "fatherName")
	protected String fatherName;

	@Column(name = "parentPhone")
	protected String parentPhone;

	@Column(name = "parentEmail")
	protected String parentEmail;

	public User() {

	}

	public User(int id, String stundent, String cpf, String rg, String birthday, String registrionDate, String motherName,
			String fatherName, String parentEmail, String parentPhone) {
		super();
		this.id = id;
		this.stundent = stundent;
		this.cpf = cpf;
		this.rg = rg;
		this.birthday = birthday;
		this.registrionDate = registrionDate;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.parentEmail = parentEmail;
		this.parentPhone = parentPhone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStundent() {
		return stundent;
	}

	public void setStundent(String stundent) {
		this.stundent = stundent;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getRegistrionDate() {
		return registrionDate;
	}

	public void setRegistrionDate(String registrionDate) {
		this.registrionDate = registrionDate;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getParentEmail() {
		return parentEmail;
	}

	public void setParentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}

	public String getParentPhone() {
		return parentPhone;
	}

	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}

}
