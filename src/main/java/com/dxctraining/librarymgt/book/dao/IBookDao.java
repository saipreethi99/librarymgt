package com.dxctraining.librarymgt.book.dao;

import com.dxctraining.librarymgt.book.entities.Book;

public interface IBookDao {

	Book findById(int id);
	Book update(Book book);

	void add(Book book);

	Book updateCost(int id, double cost);

	void remove(int id);

}