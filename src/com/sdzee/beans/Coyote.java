package com.sdzee.beans;
public class Coyote 
{
	private String nom;
	private String prenom; 
	private boolean genius;
	
	public String getNom() {
		return this.nom; 
	}
	public String getPrenom() {
		return this.prenom; 
	}
	public boolean isGenius() {
		return this.genius; 
	}
	public void setNom( String nom ) {
		this.nom = nom; 
	}
	public void setPrenom( String prenom ) {
		this.prenom = prenom; 
	}
	public void setGenius( boolean genius ) {
		this.genius = true; 
	}
}
