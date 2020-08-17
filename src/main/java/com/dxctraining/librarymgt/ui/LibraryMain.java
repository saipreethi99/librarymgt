package com.dxctraining.librarymgt.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dxctraining.librarymgt.config.JavaConfig;

public class LibraryMain {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();

    }

}