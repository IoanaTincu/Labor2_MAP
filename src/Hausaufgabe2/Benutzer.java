package Hausaufgabe2;

import java.util.List;

public class Benutzer {

    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport>sport)
    {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    /**
     *
     * @return die Summe der Zeiten der Sportarten
     */
    public double kalkuliereZeit(){

        double gesamteZeit = 0;
        for(int i = 0; i < sport.size(); i++)
            gesamteZeit += sport.get(i).kalkuliereZeit();
        return gesamteZeit;
    }

    /**
     *
     * @param sport ein abgeleitetes Objekt der Interface
     * @return die notige Zeit furs Treiben von sport
     */
    public double kalkuliereZeit(Sport sport){
        return sport.kalkuliereZeit();
    }

    /**
     *
     * @return die Durchschnittszeit aller Sportarten
     */
    public double kalkuliereDurchschnittszeit(){
        if(sport.size() == 0)
            return 0;
        return kalkuliereZeit()/sport.size();
    }
}
