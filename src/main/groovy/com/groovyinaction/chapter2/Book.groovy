package com.groovyinaction.chapter2


class Book {
    private String title
    Book (String theTitle) {
        title = theTitle
    }
    String getTitle(){
        return title
    }
}