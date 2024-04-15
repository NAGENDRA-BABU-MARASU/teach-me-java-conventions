package powerpackage;


import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void shouldReturnOneWhenOneRaisedToOne() {
        int onePowerOne = PowerFinder.findPowerFor(1, 1);
        int expectedResult = 1;
        assert onePowerOne == expectedResult;
    }

    @Test
    public void shouldReturnTwoOneWhenTwoRaisedToOne() {
        int twoPowerOne = PowerFinder.findPowerFor(2, 1);
        int expectedResult = 2;
        assert twoPowerOne == expectedResult;
    }

    @Test
    public void shouldReturnFourWhenTwoRaisedToTwo() {
        int twoPowerTwo = PowerFinder.findPowerFor(2, 2);
        int expectedResult = 4;
        assert twoPowerTwo == expectedResult;
    }

    @Test
    public void shouldReturnSixWhenThreeRaisedToTwo() {
        int threePowerTwo = PowerFinder.findPowerFor(3, 2);
        int expectedResult = 9;
        assert expectedResult == threePowerTwo;
    }
}
