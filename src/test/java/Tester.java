import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.geoproject.*;
import com.geoproject.gui.*;
import com.geoproject.libraries.*;

public class Tester {
    static Game game = new Game();
    static Player player = new Player();
    static UI ui = new UI();

    @Test
    public void test() {
        player.werte[1][0] = 1;
        player.werte[2][0] = 1;
        player.werte[3][0] = 1;
        player.werte[1][2] = 4;
        player.werte[8][0] = 1;
        assertEquals(2, CountryLibrary.borders[0][0]);
        assertEquals(1000, game.currentPlayer.playerMoney);

        //String besitz = player.getBesitz();
        //System.out.println(besitz);

        //System.out.println(game.currentPlayer.getBesitz());
        //System.out.println(game.currentPlayer.getLevels());
        }
    

    
    public static void main(String[] args){
        game.currentPlayer.werte[1][0] = 1;
        game.currentPlayer.werte[2][0] = 1;
        game.currentPlayer.werte[3][0] = 1;
        game.currentPlayer.werte[1][2] = 4;
        game.currentPlayer.werte[8][0] = 1;
        System.out.println(game.currentPlayer.getBesitz());
        System.out.println("");
        System.out.println(game.currentPlayer.getLevels());
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