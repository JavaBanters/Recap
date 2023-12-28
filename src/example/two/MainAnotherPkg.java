package example.two;

import example.one.Laptop;

public class MainAnotherPkg {
    public static void main(String[] args) {

        //Laptop lenovo = new Laptop(100.50f, "L234R" , "white", 2 );//Object creation
        //lenovo.showDetails(lenovo);

        //System.out.println("The Price of the laptop is :  "+lenovo.knowThePrice(lenovo));

        //Laptop sony = new Laptop(109.50f, "S125T" , "black", 4 );//Object creation
        //sony.showDetails(sony);

        Laptop dummyLaptop = new Laptop();
        dummyLaptop.showDetails(dummyLaptop);


    }

}
