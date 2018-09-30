package com.luv2code.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud")
public class Stud {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="id")
  private int id;
 
  @Column(name="name")
  private String name;
  @Column(name="roll")
  private String roll;
  
  @Column(name="`div`")
  private String div;
	public Stud()
  {}
	
	
	public Stud(String studname, String rollno, String divion) {
		
		this.name = studname;
		this.roll = rollno;
		this.div = divion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStudname() {
		return name;
	}


	public void setStudname(String studname) {
		this.name = studname;
	}


	public String getRollno() {
		return roll;
	}


	public void setRollno(String rollno) {
		this.roll = rollno;
	}


	public String getDivion() {
		return div;
	}


	public void setDivion(String divion) {
		this.div = divion;
	}

}
