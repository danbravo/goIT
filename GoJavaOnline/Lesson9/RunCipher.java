package GoJavaOnline.Lesson9;

import GoJavaOnline.Lesson3.FileUml.Audio;
import GoJavaOnline.Lesson3.FileUml.File;
import GoJavaOnline.Lesson3.FileUml.Text;

import java.util.ArrayList;

public class RunCipher {
    public static void main(String[] args) {
        Cipher cipher = new Cipher();

        ArrayList<File> filesList = new ArrayList<>();
        filesList.add(new Audio("Album", "Artist"));
        filesList.add(new Audio("Shanson", "Krug"));
        filesList.add(new Text(10, "large"));

        String encodedMessage = cipher.encode(filesList.toString());
        System.out.println(encodedMessage);

        String decodedMessage = cipher.decode(encodedMessage);
        System.out.println(decodedMessage);
    }
}
