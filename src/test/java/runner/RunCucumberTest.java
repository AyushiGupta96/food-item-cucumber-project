package runner;

import io.cucumber.core.options.Constants;
import io.cucumber.plugin.Plugin;
import org.junit.runners.Suite;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("test")
@ConfigurationParameter(key= PLUGIN_PROPERTY_NAME,value="pretty")
@ConfigurationParameter(key= GLUE_PROPERTY_NAME,value="test")
@CofigurationParameter(Key= Constants.FILTER_TAGS_PROPERTY_NAME,value="@SmokeTest and @RegularTest")
//@IncludeTags("SmokeTags | NightTest")
//@IncludeTags("!NightTest") or @IncludeTags("SmokeTags & NightTest")
public class RunCucumberTest {

}
