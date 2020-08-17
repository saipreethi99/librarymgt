package com.dxctraining.librarymgt.fictionbook.service;

import com.dxctraining.librarymgt.fictionbook.entities.FictionBook;

public interface IFictionBookService {
       
	 FictionBook save( FictionBook fictionBook);
   
	 FictionBook findById(int id);
   
   
   
}