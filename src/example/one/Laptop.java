package example.one;

import java.sql.SQLOutput;

public class Laptop {

    //100.40f
    private float price; //getter to get the value // setter to set the value 3.122423124124
    //"Lenovo"
    private String model;
    private String colour;
    private short memory;

    public Laptop () {

    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public Laptop(float price, String model, String colour, int memory) {
        this.price = price;
        this.model = model;
        this.colour = colour;
        //this.memory = memory;
    }

    public Laptop(float price, String model, String colour) {
        this.price = price;
        this.model = model;
        this.colour = colour;
        this.memory = 3;
    }

    private void onTheLaptop () {
        System.out.println("The laptop has been turned on");
    }

    protected float knowThePrice () {
        return  price;
    }

    public void showDetails (Laptop obj) {
        System.out.println("-------Laptop Details---------");
        System.out.print(obj.model+" "+obj.price+" "+obj.colour+" "+obj.memory);
        System.out.println();
    }


    public static void main(String[] args) {
        Laptop lenovo = new Laptop(100.50f, "L234R" , "white", 2 );//Object creation
        lenovo.showDetails(lenovo);
        lenovo.setPrice(101.50f);
        System.out.println(lenovo.getPrice());
//        lenovo.onTheLaptop();
//
//        Laptop sony = new Laptop(109.50f, "S125T" , "black", 4 );//Object creation
//        sony.showDetails(sony);
//
//        Laptop dummyLaptop = new Laptop();
//        dummyLaptop.showDetails(dummyLaptop);


    }

}
