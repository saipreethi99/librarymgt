package com.dxctraining.librarymgt.fictionbook.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.dxctraining.librarymgt.fictionbook.entities.FictionBook;

@Repository
public class FictionBookDaoImpl implements IFictionBookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public FictionBook save(FictionBook fictionBook) {
        fictionBook = entityManager.merge(fictionBook);
        return fictionBook;
    }

    @Override
    public FictionBook findById(int id) {
       FictionBook fBook = entityManager.find(FictionBook.class, id);
        return fBook;
    }

	
}
