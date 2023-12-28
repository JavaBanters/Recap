package example.one;

public class Main {


    public static void main(String[] args) {
        Laptop lenovo = new Laptop(100.50f, "L234R" , "white", 2 );//Object creation
        //lenovo.showDetails(lenovo);
        //System.out.println(lenovo.getPrice());
        //System.out.println(lenovo);
        //System.out.println("The Price of the laptop is :  "+lenovo.knowThePrice(lenovo));

        //Laptop sony = new Laptop(109.50f, "S125T" , "black", 4 );//Object creation
        //sony.showDetails(sony);

        Laptop dummyLaptop = new Laptop();
        //dummyLaptop.showDetails(dummyLaptop);

        Laptop apple = new Laptop(199.99f, "pro","sliver");
        apple.showDetails(apple);

    }

}
