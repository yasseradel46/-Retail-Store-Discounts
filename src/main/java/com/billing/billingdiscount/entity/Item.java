package com.billing.billingdiscount.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Item {

    private int id;
    private String name;
    private double price;
    private boolean grocery;
    @JsonIgnore
    private double totalCost;
    private int quantity;

    public Item(int id, String name, double price, boolean grocery, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.grocery = grocery;
        this.quantity = quantity;
    }


    /**
     * calculate price of items after discount by percentage
     * @param discountPercentage
     * @return discounted price
     */
    public double getDiscountedPrice(double discountPercentage) {
        if(!isGrocery() && discountPercentage != 0 ) {
            return (getTotalCost() - getTotalCost() * discountPercentage/100);
        }
        return getTotalCost();
    }

    public Double getTotalCost(){
        return price*quantity;
    }

}
