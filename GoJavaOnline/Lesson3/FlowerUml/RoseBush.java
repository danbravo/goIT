package flowersUml;

import java.util.ArrayList;

public class RoseBush {
    public int amountOfRoses;

    ArrayList<Rose> roses = new ArrayList<Rose>();

    public void addRoses (Rose rss) {
        roses.add(rss);
    }
}
