/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoremanager;

public abstract class BookDecorator implements Book {
    protected Book Decoratedbook;

    public BookDecorator(Book book) {
        this.Decoratedbook = book;
    }

    @Override
    public String getTitle() {
        return Decoratedbook.getTitle();
    }

    @Override
    public Author getAuthor() {
        return Decoratedbook.getAuthor();
    }

    @Override
    public double getPrice() {
        return Decoratedbook.getPrice();
    }
    @Override
    public String getBookType(){
        return Decoratedbook.getBookType();
        
    }
}
