
import chaudnb.example.AccountService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAccountService {

    private final AccountService service = new AccountService();

    @ParameterizedTest(name = "#{index} - Test with username={0}, password={1}, email={2}, expected={3}")
    @CsvFileSource(resources = "/test.csv", numLinesToSkip = 1)
    public void testRegisterFromCSV(String username, String password, String email, boolean expected) {
        boolean actual = service.registerAccount(username, password, email);

        System.out.printf("🧪 INPUT: username='%s', password='%s', email='%s' => expected: %s | actual: %s%n",
                username, password, email, expected, actual);

        assertEquals(expected, actual,
                String.format("❌ Failed: username='%s', password='%s', email='%s'", username, password, email));
    }
}
