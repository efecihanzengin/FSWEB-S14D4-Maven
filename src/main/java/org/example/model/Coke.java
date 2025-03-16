package org.example.model;

public class Coke extends ProductForSale{
    private int cokeCount;
    public Coke(String type, int price, String description, int cokeCount) {
        super(type, price, description);
        this.cokeCount = cokeCount;
    }

    @Override
    public void showDetails() {
        System.out.println(cokeCount);
    }
}
