package Bookstore;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Bookstore newBookstore = new Bookstore();
        Scanner scnr = new Scanner(System.in);
        mainMenu : while (true){
            System.out.println("\nPlease select from one of the following options : ");
            System.out.println("\t 1. Shop");
            System.out.println("\t 2. Manage membership");
            System.out.println("\t 3. Check out cart");
            System.out.println("\t 4. Exit");

            int choice = scnr.nextInt();

            switch (choice){
                case 1 : 
                shopMenu : while (true){
                    System.out.println("Please select from one of the following options : ");
                    System.out.println("\t 1. Purchase book(s)");
                    System.out.println("\t 2. Purchase CD(s)");
                    System.out.println("\t 3. Purchase DVD(s)");
                    System.out.println("\t 4. Return to menu");

                    int purchaseChoice = scnr.nextInt();

                    switch (purchaseChoice){
                        case 1 :
                            bookMenu : while (true){
                                System.out.println("Please select one of the following options : ");
                                System.out.println("\t 1. Display all books");
                                System.out.println("\t 2. Add book(s) to cart");
                                System.out.println("\t 3. Return to menu");

                                int bookMenuChoice = scnr.nextInt();

                                switch (bookMenuChoice){
                                    case 1 : 
                                        System.out.println("Books currently in stock : ");
                                        System.out.println(newBookstore.getBookInventory().toString());
                                        continue bookMenu;
                                    case 2 : 
                                        //takes user's input to add book to cart as long as the ID matches what the user input
                                        System.out.println("Enter the ID number of the book you would like to add to your cart : ");
                                        int bookToBuy = scnr.nextInt();
                                        //adds book to cart and then removes it from the inventory
                                        newBookstore.addBookToCart(bookToBuy);
                                        newBookstore.removeBook(bookToBuy);
                                        System.out.println("Added to cart! Books currently in your cart :");
                                        System.out.println(newBookstore.getBookCart().toString());
                                        continue bookMenu;
                                    case 3 : 
                                    continue shopMenu;

                                }
                            }
                        
                        case 2 :
                            cdMenu : while (true){
                                System.out.println("Please select one of the following options : ");
                                System.out.println("\t 1. Display all CDs");
                                System.out.println("\t 2. Add CD(s) to cart");
                                System.out.println("\t 3. Return to menu");

                                int cdMenuChoice = scnr.nextInt();

                                switch (cdMenuChoice){
                                    case 1 : 
                                        System.out.println("CDs currently in stock : ");
                                        System.out.println(newBookstore.getCDInventory().toString());
                                        continue cdMenu;
                                    case 2 :
                                        //takes user's input to add CD to cart as long as the ID matches what the user input
                                        System.out.println("Enter the ID number for the CD you would like to add to your cart : ");
                                        int cdToBuy = scnr.nextInt();
                                        //adds CD to cart and then removes it from the inventory
                                        newBookstore.addCDToCart(cdToBuy);
                                        newBookstore.removeCD(cdToBuy);
                                        System.out.println("Added to cart! CDs currently in your cart : ");
                                        System.out.println(newBookstore.getCDCart().toString());
                                        continue cdMenu;
                                    case 3 :
                                        continue shopMenu;
                                }
                            }
                        case 3 : 
                            dvdMenu : while (true){
                                System.out.println("Please select one of the follwoing options : ");
                                System.out.println("\t 1. Display all DVDs");
                                System.out.println("\t 2. Add DVD(s) to cart");
                                System.out.println("\t 3. Return to menu");

                                int dvdMenuChoice = scnr.nextInt();

                                switch (dvdMenuChoice){
                                    case 1 :
                                        System.out.println("DVDs currently in stock : ");
                                        System.out.println(newBookstore.getDVDInventory().toString());
                                        continue dvdMenu;
                                    case 2 :
                                        //takes user's input to add DVD to cart as long as the ID matches what the user input
                                        System.out.println("Enter the ID number for the DVD you would like to add your cart : ");
                                        int dvdToBuy = scnr.nextInt();
                                        //adds DVD to cart and then removes it from the inventory
                                        newBookstore.addDVDToCart(dvdToBuy);
                                        newBookstore.removeDVD(dvdToBuy);
                                        System.out.println("Added to cart! DVDs currently in your cart : ");
                                        System.out.println(newBookstore.getDVDCart().toString());
                                        continue dvdMenu;
                                    case 3 :
                                        continue shopMenu;
                                }
                            }
                        case 4 : 
                            continue mainMenu;
                    }

                }
                case 2 :
                    memberMenu : while (true){
                        System.out.println("Please select from one of the following options : ");
                        System.out.println("\t 1. Create a new account");
                        System.out.println("\t 2. Switch to premium or return to free account");
                        System.out.println("\t 3. Check if your fee is paid (Premium)");
                        System.out.println("\t 4. Find out how much you've spent!");
                        System.out.println("\t 5. Return to menu");

                        int memberChoice = scnr.nextInt();

                        switch (memberChoice){
                            case 1 : 
                                //takes user input to create a new account
                                System.out.println("To create an account please enter your name : ");
                                String nameOfUser = scnr.next();
                                scnr.next();
                                System.out.println("Create a username for your account : ");
                                String inUsername = scnr.next();
                                System.out.println("Create a password : ");
                                String inPassword = scnr.next();
                                System.out.println("Enter the payment type to use for all future purchases : ");
                                String inPayment = scnr.next();
                                System.out.println("Would you like to pay a monthly fee of $10 for a discount on all purchases? Y/N ");
                                boolean premium = false;
                                boolean payFee = false;
                                char letter = scnr.next().charAt(0);
                                if (letter == 'Y' || letter == 'Y'){
                                    premium = true;
                                    payFee = false;
                                    newBookstore.addMember(nameOfUser, inUsername, inPassword, inPayment, premium, 0, payFee);
                                    System.out.println("Thank you for creating an account " + nameOfUser + "!");
                                    continue memberMenu;
                                }
                                else{
                                    newBookstore.addMember(nameOfUser, inUsername, inPassword, inPayment, premium, 0 , payFee);
                                    System.out.println("Thank you for creating an account " + nameOfUser + "!");
                                    continue memberMenu;
                                }
                            case 2 : 
                                manageMembership : while (true){
                                    System.out.println("Select on of the following : ");
                                    System.out.println("\t 1. Purchase premium membership");
                                    System.out.println("\t 2. Cancel premium membership");
                                    System.out.println("\t 3. About premium membership");
                                    System.out.println("\t 4. Return to menu");

                                    int membershipManagement = scnr.nextInt();

                                    switch (membershipManagement){
                                        case 1 : 
                                            System.out.println("To get started with your premium membership, enter your username : ");
                                            String inUser = scnr.next();
                                            System.out.println("Now enter your password : ");
                                            String inPass = scnr.next();
                                            boolean logInCorrect = newBookstore.checkMemberCredentials(inUser, inPass);
                                            if (logInCorrect == true){
                                                newBookstore.changeMembershipPremium(inUser, inPass);
                                                System.out.println("Membership changed to premium. Thank you for your purchase!");
                                                continue memberMenu;
                                            }
                                            else{
                                                System.out.println("Password and/or username incorrect. Please enter both again");
                                                continue manageMembership;
                                            }
                                        case 2 :
                                            System.out.println("To cancel your membership please enter your username");
                                            String inputUser = scnr.next();
                                            System.out.println("Now enter your password : ");
                                            String inputPass = scnr.next();
                                            boolean credentialsCorrect = newBookstore.checkMemberCredentials(inputUser, inputPass);
                                            if (credentialsCorrect == true){
                                                newBookstore.removePremium(inputUser, inputPass);
                                                System.out.println("Membership type back to normal.");
                                                continue memberMenu;
                                            }
                                            else{
                                                System.out.println("Password and/or username incorrect. Please enter both again.");
                                                continue manageMembership;
                                            }
                                        case 3 :
                                            System.out.println("Purchasing a premium membership makes all future purchases 15% off. \nFor a fee of $10 a month, you also get early access to new books, CDs, and DVDs!");
                                            continue manageMembership;
                                        case 4 : 
                                        continue memberMenu;
                                    }
                                }  
                            case 3 : 
                                System.out.println("To check if your fee is paid, start by entering your username : ");
                                String checkUser = scnr.next();
                                System.out.println("Now enter your password");
                                String checkPass = scnr.next();
                                boolean checkUserPass = newBookstore.checkFeePaid(checkUser, checkPass);
                                if (checkUserPass == true){
                                    if (newBookstore.checkFeePaid(checkUser, checkPass) == true){
                                        System.out.println("Fee has already been paid.");
                                    }
                                    else{
                                        System.out.println("Fee has not been paid. Make sure to pay fee when checking out cart.");
                                    }
                                    continue memberMenu;
                                }
                                else{
                                    System.out.println("Password and/or username incorrect. Please enter both again.");
                                    continue memberMenu;
                                }
                            case 4 : 
                                System.out.println("To find out how much you've spent in total, start by entering your username : ");
                                String getUser = scnr.next();
                                System.out.println("Now enter your password : ");
                                String getPass = scnr.next();
                                boolean checkLogIn = newBookstore.checkMemberCredentials(getUser, getPass);
                                if (checkLogIn == true){
                                    double spent = newBookstore.getHowMuchSpent(getUser, getPass);
                                    System.out.println("You have spent a total of : $" + spent);
                                    continue memberMenu;
                                }          
                                else{
                                    System.out.println("Password and/or username incorrect. Please enter both again.");
                                }
                            case 5 : 
                                continue mainMenu;
                        }
                    }
                case 3 :
                    System.out.println("Plese keep in mind that you need an account to make a purchase. \nIf you don't have an account, select 'Manage membership' from the main menu.");
                    checkOutMenu : while (true){
                        System.out.println("Please select one of the following : ");
                        System.out.println("\t 1. See items in cart");
                        System.out.println("\t 2. Empty cart");
                        System.out.println("\t 3. Complete purchase");
                        System.out.println("\t 4. Return to main menu");

                        int checkOutChoice = scnr.nextInt();

                        switch (checkOutChoice){
                            case 1 : 
                                System.out.println("Items currently in cart : \n" + newBookstore.getBookCart().toString() + "\n" + newBookstore.getCDCart().toString() + "\n" + newBookstore.getDVDCart().toString());
                                continue checkOutMenu;
                            case 2 : 
                                newBookstore.emptyBookCart();
                                newBookstore.emptyCDCart();
                                newBookstore.emptyDVDCart();
                                if (newBookstore.getBookCart().isEmpty() && newBookstore.getCDCart().isEmpty() && newBookstore.getDVDCart().isEmpty()){
                                    System.out.println("Your cart is now empty");
                                    continue checkOutMenu;
                                }
                                else{
                                    continue checkOutMenu;
                                }
                            case 3 :
                                System.out.println("To complete your purchase, please enter your username : ");
                                String purchaseUser = scnr.next();
                                System.out.println("Now enter your password : ");
                                String purchasePass = scnr.next();
                                boolean readyForPurchase = newBookstore.checkMemberCredentials(purchaseUser, purchasePass);
                                double totalAmountDue = newBookstore.getBookCartTotal() + newBookstore.getCDCartTotal() + newBookstore.getDVDCartTotal();
                                if (readyForPurchase == true){
                                    System.out.println("The items in your cart are : \n" + newBookstore.getBookCart().toString() + "\n" + newBookstore.getCDCart().toString() + "\n" + newBookstore.getDVDCart().toString());
                                    if(newBookstore.getIfPremium(purchaseUser, purchasePass) == true){
                                        System.out.println("The total for your purchase is : $" + totalAmountDue);
                                        if(newBookstore.checkFeePaid(purchaseUser, purchasePass) == true){
                                            totalAmountDue = totalAmountDue - (totalAmountDue * .15);
                                            System.out.println("Your total after premium membership discount is applied is : $" + totalAmountDue);
                                            System.out.println("Thank you for your purchase!");
                                            newBookstore.emptyBookCartAfterPurchase();
                                            newBookstore.emptyCDCartAfterPurchase();
                                            newBookstore.emptyDVDCartAfterPurchase();
                                            double returnCartTotal = newBookstore.addToTotal(purchaseUser, purchasePass, totalAmountDue);
                                            System.out.println("You have spent a total of : $" + returnCartTotal + " in our bookstore!");
                                            continue mainMenu;
                                        }
                                        else{
                                            System.out.println("The total for your purchase is : $" + totalAmountDue);
                                            System.out.println("Our records indicate that your fee for your premium membership has not been paid. Would you like to pay it now? Y/N");
                                            char feePay = scnr.next().charAt(0);
                                            if (feePay == 'Y' || feePay == 'y'){
                                                newBookstore.makeFeePaid(purchaseUser, purchasePass);
                                                totalAmountDue = totalAmountDue - (totalAmountDue * .15);
                                                System.out.println("The total after premium membership discount is applies is : $" + totalAmountDue);
                                                System.out.println("Your total after the $10 fee for your premium account is : $" + (totalAmountDue + 10));
                                                System.out.println("Thank you for your purchase!");
                                                newBookstore.emptyBookCartAfterPurchase();
                                                newBookstore.emptyCDCartAfterPurchase();
                                                newBookstore.emptyDVDCartAfterPurchase();
                                                double returnCartTotal = newBookstore.addToTotal(purchaseUser, purchasePass, totalAmountDue);
                                                System.out.println("You have spent a total of : $" + returnCartTotal + " in our bookstore!");
                                                continue mainMenu;
                                            }
                                        }
                                    }
                                    else{
                                        System.out.println("The total for your purchase is : $" + totalAmountDue);
                                        System.out.println("Thank you for your purchase!");
                                        newBookstore.emptyBookCartAfterPurchase();
                                        newBookstore.emptyCDCartAfterPurchase();
                                        newBookstore.emptyDVDCartAfterPurchase();
                                        double returnCartTotal = newBookstore.addToTotal(purchaseUser, purchasePass, totalAmountDue);
                                        System.out.println("You have spent a total of : $" + returnCartTotal + " in our bookstore!");
                                        continue mainMenu;
                                    }
                                }
                                else{
                                    System.out.println("Password and/or username incorrect. Please enter both again.");
                                    continue checkOutMenu;
                                }
                            case 4 :
                                continue mainMenu;

                        }
                    }
                case 4 : 
                    System.exit(choice);
                    break;
            }
            scnr.close();
        }
        
    }
}
