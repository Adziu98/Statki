package com.piechowicz.adam;

import java.util.ArrayList;
import java.util.Scanner;

public class ProstyPortal {

        private ArrayList<String> polaPolozenia;
        //int iloscTrafien;

        public void setPolaPolozenia(ArrayList<String> ppol) {
            polaPolozenia = ppol;
        }

        public String sprawdz(String stringPole) {
            /*
            int strzal = Integer.parseInt(stringPole);
            String wynik = "pudło";
            for (int pole : polaPolozenia) {
                if (strzal == pole) {
                    wynik = "trafiony";
                    iloscTrafien++;
                    break;
                }
            }
             */
            String wynik = "pudło";
            int indeks = polaPolozenia.indexOf(stringPole);
            if (indeks >= 0) {
                polaPolozenia.remove(indeks);
                if(polaPolozenia.isEmpty()) {
                    wynik = "zatopiony";
                } else {
                    wynik = "trafiony";
                }
            }
            return wynik;
        }

        public static void main(String[] args) {
            int iloscRuchow = 0;
            ProstyPortal pp = new ProstyPortal();
            Scanner scanner = new Scanner(System.in);

            int liczbaLosowa = (int) (Math.random() * 5);
            String test = Integer.toString(liczbaLosowa);

            ArrayList<String> polozenie = null;
            polozenie.add(test);
            pp.setPolaPolozenia(polozenie);
            boolean czyIstnieje = true;

            while (czyIstnieje == true) {
                System.out.println("Podaj liczbę: ");
                String strzal = scanner.nextLine();
                String wynik = pp.sprawdz(strzal);
                iloscRuchow++;

                if (wynik.equals("zatopiony")) {
                    czyIstnieje = false;
                    System.out.println(iloscRuchow + " ruchów");
                }
            }
        }
}
