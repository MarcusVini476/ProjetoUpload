package br.com.MarcusVinicius.Runner;

import org.junit.runner.RunWith;

import br.com.MarcusVinicius.configuracoes.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = {"br.com.MarcusVinicius.configuracoes",
				"br.com.MarcusVinicius.Web"},
		tags = "@web",
		plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber-reports.html" },
		dryRun = false,
		snippets = SnippetType.CAMELCASE
		)
public class RunTest extends BaseTest{

}
