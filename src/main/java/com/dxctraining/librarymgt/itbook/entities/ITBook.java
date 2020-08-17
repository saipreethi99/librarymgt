package com.dxctraining.librarymgt.itbook.entities;

import javax.persistence.Entity;

import com.dxctraining.librarymgt.book.entities.Author;
import com.dxctraining.librarymgt.book.entities.Book;

@Entity
public class ITBook extends Book {

    private double version;

    public ITBook(String name,double cost,Author author,double version){
    	  super(name, cost, author);
        this.version=version;
    }

    public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}


    @Override
    public boolean equals(Object arg) {
  		if(this==arg) {
  			return true;
  		}

  	   if(arg==null || !(arg instanceof ITBook) ) {
  			return false;
  	   }

  	    ITBook that=(ITBook)arg;	
  		boolean isequal=this.getId()==that.getId();
  		return isequal;
  	}

      @Override
      public int hashCode(){
  	
  		return getId();
  		}

  }