package com.dxctraining.librarymgt.itbook.dao;

import com.dxctraining.librarymgt.itbook.entities.ITBook;

public interface IITBookDao {


    ITBook save(ITBook itBook);

      ITBook findById(int id);


}