package flowersUml;

public class Chamomile extends Flower {
    public String colorSet;
    public int age;

    @Override
    public void grow() {
        System.out.println("I grow like a chamomile!");
    }

    @Override
    public void smell() {
        System.out.println("I smell like a chamomile!");
    }
}
