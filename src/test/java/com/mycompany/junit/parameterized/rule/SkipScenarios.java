package com.mycompany.junit.parameterized.rule;

import java.util.Arrays;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * This is used to skip some scenarios when we are using parameterized test cases based on parameters.
 * 
 * @author mohanarao_sv
 *
 */
public class SkipScenarios implements TestRule {

    private String sample;

    public void setSample(final String sample) {
        this.sample = sample;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.junit.rules.TestRule#apply(org.junit.runners.model.Statement, org.junit.runner.Description)
     */
    public Statement apply(final Statement statement, final Description description) {
        Samples annotation = description.getAnnotation(Samples.class);
        // No annotation/samples matching, always run
        if (annotation == null) {
            return statement;
        }
        // Match! One sample value matches current parameterized sample value
        else if (Arrays.asList(annotation.value()).contains(sample)) {
            return statement;
        }
        return new Statement() {

            @Override
            public void evaluate() throws Throwable {

            }
        };
    }
}