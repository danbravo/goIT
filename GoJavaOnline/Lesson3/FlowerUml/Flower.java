package flowersUml;

abstract class Flower {
    protected String color;
    protected int size;
    protected int numberOfPetals;

    protected abstract void grow();
    protected abstract void smell();
}
