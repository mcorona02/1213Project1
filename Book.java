package Bookstore;

public class Book {
    //private variables for the title of the book, the author, the price, and the ID of the book
    private String bookTitle = null;
    private String bookAuthor = null;
    private double bookPrice = 0.0;
    private int bookID = 0;

    //constructor for the Book object
    public Book(String title, String author, double price, int ID){
        this.bookTitle = title;
        this.bookAuthor = author;
        this.bookPrice = price;
        this.bookID = ID;
    }

    //setter for the title of the book
    public void setBookTitle(String title){
        bookTitle = title;
    }

    //setter for the author of the book
    public void setBookAuthor(String author){
        bookAuthor = author;
    }

    //setter for the price of the book
    public void setBookPrice(double price){
        bookPrice = price;
    }

    //setter for the book ID
    public void setBookID(int ID){
        bookID = ID;
    }

    //getter for the title of the book
    public String getBookTitle(){
        return this.bookTitle;
    }

    //getter for the author of the book
    public String getBookAuthor(){
        return this.bookAuthor;
    }

    //getter for the price of the book
    public double getBookPrice(){
        return this.bookPrice;
    }

    //getter for the book ID
    public int getBookID(){
        return this.bookID;
    }

    //toString method to print out book information 
    public String toString(){
        return "\n" + this.bookTitle + " by " + this.bookAuthor + " Price : $" + this.bookPrice + " ID : " + this.bookID; 
    }
    
}
