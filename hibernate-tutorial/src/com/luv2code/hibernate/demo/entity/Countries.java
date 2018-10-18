package com.luv2code.hibernate.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COUNTRIES", schema = "hr")
public class Countries {
	
	 
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="COUNTRY_ID")
	private String COUNTRY_ID;
     
     @Column(name="COUNTRY_NAME")
	private String COUNTRY_NAME;
     @Column(name="REGION_ID")
	private Integer REGION_ID;
     
     
    public  Countries() {
		
	}
     
     public Countries(String cOUNTRY_ID, String cOUNTRY_NAME, Integer rEGION_ID) {
 		
 		this.COUNTRY_ID = cOUNTRY_ID;
 		this.COUNTRY_NAME = cOUNTRY_NAME;
 		this.REGION_ID = rEGION_ID;
 	}
     
     public String getCOUNTRY_ID() {
		return COUNTRY_ID;
	}
	public void setCOUNTRY_ID(String cOUNTRY_ID) {
		this.COUNTRY_ID = cOUNTRY_ID;
	}
	public String getCOUNTRY_NAME() {
		return COUNTRY_NAME;
	}
	public void setCOUNTRY_NAME(String cOUNTRY_NAME) {
		this.COUNTRY_NAME = cOUNTRY_NAME;
	}
	public Integer getREGION_ID() {
		return REGION_ID;
	}
	public void setREGION_ID(Integer rEGION_ID) {
		this.REGION_ID = rEGION_ID;
	}
     
     

}
