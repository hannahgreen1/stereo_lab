import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio();
    }

    @Test
    public void hasNoVolume() {
        assertEquals(0, radio.startVolumeLevel());
    }

    @Test
    public void turnVolumeUp(){
        radio.volume(10);
        assertEquals(10, radio.startVolumeLevel());
    }

    @Test
    public void canTuneRadio(){
        radio.tune("Radio 1");
        assertEquals("Radio 1", radio.tuneRadio);
    }
}
