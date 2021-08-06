import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TennisGameTest {
    private final TennisGame tennisGame = new TennisGame();
    private final String player1Name="P1";
    private final String player2Name="P2";

    @DisplayName("playGame() P1 15-LOVE P2")
    @Test
    void playGame_player1WinsFirst1() {
        String[] game=new String[]{"P1"};
        assertEquals(player1Name+" 15-LOVE "+player2Name, tennisGame.playGame(player1Name, player2Name, game));
    }

    @DisplayName("playGame() P1 LOVE-15 P2")
    @Test
    void playGame_player2WinsFirst1() {
        String[] game=new String[]{"P2"};
        assertEquals(player1Name+" LOVE-15 "+player2Name, tennisGame.playGame(player1Name, player2Name, game));
    }

    @DisplayName("playGame() P1 30-15 P2")
    @Test
    void playGame_player1WinsFirst2() {
        String[] game=new String[]{"P1","P2","P1"};
        assertEquals(player1Name+" 30-15 "+player2Name, tennisGame.playGame(player1Name, player2Name, game));
    }

    @DisplayName("playGame() P1 15-30 P2")
    @Test
    void playGame_player2WinsFirst2() {
        String[] game=new String[]{"P1","P2","P2"};
        assertEquals(player1Name+" 15-30 "+player2Name, tennisGame.playGame(player1Name, player2Name, game));
    }

    @DisplayName("playGame() P1 40-15 P2")
    @Test
    void playGame_player1WinsFirst3() {
        String[] game=new String[]{"P1","P1","P1","P2"};
        assertEquals(player1Name+" 40-15 "+player2Name, tennisGame.playGame(player1Name, player2Name, game));
    }

    @DisplayName("playGame() ADVANTAGE P1 (1 point more)")
    @Test
    void playGame_player1Advantage() {
        String[] game=new String[]{"P1","P2","P1","P2","P1","P2","P1"};
        assertEquals("ADVANTAGE "+player1Name, tennisGame.playGame(player1Name, player2Name, game));
    }

    @DisplayName("playGame() ADVANTAGE P2 (1 point more)")
    @Test
    void playGame_player2Advantage() {
        String[] game=new String[]{"P1","P2","P1","P2","P1","P2","P2"};
        assertEquals("ADVANTAGE "+player2Name, tennisGame.playGame(player1Name, player2Name, game));
    }

    @DisplayName("playGame() ALL LOVE")
    @Test
    void playGame_playersBothZero() {
        String[] game=new String[]{};
        assertEquals("ALL LOVE", tennisGame.playGame(player1Name, player2Name, game));
    }

    @DisplayName("playGame() ALL 15")
    @Test
    void playGame_playersBoth15() {
        String[] game=new String[]{"P1","P2"};
        assertEquals("ALL 15", tennisGame.playGame(player1Name, player2Name, game));
    }

    @DisplayName("playGame() ALL 30")
    @Test
    void playGame_playersBoth30() {
        String[] game=new String[]{"P1","P2","P1","P2"};
        assertEquals("ALL 30", tennisGame.playGame(player1Name, player2Name, game));
    }

    @DisplayName("playGame() WINNER P1 (2 points more)")
    @Test
    void playGame_player1Winner() {
        String[] game=new String[]{"P1","P2","P1","P2","P1","P1"};
        assertEquals("WINNER P1", tennisGame.playGame(player1Name, player2Name, game));
    }

    @DisplayName("playGame() WINNER P2")
    @Test
    void playGame_player2Winner() {
        String[] game=new String[]{"P1","P2","P1","P2","P2","P2"};
        assertEquals("WINNER P2", tennisGame.playGame(player1Name, player2Name, game));
    }

    @DisplayName("playGame() DEUCE (ALL 40)")
    @Test
    void playGame_deuce3Points() {
        String[] game=new String[]{"P1","P2","P1","P2","P1","P2"};
        assertEquals("DEUCE", tennisGame.playGame(player1Name, player2Name, game));
    }

}