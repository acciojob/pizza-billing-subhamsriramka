package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private int extraToppingPrice;
    private int takeAwayPrice;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTakeAwayAdded = false;
        this.extraCheesePrice = 80;
        this.takeAwayPrice = 20;

        if(isVeg == true) {
            this.price = 300;
            this.extraToppingPrice = 70;
        }
        else {
            this.price = 400;
            this.extraToppingPrice = 120;
        }

        this.bill = "Base price of the pizza: " +this.price+ "\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false) {
            this.price = this.price + this.extraCheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded == false) {
            this.price = this.price + this.extraToppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded == false) {
            this.price = this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false) {
            isBillGenerated = true;

            if(isCheeseAdded == true) {
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if(isToppingAdded == true) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingPrice + "\n";
            }
            if(isTakeAwayAdded == true) {
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}
