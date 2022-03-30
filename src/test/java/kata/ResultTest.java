package kata;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ResultTest {

    @Test
    public void the37CorrespondsTo00() {
        assertNumberResult(37,"00");
    }

    @Test()
    public void theResultIsAlwaysBetween00and36() throws Exception {

    }

    @Test
    public void theColorOf0and00IsGreen() throws Exception {
        assertColorResult(0, Result.Color.valueOf("GREEN"));
        assertColorResult(37, Result.Color.valueOf("GREEN"));
    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        for (int i = 1; i < 19; i++) {
            assertColorResult(i*2, Result.Color.valueOf("BLACK"));
        }
    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        int i =1;
        while(i<36){
            assertColorResult(i, Result.Color.valueOf("RED"));
            i+=2;
        }
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37()
            throws Exception {
        assertThrows(RouletteException.class,() ->{
            assertNumberResult(38,"38");
        });
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0()
            throws Exception {
        assertThrows(RouletteException.class,() ->{
            assertNumberResult(-1,"-1");
        });
    }

    private void assertColorResult(int randomizerValue, Result.Color expectedColor) {
        Result result = new Result(randomizerValue);
        assertEquals(expectedColor,result.color);

    }

    private void assertNumberResult(int randomizerValue, String expectedNumber) {
        Result result = new Result(randomizerValue);
        assertEquals(expectedNumber,result.number);
    }
}