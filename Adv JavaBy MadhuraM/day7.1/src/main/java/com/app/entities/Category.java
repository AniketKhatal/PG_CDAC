package com.app.entities;

import javax.persistence.*;

@Entity
@Table(name="catagories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name",unique=true,length=50,nullable=false)
	private String name;
	
	@Column(name="description",length=200)
	private String descrition;
	
	public Category(String next, String next2) {
		// TODO Auto-generated constructor stub
	}

	//Getter And Setter
	public Long getId() {
		return id;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrition() {
		return descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", descrition=" + descrition + "]";
	}

	public Category() {
					
	}
	
	
}
