package fileUml;

import java.util.ArrayList;

public class Directory {
    public int sizeOfDir;

    ArrayList<File> files = new ArrayList<File>();

    public void addFiles(File fls) {
        files.add(fls);
    }
}
