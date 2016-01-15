package flowersUml;

public class Rose extends Flower {
    private String typeOfRose;
    private int numberOfSpikes = 10;

    public Rose() {

    }

    public int getNumberOfSpikes() {
        return numberOfSpikes;
    }

    @Override
    public void grow() {
        System.out.println("I grow like a rose!");
    }

    @Override
    public void smell() {
        System.out.println("I smell like a rose!");
    }
}
