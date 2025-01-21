import java.util.ArrayList;

public class Player {
    //2D array to store country information
    private final int[][] countries;

    //Reihenfolge: ID des Lands, gekauft von diesem Spieler?, Level von Industrie 1, Level von Industrie 2
    //Für Zahl 2 gilt: 0 = nicht gekauft, 1 = gekauft
    //Industrien starten auf Level 1, um Länder von Anfang an etwas profitabel zu machen und um evtl. Teilen durch 0 zu vermeiden (Eventkarten)
    public Player() {
        countries = new int[][] {
            {1, 0, 1, 1},
            {2, 0, 1, 1},
            {3, 0, 1, 1},
            {4, 0, 1, 1},
            {5, 0, 1, 1},
        };
    }

    public ArrayList<Integer> getCountryStatus(int countryID) {
        ArrayList<Integer> countryStatusArray = new ArrayList<>();
        for (int[] country : countries) {
            if (country[0] == countryID) {
                countryStatusArray.add(country[0]);
                countryStatusArray.add(country[1]);
                countryStatusArray.add(country[2]);
                break;
            }
        }
        return countryStatusArray;
    }

    //Methode, um Status eines Lands zu ändern
    public void updateCountry(int countryID, int isBought, int industry1Level, int industry2Level) {
        for (int[] country : countries) {
            if (country[0] == countryID) {
                country[1] = isBought;
                country[2] = industry1Level;
                country[3] = industry2Level;
                break;
            }
        }
    }
    public static void main(String[] args) {
    }
}