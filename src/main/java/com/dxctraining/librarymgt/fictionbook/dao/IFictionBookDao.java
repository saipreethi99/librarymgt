package com.dxctraining.librarymgt.fictionbook.dao;

import com.dxctraining.librarymgt.fictionbook.entities.FictionBook;

public interface IFictionBookDao {
       
	 FictionBook save(FictionBook fictionBook);
   
	 FictionBook findById(int id);
   
   
   
}