/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoremanager;

public class GiftWrappedBook extends BookDecorator {
    public GiftWrappedBook(Book book) {
        super(book);
    }
    
    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public Author getAuthor() {
        return super.getAuthor();
    }
    
    @Override
    public double getPrice() {
        return super.getPrice() + 5; // Adding $5 for gift wrapping
    }
    @Override
    public String getBookType(){
        return super.getBookType();
        
    }
}

