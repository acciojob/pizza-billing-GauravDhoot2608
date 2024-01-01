package com.driver;

public class Pizza {

    private int basePrice;
    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean addCheese;

    private boolean addTopping;

    private boolean addPaperBag;

    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) basePrice = 300;
        else  basePrice = 400;

        this.bill = "";
        this.addPaperBag = false;
        this.addCheese = false;
        this.addTopping = false;
        this.isBillGenerated = false;

        this.price = basePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.addCheese){
            this.addCheese = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.addTopping) {
            this.addTopping = true;
            if(isVeg) this.price += 70;
            else this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.addPaperBag){
            this.addPaperBag = true;
            this.price += 20;
        }
    }

    private void addBill(){

        bill += "Base Price Of The Pizza: " + basePrice + '\n';

        if(addCheese) bill += "Extra Cheese Added: 80" + '\n';
        if(addTopping){
            if(isVeg) bill += "Extra Toppings Added: 70" + '\n';
            else  bill += "Extra Toppings Added: 120" + '\n';
        }

        if(addPaperBag) bill += "Paperbag Added: 20" + '\n';

        bill += "Total Price: " + this.price + '\n';
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            isBillGenerated = true;
            addBill();
        }
        return this.bill;
    }
}
