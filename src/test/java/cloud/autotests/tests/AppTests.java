package cloud.autotests.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Tests order")
    void test() {

        step("Need to write several tests:", () -> {
            // todo
        });

        step("1. Check authorization to site.com", () -> {
            // todo
        });

        step("2. Add order to the table", () -> {
            // todo
        });

        step("3. Buy promotion in the site", () -> {
            // todo
        });

    }
}