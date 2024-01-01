package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean addCheese;

    private boolean addTopping;

    private boolean addPaperBag;

    private boolean isBillGenerated;

    private int totalBill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) price = 300;
        else  price = 400;

        bill = "";
        totalBill += price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.addCheese){
            this.addCheese = true;
            totalBill += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.addTopping) {
            this.addTopping = true;
            if(isVeg) totalBill += 70;
            else totalBill += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.addPaperBag){
            this.addPaperBag = true;
            totalBill += 20;
        }
    }

    private void addBill(){

        bill += "Base Price Of The Pizza: " + price + '\n';

        if(addCheese) bill += "Extra Cheese Added: 80" + '\n';
        if(addTopping){
            if(isVeg) bill += "Extra Toppings Added: 70" + '\n';
            else  bill += "Extra Toppings Added: 120" + '\n';
        }

        if(addPaperBag) bill += "Paperbag Added: 20" + '\n';

        bill += "Total Price: " + totalBill;
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
