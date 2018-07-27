package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int pages;
    private String publishingHouse;

    public Book (String titleParameter, String authorParameter, int pagesParameter, String publishingHouseParameter){
        this.title = titleParameter;
        this.author = authorParameter;
        setPages(pagesParameter);
        this.publishingHouse = publishingHouseParameter;

    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString(){
        return "Tytuł książki: " + title + ". Autor książki: " + author + ". Liczba stron: " + pages + ". Wydawnictwo: " + publishingHouse + ".";
    }

}
