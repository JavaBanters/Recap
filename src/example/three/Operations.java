package example.three;

//overloading
public class Operations {

    int firstNo;
    int secondNo;

    int addNumbers(int first,int second) { // static polymorphism
        return first + second;
    }

    int addNumbers(int first,int second, int third) {
        return first + second + third;
    }

    public static void main(String[] args) {
        Operations firstOperation = new Operations();
        System.out.println(firstOperation.addNumbers(2 , 3));
        System.out.println(firstOperation.addNumbers(2 , 3, 5));
    }

}
