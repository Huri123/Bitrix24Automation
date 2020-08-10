package com.bitrix24.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = {
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/bitrix24/step_definitions"
 //       tags = "@fileUploading",
 //       dryRun = false  bu false ise bunun bir anlami yok. aslinda true deyince snippet uretmesi gerekiyordu. Ama false da snippet da uretti. sanirim cucumber son versionundan dolayi

)
@RunWith(Cucumber.class)
public class TestRunner {
}
