package flowersUml;

public class Tulip extends Flower {
    public String country;

    @Override
    public void grow() {
        System.out.println("I grow like a tulip!");
    }

    @Override
    public void smell() {
        System.out.println("I smell like a tulip!");
    }
}
