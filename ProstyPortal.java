package com.piechowicz.adam;

import java.util.ArrayList;
import java.util.Scanner;

public class ProstyPortal {

        private ArrayList<String> polaPolozenia = new ArrayList<String>();;

        public void setPolaPolozenia(ArrayList<String> ppol) {
            polaPolozenia = ppol;
        }

        public String sprawdz(String stringPole) {
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
            System.out.println(wynik);
            return wynik;
        }

        public enum State {
            zatopiony;
        }

        public static void main(String[] args) {
            int iloscRuchow = 0;
            State state = State.zatopiony;
            ProstyPortal pp = new ProstyPortal();
            Scanner scanner = new Scanner(System.in);

            int liczbaLosowa = (int) (Math.random() * 5);
            String test = Integer.toString(liczbaLosowa);
            String test1 = Integer.toString(liczbaLosowa+1);
            String test2 = Integer.toString(liczbaLosowa+2);

            ArrayList<String> polozenie = new ArrayList<String>();
            polozenie.add(test);
            polozenie.add(test1);
            polozenie.add(test2);
            pp.setPolaPolozenia(polozenie);
            boolean czyIstnieje = true;

            while (czyIstnieje) {
                System.out.println("Podaj liczbę: ");
                String strzal = scanner.nextLine();
                String wynik = pp.sprawdz(strzal);
                iloscRuchow++;

                if (wynik == String.valueOf(state.zatopiony)) {
                    czyIstnieje = false;
                    System.out.println(iloscRuchow + " ruchów");
                }
            }
        }
}
