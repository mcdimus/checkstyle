package com.puppycrawl.tools.checkstyle;

import com.puppycrawl.tools.checkstyle.api.Configuration;


public class DigesterLoaderTest
{
    public static void main(String[] args)
    {
        try {
            final String inputFname = "src/digester/checkstyle_checks.xml";
            final String rulesFname = "src/digester/checkstyle_rules.xml";
            final Configuration config =
                ConfigurationDigesterLoader.loadConfiguration(
                    rulesFname, inputFname, null);
            System.out.println(config.toString());

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}