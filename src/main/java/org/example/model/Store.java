package org.example.model;

class Store {
    public void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 3.5, "Delicious chocolate bar", "Cadbury");
        products[1] = new Coke("Drink", 2.0, "Refreshing cola drink", true);
        products[2] = new Bread("Bread", 2.0, "Freshly baked bread loaf", "Whole wheat");

        Store store = new Store();
        store.listProducts(products);
    }
}