package flowersUml;

import java.util.ArrayList;

public class Bouquet {
    public int maxSize;

    ArrayList<Flower> flowers = new ArrayList<Flower>();

    public void addFlowers (Flower flwr) {
        flowers.add(flwr);
    }
}
