package org.example.model;


class Coke extends ProductForSale {
    private boolean diet;

    public Coke(String type, double price, String description, boolean diet) {
        super(type, price, description);
        this.diet = diet;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription() + ", Diet: " + diet);
    }
}

