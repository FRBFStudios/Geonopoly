import static org.junit.jupiter.api.Assertions.assertEquals;

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
        System.out.println(game.currentPlayer.getBesitz());
    }
}
