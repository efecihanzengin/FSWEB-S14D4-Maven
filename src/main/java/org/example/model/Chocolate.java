package org.example.model;

public class Chocolate extends ProductForSale{
    private int chocolateCount;
    public Chocolate(String type, int price, String description, int chocolateCount) {
        super(type, price, description);
        this.chocolateCount = chocolateCount;
    }




    @Override
    public void showDetails() {
        System.out.println(chocolateCount);
    }
}
