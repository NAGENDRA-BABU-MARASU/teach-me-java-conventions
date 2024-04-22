package powerpackage;


import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void shouldReturnOneWhenOneRaisedToOne() {
        int expectedResult = 1;

        int onePowerOne = PowerFinder.findPowerFor(1, 1);

        assert onePowerOne == expectedResult;
    }

    @Test
    public void shouldReturnTwoOneWhenTwoRaisedToOne() {
        int expectedResult = 2;

        int twoPowerOne = PowerFinder.findPowerFor(2, 1);

        assert twoPowerOne == expectedResult;
    }

    @Test
    public void shouldReturnFourWhenTwoRaisedToTwo() {
        int expectedResult = 4;

        int twoPowerTwo = PowerFinder.findPowerFor(2, 2);

        assert twoPowerTwo == expectedResult;
    }

    @Test
    public void shouldReturnSixWhenThreeRaisedToTwo() {
        int expectedResult = 9;

        int threePowerTwo = PowerFinder.findPowerFor(3, 2);

        assert expectedResult == threePowerTwo;
    }
}
