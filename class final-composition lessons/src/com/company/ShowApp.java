package com.company;

// Constructor - polymorphs
//    hashCode
//    toString()

public class ShowApp {

    public static void main(String[] args) {
        Product drink = new Product(120);
        Product food = new Product(40.0,6);
        //drink.price = 10.5;
        //food.price = 30.0;
        drink.info();
        food.info();
    }
}

class Product{
    double price;      // -> object
    int    weight;     // -> object
    boolean available; // -> object
    int quantity;



    // constructor
    Product(double price){
        this.price = price;
        System.out.println("A new product was created!");
    }

    Product(double price,int weights){
        this(price);
        this.weight = weights;
        System.out.println("A new product was created!");
    }



    void info(){
        System.out.println("\n\nThis is a Product ");
        System.out.println(price + "MDL\n");
        System.out.println(weight + "g\n");
        System.out.println(quantity + "pieces");
        System.out.println(available ? "In stock" : "Not for sale");
//        if(availabel)return "in stock" else if return "Not for sale"
    }
}



/*
**** Declare Final(constant) Class****
final class Car{
class engine{

    } --> it is a part of composition of Car
} --> cannot extends need to use Composition
**** Declare Class Example ****
Human h1; -> declare class
h1 = new Human(); -> initialize class
 */
