package Bookstore;

public class Member {
    //private variables used when creating the member object like the member name, username, password,
    //payment type, whether the member is premium, how much money has been spent, and if the fee is paid
    private String memberName = null;
    private String username = null;
    private String password = null;
    private String paymentType = null;
    private boolean premium = false;
    private double moneySpent = 0.0;
    private boolean feePaid = false;

    //constructor for member
    public Member(String name, String user, String pass, String payment, boolean isPremium, double totalSpent, boolean fee){
        this.memberName = name;
        this.username = user;
        this.password = pass;
        this.paymentType = payment;
        this.premium = isPremium;
        this.moneySpent = totalSpent;
        this.feePaid = fee;
    }

    //setter for member name
    public void setMemberName(String name){
        memberName = name;
    }

    //setter for member username
    public void setMemberUsername(String user){
        username = user;
    }

    //setter for member password
    public void setMemberPassword(String pass){
        password = pass;
    }

    //setter for the member payment type
    public void setMemberPayment(String payMethod){
        paymentType = payMethod;
    }

    //setter for if a member is premium
    public void setToPremium(boolean isPremium){
        premium = isPremium;
    }

    //setter for total money spent by member
    public void setTotalSpent(double total){
        moneySpent = total;
    }

    //setter for if fee is paid
    public void setFeePaid(boolean paid){
        feePaid = paid;
    }

    //getter for member name
    public String getMemberName(){
        return this.memberName;
    }

    //getter for member username
    public String getMemberUsername(){
        return this.username;
    }

    //getter for member password
    public String getMemberPassword(){
        return this.password;
    }

    //getter for member payment type
    public String getMemberPaymentType(){
        return this.paymentType;
    }

    //getter for whether member is premium or not
    public boolean isPremium(){
        return this.premium;
    }

    //getter for total spent by member
    public double getTotalSpent(){
        return this.moneySpent;
    }

    //getter for if the fee is paid
    public boolean isFeePaid(){
        return this.feePaid;
    }

}
