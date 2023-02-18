package Bookstore;

public class DVD {
    //private variables for the title of the dvd, the director, the price, and the ID of the DVD
    private String dvdTitle = null;
    private String dvdDirector = null;
    private double dvdPrice =  0.0;
    private int dvdID = 0;

    //constructor for DVD object
    public DVD(String title, String director, double price, int ID){
        this.dvdTitle = title;
        this.dvdDirector = director;
        this.dvdPrice = price;
        this.dvdID = ID;
    }

    //setter for the DVD title
    public void setDVDTitle(String title){
        dvdTitle = title;
    }

    //setter for the DVD director
    public void setDVDDirector(String director){
        dvdDirector = director;
    }

    //setter for the DVD price
    public void setDVDPrice(double price){
        dvdPrice = price;
    }

    //setter for the DVD ID
    public void setDVDID(int ID){
        dvdID = ID;
    }

    //getter for the DVD title
    public String getDVDTitle(){
        return this.dvdTitle;
    }

    //getter for the DVD director
    public String getDVDDirector(){
        return this.dvdDirector;
    }

    //getter for the DVD price
    public double getDVDPrice(){
        return this.dvdPrice;
    }

    //getter for the DVD ID
    public int getDVDID(){
        return this.dvdID;
    }

    //toString method that prints out book info
    public String toString(){
        return "\n" + this.dvdTitle + " directed by " + this.dvdDirector + " Price : $" + this.dvdPrice + " ID : " + this.dvdID;
    }
    
}
