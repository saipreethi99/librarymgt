package com.dxctraining.librarymgt.book.entities;

import javax.persistence.*;

import com.dxctraining.book.entities.Author;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Book {

    @Id
    @GeneratedValue
    private int id;
	private String name;
	private double cost;

    @ManyToOne
	private Author author;

    public Book() {

    }

    public Book(String name,double cost,Author author) {
		
		this.name=name;
		this.cost=cost;
		this.author=author;
	}

  
   
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}

	   if(arg==null || !(arg instanceof Book) ) {
			return false;
	   }

	    Book that=(Book)arg;	
		boolean isequal=this.id==that.id;
		return isequal;
	}

    @Override
    public int hashCode(){
		return id;
		}
	
}