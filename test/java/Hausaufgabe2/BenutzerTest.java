package Hausaufgabe2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BenutzerTest {

    Sport basketball1 = new Basketball();
    Sport basketball2 = new Basketball();
    Sport hindernislauf1 = new Hindernislauf();
    Sport hochsprung1 = new Hochsprung();
    Sport fussball1 = new Fussball();

    List<Sport> sport1 = new ArrayList<Sport>(Arrays.asList(basketball1, basketball2, hindernislauf1,
            hochsprung1, fussball1));
    Benutzer benutzer1 = new Benutzer("Duicu", "Tudor", sport1);

    List<Sport> sport2 = new ArrayList<Sport>();
    Benutzer benutzer2 = new Benutzer("Moldoveanu", "Andrei", sport2);

    @org.junit.jupiter.api.Test
    void kalkuliereZeit() {
        assertEquals(benutzer1.kalkuliereZeit(), 225);
        assertEquals(fussball1.kalkuliereZeit(), 0);
    }

    @org.junit.jupiter.api.Test
    void testKalkuliereZeit() {
        assertEquals(basketball1.kalkuliereZeit(), 55);
        assertEquals(hindernislauf1.kalkuliereZeit(), 30);
        assertEquals(hochsprung1.kalkuliereZeit(), 20);
        assertEquals(fussball1.kalkuliereZeit(), 65);
    }

    @org.junit.jupiter.api.Test
    void kalkuliereDurchschnittszeit() {
        assertEquals(benutzer1.kalkuliereDurchschnittszeit(), 45);
        assertEquals(benutzer2.kalkuliereDurchschnittszeit(), 0);
    }
}