package Bookstore;

public class CD {
    //private variables for the name of the album, the artist, the price, and the ID of the CD
    private String cdTitle = null;
    private String cdArtist = null;
    private double cdPrice = 0.0;
    private int cdID = 0;

    //constructor for CD object
    public CD(String title, String artist, double price, int ID){
        this.cdTitle = title;
        this.cdArtist = artist;
        this.cdPrice = price;
        this.cdID = ID;
    }

    //setter for the CD title
    public void setCDTitle(String title){
        cdTitle = title;
    }

    //setter for the CD artist
    public void setCDArtist(String artist){
        cdArtist = artist;
    }

    //setter for the price of the CD
    public void setCDPrice(double price){
        cdPrice = price;
    }

    //setter for the CD ID
    public void setCDID(int ID){
        cdID = ID;
    }

    //getter for the CD title
    public String getCDTitle(){
        return this.cdTitle;
    }

    //getter for the CD artist
    public String getCDArtist(){
        return this.cdArtist;
    }

    //getter for the CD price
    public double getCDPrice(){
        return this.cdPrice;
    }

    //getter for the CD ID
    public int getCDID(){
        return this.cdID;
    }

    //toString method for printing CD info
    public String toString(){
        return "\n" + this.cdTitle + " - " + this.cdArtist + " Price : $" + this.cdPrice + " ID : " + this.cdID;
    }


}
