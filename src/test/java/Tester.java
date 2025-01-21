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
    public void test () {
        assertEquals(2, CountryBorderLibrary.borders[0][0]);
        assertEquals(1000, game.currentPlayer.playerMoney);
    }
}
