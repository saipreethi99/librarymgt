package com.dxctraining.librarymgt.book.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Authors")
//@Inheritance(strategy = InheritanceType.JOINED)
public class Author {
	
	@Id
	@GeneratedValue
	private String id;
	private String name;

	public Author( String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object arg) {
		if (this == arg) {
			return true;
		}

		if (arg == null || !(arg instanceof Author)) {
			return false;
		}

		Author that = (Book) arg;
		boolean isequal = this.getId.equals(that.getId());
		return isequal;
	}

	@Override
	public int hashCode() {
	int hash=getId().hashCode();
	return id;
	}
}