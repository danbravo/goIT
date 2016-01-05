package musicUml;

public class Guitar extends MusInstr {
    public int numberOfStrings;
    public String typeOfWood;
    public String typeOfGuitar;

    public void riff() {
        System.out.println("WWWRRRRRRLRLRLRLR");
    }

    public void chord() {
        System.out.println("brun'");
    }

    @Override
    public void play() {
        System.out.println("*guitar sound*");
    }
}
