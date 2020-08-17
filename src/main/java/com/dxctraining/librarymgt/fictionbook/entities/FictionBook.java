package com.dxctraining.librarymgt.fictionbook.entities;

import javax.persistence.Entity;

import com.dxctraining.librarymgt.book.entities.Author;
import com.dxctraining.librarymgt.book.entities.Book;

@Entity
public class FictionBook extends Book {

    private String fictionBookName;

    public FictionBook(){

    }
    public FictionBook(String name,double cost,Author author,String fictionBookName){
        super(name, cost, author);
        this.fictionBookName=fictionBookName;
    }


    public String getFictionBookName() {
		return fictionBookName;
	}
	public void setFictionBookName(String fictionBookName) {
		this.fictionBookName = fictionBookName;
	}
	@Override
    public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}

	   if(arg==null || !(arg instanceof FictionBook) ) {
			return false;
	   }

	    FictionBook that=(FictionBook)arg;	
		boolean isequal=this.getId()==that.getId();
		return isequal;
	}

    @Override
    public int hashCode(){
	return getId();
		}

}