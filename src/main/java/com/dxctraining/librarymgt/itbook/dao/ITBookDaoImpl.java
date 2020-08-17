package com.dxctraining.librarymgt.itbook.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.dxctraining.librarymgt.itbook.entities.ITBook;

@Repository
public class ITBookDaoImpl implements IITBookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ITBook save(ITBook itBook) {
        itBook= entityManager.merge(itBook);
        return itBook;
    }

    @Override
    public ITBook findById(int id) {
        ITBook itBook = entityManager.find(ITBook.class, id);
        return itBook;
    }
}