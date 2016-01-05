package musicUml;

import java.util.ArrayList;

public class MusicStore {
    public String location;
    public String name;

    ArrayList<MusInstr> instruments = new ArrayList<MusInstr>();

    public void addInstruments (MusInstr instr) {
        instruments.add(instr);
    }
}
