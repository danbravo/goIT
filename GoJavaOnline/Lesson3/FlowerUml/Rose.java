package flowersUml;

public class Rose extends Flower {
    public String typeOfRose;
    public int numberOfSpikes;

    @Override
    public void grow() {
        System.out.println("I grow like a rose!");
    }

    @Override
    public void smell() {
        System.out.println("I smell like a rose!");
    }
}
