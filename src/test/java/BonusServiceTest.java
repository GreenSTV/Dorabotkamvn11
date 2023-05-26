import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class BonusServiceTest {
    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(1000, false);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateUnregisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1000000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(1000000, false);
        Assertions.assertEquals(expected, actual);
    }
}
