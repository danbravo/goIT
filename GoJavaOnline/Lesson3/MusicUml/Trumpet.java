package musicUml;

public class Trumpet extends MusInstr {
    public String material;
    public int age;

    public void muteSound() {
        System.out.println("...");
    }

    public void useMouthpiece() {
        System.out.println("*added mouthpiece*");
    }
    @Override
    public void play() {
        System.out.println("*trumpet sound*");
    }
}
