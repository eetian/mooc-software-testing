package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25, result);
    }

    // UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15, result);
    }

    // Add more test cases
    @Test
    public void addFiveToMinus5() {
        Assertions.assertEquals(0, new GettingStarted().addFive(-5));
    }

    @Test
    public void addFiveTo100() {
        Assertions.assertEquals(105, new GettingStarted().addFive(100));
    }
}
