package Bookstore;

import java.util.ArrayList;

public class Bookstore {
    //this class used to create a new Bookstore
    //private arraylists that contain the inventory for books, CDs, and DVDs
    private ArrayList<Book> bookInventory = new ArrayList<Book>();
    private ArrayList<CD> cdInventory = new ArrayList<CD>();
    private ArrayList<DVD> dvdInventory = new ArrayList<DVD>();
    
    //arraylist that contains all members currently registered 
    private ArrayList<Member> memberList = new ArrayList<>();

    //private arraylists that serve as shopping carts for each object available for purchase
    private ArrayList<Book> bookCart = new ArrayList<Book>();
    private ArrayList<CD> cdCart = new ArrayList<CD>();
    private ArrayList<DVD> dvdCart = new ArrayList<DVD>();

    //private variables that are used for getting the total for each cart
    private double bookCartTotal = 0.0;
    private double cdCartTotal = 0.0;
    private double dvdCartTotal = 0.0;
    private double purchaseTotal = 0.0;

    //bookstore constructor with 4 books, 4 cds, and 4 dvds, and 4 members
    public Bookstore(){

        bookInventory = new ArrayList<>();
        Book book1 = new Book("Como Agua Para Chocolate", "Laura Esquivel", 16.00, 1523);
        bookInventory.add(book1);
        Book book2 = new Book("Final Fantasy XIV : The Official Cookbook", "Victoria Rosenthal", 23.99, 8294);
        bookInventory.add(book2);
        Book book3 = new Book("Fire & Blood", "George R. R. Martin", 16.99, 4628);
        bookInventory.add(book3);
        Book book4 = new Book("Diary of a Wimpy Kid", "Jeff Kinney", 7.83, 9234);
        bookInventory.add(book4);

        cdInventory = new ArrayList<>();
        CD cd1 = new CD("Sin Miedo (del Amor y Otros Demonios)", "Kali Uchis", 13.98, 8239);
        cdInventory.add(cd1);
        CD cd2 = new CD("Nectar", "Joji", 11.98, 9252);
        cdInventory.add(cd2);
        CD cd3 = new CD("NieR : Automata Original Soundtrack", "Keiichi Okabe", 23.77, 2395);
        cdInventory.add(cd3);
        CD cd4 = new CD("YHLQMDLG", "Bad Bunny", 10.98, 2934);
        cdInventory.add(cd4);

        dvdInventory = new ArrayList<>();
        DVD dvd1 = new DVD("Shrek 2", "Andrew Adamson", 9.98, 2900);
        dvdInventory.add(dvd1);
        DVD dvd2 = new DVD("Moonrise Kingdom", "Wes Anderson", 10.23, 7293);
        dvdInventory.add(dvd2);
        DVD dvd3 = new DVD("Instructions Not Included", "Eugenio Derbez", 14.99, 5736);
        dvdInventory.add(dvd3);
        DVD dvd4 = new DVD("The Handmaiden", "Park Chan-wook", 23.23, 8968);
        dvdInventory.add(dvd4);

        memberList = new ArrayList<>();
        Member member1 = new Member("Martha", "mcorona02", "123abc","Paypal", true, 62.75, false);
        memberList.add(member1);
        Member member2 = new Member("Joe Mama", "whosJoe", "d33z", "Credit Card", false, 0.0, false);
        memberList.add(member2);
        Member member3 = new Member("Pitbull","mrWorldwide305", "f1reball", "Credit Card", true, 305.89, true);
        memberList.add(member3);
        Member member4 = new Member("2B", "yorha17", "2BorNot2B", "Paypal", true, 292.60, true);
        memberList.add(member4);

        //empty arraylists so that items that the user selects can be added
        bookCart = new ArrayList<>();
        cdCart = new ArrayList<>();
        dvdCart = new ArrayList<>();
    }

    //method for adding a book to the inventory
    public void addBook(String title, String author, double price, int ID){
        Book newBook = new Book(title, author, price, ID);
        bookCart.add(newBook);
    }

    //method for adding cd to the inventory 
    public void addCD(String title, String artist, double price, int ID){
        CD newCD = new CD(title, artist, price, ID);
        cdInventory.add(newCD);
    }

    //method for adding dvd to the inventory 
    public void addDVD(String title, String director, double price, int ID){
        DVD newDVD = new DVD(title, director, price, ID);
        dvdInventory.add(newDVD);
    }
    
    //method for removing book from inventory 
    public void removeBook(int searchID){
        for (int i = 0; i < bookInventory.size(); i++){
            if (bookInventory.get(i).getBookID() == searchID){
                bookInventory.remove(bookInventory.get(i));
            }
        }
    }

    //method for removing CD from inventory 
    public void removeCD(int searchID){
        for (int i = 0; i < cdInventory.size(); i++){
            if (cdInventory.get(i).getCDID() == searchID){
                cdInventory.remove(cdInventory.get(i));
            }
        }
    }

    //method for removing a DVD from inventory 
    public void removeDVD(int searchID){
        for (int i = 0; i < dvdInventory.size(); i++){
            if (dvdInventory.get(i).getDVDID() == searchID){
                dvdInventory.remove(dvdInventory.get(i));
            }
        }
    }

    //method for adding a book to its respective cart
    public void addBookToCart(int searchID){
        for (Book book : bookInventory){
            if (book.getBookID() == searchID){
                bookCart.add(book);
            }
        }
    }

    //method for adding a cd to its respective cart
    public void addCDToCart(int searchID){
        for (CD cd : cdInventory){
            if (cd.getCDID() == searchID){
                cdCart.add(cd);
            }
        }
    }

    //method for adding a dvd to its respective cart
    public void addDVDToCart(int searchID){
        for (DVD dvd : dvdInventory){
            if (dvd.getDVDID() == searchID){
                dvdCart.add(dvd);
            }
        }
    }

    //method for emptying book cart and adding back the books to inventory 
    public void emptyBookCart(){
        for (int i = 0; i < bookCart.size(); i++){
            bookInventory.add(bookCart.get(i));
            bookCart.remove(bookCart.get(i));
        }
    }

    //method for emptying cd cart and adding back cds to inventory 
    public void emptyCDCart(){
        for (int i = 0; i < cdCart.size(); i++){
            cdInventory.add(cdCart.get(i));
            cdCart.remove(cdCart.get(i));
        }
    }

    //method for emptying dvd cart and adding back dvds to inventory 
    public void emptyDVDCart(){
        for (int i = 0; i < dvdCart.size(); i++){
            dvdInventory.add(dvdCart.get(i));
            dvdCart.remove(dvdCart.get(i));
        }
    }

    //method for getting the total for book cart
    public double getBookCartTotal(){
        double total = 0;
        for (Book book : bookCart){
            double add = book.getBookPrice();
            total += add;
        } 
        this.bookCartTotal = total;
        return this.bookCartTotal;
    }

    //method for getting the total for cd cart
    public double getCDCartTotal(){
        double total = 0;
        for (CD cd : cdCart){
            double add = cd.getCDPrice();
            total += add;
        }
        this.cdCartTotal = total;
        return this.cdCartTotal;
    }

    //method for getting the total for the dvd cart
    public double getDVDCartTotal(){
        double total = 0;
        for (DVD dvd : dvdCart){
            double add = dvd.getDVDPrice();
            total += add;
        }
        this.dvdCartTotal = total;
        return this.dvdCartTotal;
    }

    //method for setting purchase total 
    public void setPurchaseTotal(){
        this.purchaseTotal = this.bookCartTotal + this.cdCartTotal + this.dvdCartTotal;
    }

    //method for getting purchase total
    public double getPurchaseTotal(){
        return this.purchaseTotal;
    }

    //method for getting book inventory list
    public ArrayList<Book> getBookInventory(){
        return this.bookInventory;
    }

    //method for getting cd inventory list
    public ArrayList<CD> getCDInventory(){
        return this.cdInventory;
    }

    //method for getting dvd inventory list
    public ArrayList<DVD> getDVDInventory(){
        return this.dvdInventory;
    }

    //method for getting shopping cart of books
    public ArrayList<Book> getBookCart(){
        return this.bookCart;
    }

    //method for getting shopping cart of cds
    public ArrayList<CD> getCDCart(){
        return this.cdCart;
    }

    //method for getting shopping cart of dvds
    public ArrayList<DVD> getDVDCart(){
        return this.dvdCart;
    }

    //method for getting member list
    public ArrayList<Member> getMemberList(){
        return this.memberList;
    }

    //method for adding a member to member list
    public void addMember(String name, String user, String pass, String payment, boolean premium, double total, boolean fee){
        Member newMember = new Member(name, user, pass, payment, premium, total, fee);
        memberList.add(newMember);
    }

    //check if username and password inputed are correct for an existing member 
    public boolean checkMemberCredentials(String user, String pass){
        for (Member member : memberList){
            if (member.getMemberUsername().equals(user) && member.getMemberPassword().equals(pass)){
                return true;
            }
        }
        return false;
    }

    //method for changing if member is premium or not using their credentials
    public void changeMembershipPremium(String user, String pass){
        for (int i = 0; i < memberList.size(); i++){
            if (memberList.get(i).getMemberUsername().equals(user) && memberList.get(i).getMemberPassword().equals(pass)){
                memberList.get(i).setToPremium(true);
            }
        }
    }

    //method for changing membership back to free using member's credentials
    public void removePremium(String user, String pass){
        for (int i = 0; i < memberList.size(); i++){
            if (memberList.get(i).getMemberUsername().equals(user) && memberList.get(i).getMemberPassword().equals(pass)){
                memberList.get(i).setToPremium(false);
            }
        }
    }

    //method for changing fee to paid using user's credentials
    public void makeFeePaid(String user, String pass){
        for (int i = 0; i < memberList.size(); i++){
            if (memberList.get(i).getMemberUsername().equals(user) && memberList.get(i).getMemberPassword().equals(pass)){
                memberList.get(i).setFeePaid(true);
            }
        }
    }

    //method for if the fee is paid searching for the user with their credentials
    public boolean checkFeePaid(String user, String pass){
        boolean feeCheck = false;
        for (int i = 0; i < memberList.size(); i++){
            if (memberList.get(i).getMemberUsername().equals(user) && memberList.get(i).getMemberPassword().equals(pass)){
                boolean getFeePaid = memberList.get(i).isFeePaid();
                feeCheck = getFeePaid;
                return feeCheck;
            }
        }
        return feeCheck;
    }

    //method for getting total spent by user using their credentials
    public double getHowMuchSpent(String user, String pass){
        double total = 0.0;
        for (int i = 0; i < memberList.size(); i++){
            if (memberList.get(i).getMemberUsername().equals(user) && memberList.get(i).getMemberPassword().equals(pass)){
                double calcTotal = memberList.get(i).getTotalSpent();
                total += calcTotal;
                return total;
            }
        }
        return total;
    }

    //method for getting user's name using their credentials
    public String getUsersName(String user, String pass){
        String name = null;
        for (int i = 0; i < memberList.size(); i++){
            if (memberList.get(i).getMemberUsername().equals(user) && memberList.get(i).getMemberPassword().equals(pass)){
                String tempName = memberList.get(i).getMemberName();
                name = tempName;
                return name;
            }
        }
        return name;
    }

    //method for getting whether a user is premium or not with their credentials
    public boolean getIfPremium(String user, String pass){
        boolean premiumCheck = false;
        for (int i = 0; i < memberList.size(); i++){
            if (memberList.get(i).getMemberUsername().equals(user) && memberList.get(i).getMemberPassword().equals(pass)){
                boolean premiumChecked = memberList.get(i).isPremium();
                premiumCheck = premiumChecked;
                return premiumCheck;
            }
        }
        return premiumCheck;
    }

    //method for emptying cart after purchase so it doesn't return the items purchased back to 
    //their inventories
    public void emptyBookCartAfterPurchase(){
        for (int i = 0; i < bookCart.size(); i++){
            bookCart.remove(bookCart.get(i));
        }
    }

    public void emptyCDCartAfterPurchase(){
        for (int i = 0; i < cdCart.size(); i++){
            cdCart.remove(cdCart.get(i));
        }
    }

    public void emptyDVDCartAfterPurchase(){
        for (int i = 0; i < dvdCart.size(); i++){
            dvdCart.remove(dvdCart.get(i));
        }
    }

    //method for adding to total spent by user using their credentials
    public double addToTotal(String user, String pass, double calcTotal){
        double findTotal = 0.0;
        for (int i = 0; i < memberList.size(); i++){
            if (memberList.get(i).getMemberUsername().equals(user) && memberList.get(i).getMemberPassword().equals(pass)){
                double pastTotal = memberList.get(i).getTotalSpent();
                double newTotal = pastTotal + calcTotal;
                memberList.get(i).setTotalSpent(newTotal);
                findTotal = newTotal;
                return findTotal;
            }
        }
        return findTotal;
    }

}
