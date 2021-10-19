package Hausaufgabe2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Sport basketball1 = new Basketball();
        Sport basketball2 = new Basketball();
        Sport hindernislauf1 = new Hindernislauf();
        Sport hochsprung1 = new Hochsprung();

        List<Sport> sport1 = new ArrayList<Sport>(Arrays.asList(basketball1, basketball2, hindernislauf1, hochsprung1));
        Benutzer benutzer1 = new Benutzer("Duicu", "Tudor", sport1);

        System.out.println("kalkuliereZeit(): " + benutzer1.kalkuliereZeit());
        System.out.println("kalkuliereZeit(Sport): " + benutzer1.kalkuliereZeit(basketball1));
        System.out.println("kalkuliereDurchschnittszeit(): " + benutzer1.kalkuliereDurchschnittszeit());
        
    }
}
