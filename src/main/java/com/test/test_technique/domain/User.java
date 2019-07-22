package com.test.test_technique.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	String nom;
	String prenom;
	String Code;
	String email;
	String photoPath;
	String password;
	boolean isExpiring;
	Date exipirationDate;
	
	@ManyToOne
	Profile  profile;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isExpiring() {
		return isExpiring;
	}
	public void setExpiring(boolean isExpiring) {
		this.isExpiring = isExpiring;
	}
	public Date getExipirationDate() {
		return exipirationDate;
	}
	public void setExipirationDate(Date exipirationDate) {
		this.exipirationDate = exipirationDate;
	}
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String nom, String prenom, String code, String email, String photoPath, String password,
			boolean isExpiring, Date exipirationDate) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Code = code;
		this.email = email;
		this.photoPath = photoPath;
		this.password = password;
		this.isExpiring = isExpiring;
		this.exipirationDate = exipirationDate;
	}
	public User(Integer id, String nom, String prenom, String code, String email, String photoPath, String password,
			boolean isExpiring, Date exipirationDate) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		Code = code;
		this.email = email;
		this.photoPath = photoPath;
		this.password = password;
		this.isExpiring = isExpiring;
		this.exipirationDate = exipirationDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", Code=" + Code + ", email=" + email
				+ ", photoPath=" + photoPath + ", password=" + password + ", isExpiring=" + isExpiring
				+ ", exipirationDate=" + exipirationDate + "]";
	}
	

}
