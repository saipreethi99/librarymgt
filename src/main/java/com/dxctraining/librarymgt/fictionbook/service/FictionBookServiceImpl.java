package com.dxctraining.librarymgt.fictionbook.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.fictionbook.dao.IFictionBookDao;
import com.dxctraining.fictionbook.entities.FictionBook;

@Transactional
@Service
public class FictionBookServiceImpl implements IFictionBookService {

    @Autowired
    private IFictionBookDao dao;

    @Override
    public FictionBook save( FictionBook fictionBook) {
       fictionBook = dao.save(fictionBook);
        return fictionBook;
    }
    public  FictionBook findById(int id) {
    	 FictionBook fictionBook = dao.findById(id);
        return fictionBook;
    }
}