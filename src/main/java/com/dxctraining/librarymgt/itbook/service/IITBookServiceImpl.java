package com.dxctraining.librarymgt.itbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.librarymgt.itbook.dao.IITBookDao;
import com.dxctraining.librarymgt.itbook.entities.ITBook;

@Transactional
@Service
public class IITBookServiceImpl implements IITBookService {

    @Autowired
    private IITBookDao dao;

    public ITBook save( ITBook itBook) {
    	itBook= dao.save(itBook);
        return itBook;
    }

    public  ITBook findById(int id) {
       ITBook itBook = dao.findById(id);
        return itBook;
    }

	
}