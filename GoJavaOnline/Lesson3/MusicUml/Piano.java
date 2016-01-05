package musicUml;

public class Piano extends MusInstr {
    public String typeOfPiano;
    public int numberOfPedals;
    public String color;

    public void forte() {
        System.out.println("TADAM");
    }

    public void legato() {
        System.out.println("tadadadadaam");
    }
    @Override
    public void play() {
        System.out.println("*piano sound*");
    }
}
