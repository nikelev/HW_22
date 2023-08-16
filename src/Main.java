public class Main {
    public static void main(String[] args) {

        Food f1=new Food(10, "Apples");
        Food f2=new Food(12, "Oranges.");
        Food f3=new Food(14, "Lemon");

        Electronics e1=new Electronics(20, "TV");
        Electronics e2=new Electronics(30, "Fridge");
        Electronics e3=new Electronics(40, "Telephone");

        Clothing c1=new Clothing(15, "Trousers");
        Clothing c2=new Clothing(17, "Jacket");
        Clothing c3=new Clothing(19, "Shirt");

        System.out.println(f1);

        f1.buy();
        e1.buy();





    }
}
