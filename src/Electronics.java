public class Electronics extends Shop{
    public Electronics( int price, String name) {
        super(price,name );
    }

    @Override
    public String toString() {
        return "You have bought an Electronics: " + super.getName() + " By price: " + super.getPrice();
    }

    public void buy(){
        System.out.println("You have bought an Electronics: " + super.getName() + " By price: " + super.getPrice());
    }

    public void guarantee(){
        System.out.println("You need to issue a guarantee.");
    }

}
