package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        for ( ProductForSale product : products) {
            product.showDetails();
        }
    }
    public static void main(String[] args) {


        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Sütlü Çikolata", 15, "Milka", 12);
        products[1] = new Coke("Soğuk İçecek", 12, "Ferah", 10);
        products[2] = new Bread("Taze Ekmek", 5, "Lezzet", 500);

        Store store = new Store();
        store.listProducts(products);

    }


}