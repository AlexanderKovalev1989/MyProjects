import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "ru.savkk.test",
        tags = "@withdrawal",
        dryRun = false,
        strict = false,
        snippets = SnippetType.CAMELCASE
//        name = "^Успешное|Успешная.*"
)


public class StartTest {




}
