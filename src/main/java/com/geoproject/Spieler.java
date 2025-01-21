public class Spieler
{
    public int playerMoney;
    
    int[][] werte = new int[33][6];
    /*
    
    // IDs der Länder
    const int DE = 0;
    const int CHINA = 1;
    const int CHILE = 2;
    const int USA = 3;

    // Nummern der gefragten Werte
    const int BESITZT = 0;
    const int EDELSTEIN_LEVEL = 1;
    const int WALD_LEVEL = 2;
    const int INDUSTRIE_LEVEL = 3;
    const int LANDWIRTSCHAFT_LEVEL = 4;

    // Beispiel für das Setzen von Werten
    werte[DE][BESITZT] = 0;
    werte[DE][EDELSTEIN_LEVEL] = 0;
    */
    
    public Spieler(){
        playerMoney = 1000;
    }
    
    String getBesitz() {
        StringBuilder result = new StringBuilder();

        result.append("Länder in Besitz:        ");

        for (int i = 0; i < werte.length; i++) {
            if (werte[i][0] == 1) {
                //hier gehört eigentlich ein zugriff auf eine library hin, um die namen abzugreifen
                switch (i) {
                    case 0: result.append("Deutschland"); break;
                    case 1: result.append("China"); break;
                    case 2: result.append("Chile"); break;
                    case 3: result.append("USA"); break;
                }
                result.append(", ");
            }
        }
        return result.toString().trim();
    }

    String getLevels() {
        StringBuilder result = new StringBuilder();

        result.append("Country Levels:\n");

        for (int i = 0; i < werte.length; i++) {
            if (werte[i][0] == 1) {
                //hier gehört eigentlich ein zugriff auf eine library hin, um die namen abzugreifen, unten sind nur beispiele
                switch (i) {
                    case 0: result.append("Deutschland: "); break;
                    case 1: result.append("China: "); break;
                    case 2: result.append("Chile: "); break;
                    case 3: result.append("USA: "); break;
                }
                for (int j = 1; j < werte[i].length; j++) {
                    switch (j) {
                        //hier gehört eigentlich ein zugriff auf eine library hin, um die statsnamen abzugreifen, unten sind nur beispiele
                        case 1: result.append(" Edelstein: ").append(werte[i][j]); break;
                        case 2: result.append(" Wald: ").append(werte[i][j]); break;
                        case 3: result.append(" Industrie: ").append(werte[i][j]); break;
                        case 4: result.append(" Landwirtschaft: ").append(werte[i][j]); break;
                    }
                    result.append(", ");
                }
                result.append("\n"); // Ensure new line is added after each country
            }
        }
        return result.toString().trim();
    }
}
