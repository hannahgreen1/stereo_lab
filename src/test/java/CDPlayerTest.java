import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer();
    }

    @Test
    public void hasNoVolume() {
        assertEquals(0, cdPlayer.volumeLevel());
    }

    @Test
    public void turnVolumeUp(){
        cdPlayer.volume(15);
        assertEquals(15, cdPlayer.volumeLevel());
    }
}
