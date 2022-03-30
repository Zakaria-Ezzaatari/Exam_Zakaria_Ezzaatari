package kata;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class BallTest {

    @Test
    @Timeout(21)
    public void itRollsForAGivenAmountOfTime() throws Exception {
        Ball ball=new Ball();
        ball.roll();
    }
}
