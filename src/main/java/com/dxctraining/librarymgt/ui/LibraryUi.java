package com.dxctraining.librarymgt.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.librarymgt.book.entities.Author;
import com.dxctraining.librarymgt.exceptions.BookNotFoundException;
import com.dxctraining.librarymgt.exceptions.InvalidArgumentException;
import com.dxctraining.librarymgt.fictionbook.entities.FictionBook;
import com.dxctraining.librarymgt.fictionbook.service.IFictionBookService;
import com.dxctraining.librarymgt.itbook.entities.ITBook;
import com.dxctraining.librarymgt.itbook.service.IITBookService;

@Component
public class LibraryUi {
    @Autowired
    private IITBookService itBookService;

    @Autowired
    private IFictionBookService fictionService;


    @PostConstruct
    public void runUi() {
        try {
        	Author author1=new Author("preethi");
        	Author author2=new Author("sai");

        	ITBook itBook = new ITBook("book1",555.55,author1,5.1);
        	itBook=itBookService.save(itBook);

        	FictionBook fictionBook = new FictionBook("science", 222.22,author2,"junit");
            	fictionBook =fictionService.save(fictionBook);

            int itBookId1 = itBook.getId();
            ITBook fetcheitBook1 = itBookService.findById(itBookId1);
            System.out.println("fetched book =" + fetcheitBook1.getName() + " " + fetcheitBook1.getCost() + " " + fetcheitBook1.getAuthor());

            System.out.println("version used=" + fetcheitBook1.getVersion());


        } catch (BookNotFoundException e) {
            e.printStackTrace();
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
    }


}