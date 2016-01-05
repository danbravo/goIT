package flowersUml;

public class Aster extends Flower {
    public String kind;
    public String petalColor;

    @Override
    public void grow() {
        System.out.println("I grow like an aster!");
    }

    @Override
    public void smell() {
        System.out.println("I smell like an aster!");
    }
}
