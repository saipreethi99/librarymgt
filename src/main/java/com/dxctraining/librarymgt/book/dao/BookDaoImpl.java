package com.dxctraining.librarymgt.book.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.dxctraining.librarymgt.book.entities.Book;
import com.dxctraining.librarymgt.exceptions.BookNotFoundException;

@Repository
public class BookDaoImpl implements IBookDao{

    @PersistenceContext
    private EntityManager entityManager;
 

    @Override
    public Book findById(int id) {
        Book book=entityManager.find(Book.class,id);
        if(book==null){
            throw new BookNotFoundException("book not found for id="+id);
        }
        return book;
    }

    public Book update(Book book) {
        book=entityManager.merge(book);
        return book;
    }

    @Override
    public void add(Book book) {
        entityManager.persist(book);//insertion
        
    }

    public void remove(int id) {
     Book book= findById(id) ;
     entityManager.remove(book);
    }
    

	@Override
	public Book updateCost(int id, double cost) {
		 Book book= findById(id) ;
		//book.setCost(cost);
	      entityManager.merge(cost);
		return book;
	}


}