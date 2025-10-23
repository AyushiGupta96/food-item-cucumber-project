package runner;

import io.cucumber.plugin.Plugin;
import org.junit.runners.Suite;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("test")
@ConfigurationParameter(key= PLUGIN_PROPERTY_NAME,value="pretty")
@ConfigurationParameter(key= GLUE_PROPERTY_NAME,value="test")
public class RunCucumberTest {

}
