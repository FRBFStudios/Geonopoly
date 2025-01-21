
public class Spieler
{
    public int playerMoney;
    
    int[][] werte = new int[32][5];
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
    werte[DE][WALD_LEVEL] = 0;
    werte[DE][INDUSTRIE_LEVEL] = 0;
    werte[DE][LANDWIRTSCHAFT_LEVEL] = 0;
    
    
    

    
    */
    
    public Spieler(){
        playerMoney = 1000;
    }
    
    /*String getBesitz() {
        StringBuilder result = new StringBuilder();
        result.append("Länder in Besitz:        ");
        //for (int i = 0; i < 32){}
    }*/
    
    /*public String getBesitz() {
     * 

        StringBuilder result = new StringBuilder();

        result.append("Länder in Besitz:        ");

        result.append(besitzt_de == 1 ? "Deutschland     "   : "");
        result.append(besitzt_china == 1 ? "China     "   : "");
        result.append(besitzt_chile == 1 ? "Chile     "   : "");
        result.append(besitzt_usa == 1 ? "USA     "   : "");

        result.append("\nDeutschland:   ");

        if (deEdelsteinLevel != 0) result.append("Edelsteinlevel: ").append(deEdelsteinLevel).append("        ");
        if (deWaldLevel != 0) result.append("Waldlevel: ").append(deWaldLevel).append("        ");
        if (deIndustrieLevel != 0) result.append("Industrielevel: ").append(deIndustrieLevel).append("        ");
        if (deLandwirtschaftLevel != 0) result.append("Landwirtschaftslevel: ").append(deLandwirtschaftLevel);

        
        return result.toString().trim();
    }*/
}
