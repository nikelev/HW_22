public class Food extends Shop{
    public Food( int price, String name) {
        super(price,name );
    }

    @Override
    public String toString() {
        return "You have bought a Food: " + super.getName() + " By price: " + super.getPrice();
    }

    @Override
    public void buy(){
        System.out.println("You have bought a Food: " + super.getName() + " By price: " + super.getPrice());
    }

    public void extraAmount(){
        System.out.println("You need to pay extra amount for rush delivery.");
    }
}
