package com.dxctraining.librarymgt.itbook.service;


import com.dxctraining.librarymgt.itbook.entities.ITBook;

public interface IITBookService {

    ITBook save(ITBook itBook);

	ITBook findById(int id);


}
