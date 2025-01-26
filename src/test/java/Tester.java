import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.geoproject.*;
import com.geoproject.gui.*;
import com.geoproject.libraries.*;

public class Tester {
    static Game game = new Game();
    static Player player = game.currentPlayer;
    static UI ui = new UI();

    @Test
    public void test() {
        player.values[1][0] = 1;
        player.values[2][0] = 1;
        player.values[3][0] = 1;
        player.values[1][2] = 4;
        player.values[8][0] = 1;
        assertEquals(2, CountryLibrary.borders[0][0]);
        assertEquals(1000, game.currentPlayer.playerMoney);

        //String ownership = player.getOwnership();
        //System.out.println(ownership);

        //System.out.println(game.currentPlayer.getOwnership());
        //System.out.println(game.currentPlayer.getLevels());
    }
    
    public static void main(String[] args) {
        new UI();
    }
}


/*
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.geoproject.*;
import com.geoproject.gui.*;
import com.geoproject.libraries.*;

public class Tester {
    Game game = new Game();
    Player player = new Player();
    UI ui = new UI();

    @Test
    public void test() {
        player.werte[1][0] = 1;
        player.werte[2][0] = 1;
        player.werte[3][0] = 1;
        player.werte[1][2] = 4;
        player.werte[8][0] = 1;
        assertEquals(2, CountryLibrary.borders[0][0]);
        assertEquals(1000, game.currentPlayer.playerMoney);
        System.out.println(player.getBesitz());
        
        // Print the result of getBesitz method to the console
        System.err.println(game.currentPlayer.getBesitz());
        System.err.println(game.currentPlayer.getLevels());
    }
}
 */