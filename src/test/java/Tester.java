import static org.junit.jupiter.api.Assertions.assertEquals;
import com.geoproject.*;
import com.geoproject.gui.*;
import com.geoproject.libraries.*;

public class Tester {
    CountryBorderLibrary cbl = new CountryBorderLibrary();
    Game game = new Game();
    Player player = new Player();
    UI ui = new UI();

    @Test 
    void test () {
        assertEquals(1, game.currentPlayerValue);
        assertEquals(1000, player.playerMoney);
    }
}
