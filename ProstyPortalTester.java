package com.piechowicz.adam;

import java.util.ArrayList;

public class ProstyPortalTester {
    public static void main (String[] args) {
        com.piechowicz.adam.ProstyPortal wit = new com.piechowicz.adam.ProstyPortal();
        ArrayList<String> Polozenia = new ArrayList<String>();
        Polozenia.add("2");
        Polozenia.add("3");
        Polozenia.add("4");
        wit.setPolaPolozenia(Polozenia);
        String wybranePole = "2";
        String wynik = wit.sprawdz(wybranePole);
    }
}
