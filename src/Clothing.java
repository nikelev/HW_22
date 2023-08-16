public class Clothing extends Shop{
    public Clothing( int price, String name) {
        super(price,name );
    }

    @Override
    public String toString() {
        return "You have bought a Clothing: " + super.getName() + " By price: " + super.getPrice();
    }
    public void buy(){
        System.out.println("You have bought a Clothing: " + super.getName() + " By price: " + super.getPrice());
    }


}
