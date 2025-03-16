package org.example.model;

public class Bread extends ProductForSale{
    private int breadCount;
    public Bread(String type, int price, String description, int breadCount) {
        super(type, price, description);
        this.breadCount = breadCount;
    }

    @Override
    public void showDetails() {
        System.out.println(breadCount);
    }
}
