import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {
    private final Clock clock=new Clock();

    @DisplayName("getSmallestAngleBetweenClockHands()")
    @Test
    void getSmallestAngleBetweenClockHands() {
        assertEquals(52.5, clock.getSmallestAngleBetweenClockHands(1, 15));
        assertEquals(5.5, clock.getSmallestAngleBetweenClockHands(12, 1));
    }

    @DisplayName("getSmallestAngleBetweenClockHands() - 12 & 0 hour")
    @Test
    void getSmallestAngleBetweenClockHands_12And0hour() {
        assertEquals(clock.getSmallestAngleBetweenClockHands(0, 15), clock.getSmallestAngleBetweenClockHands(12, 15));
        assertEquals(82.5, clock.getSmallestAngleBetweenClockHands(12, 15));
        assertEquals(82.5, clock.getSmallestAngleBetweenClockHands(0, 15));
    }

    @DisplayName("getSmallestAngleBetweenClockHands() - 24 hour format")
    @Test
    void getSmallestAngleBetweenClockHands_24hourFormat() {
        assertEquals(clock.getSmallestAngleBetweenClockHands(1, 15), clock.getSmallestAngleBetweenClockHands(13, 15));

    }

    @DisplayName("getSmallestAngleBetweenClockHands() - 24 hour, returns -1")
    @Test
    void getSmallestAngleBetweenClockHands_24hour() {
        assertEquals(-1, clock.getSmallestAngleBetweenClockHands(24, 15));
    }

    @DisplayName("getSmallestAngleBetweenClockHands() - negative hour, returns -1")
    @Test
    void getSmallestAngleBetweenClockHands_NegativeHour() {
        assertEquals(-1, clock.getSmallestAngleBetweenClockHands(-1, 15));
    }

    @DisplayName("getSmallestAngleBetweenClockHands() - negative minutes, returns -1")
    @Test
    void getSmallestAngleBetweenClockHands_NegativeMinutes() {
        assertEquals(-1, clock.getSmallestAngleBetweenClockHands(1, -1));
    }

    @DisplayName("getSmallestAngleBetweenClockHands() - 60 minutes, returns -1")
    @Test
    void getSmallestAngleBetweenClockHands_60Minutes() {
        assertEquals(-1, clock.getSmallestAngleBetweenClockHands(-1, 60));
    }
}