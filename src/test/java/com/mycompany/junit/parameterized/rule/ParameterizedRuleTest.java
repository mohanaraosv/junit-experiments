package com.mycompany.junit.parameterized.rule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedRuleTest {

    private final String sample;

    @Rule
    public SkipScenarios rule = new SkipScenarios();

    public ParameterizedRuleTest(final String sample) {
        this.sample = sample;
        rule.setSample(sample);
    }

    @Parameters
    public static Collection<Object[]> generateSamples() {
        final List<Object[]> samples = new ArrayList<Object[]>();
        samples.add(new Object[] { "a" });
        samples.add(new Object[] { "b" });
        samples.add(new Object[] { "c" });
        return samples;
    }

    @Test
    @Samples({ "b", "c" })
    public void test01() {
        System.out.println("b" + " c");
    }

    @Test
    @Samples({ "a", "c" })
    public void test02() {
        System.out.println("a" + " c");
    }

    @Test
    @Samples({ "a", "b" })
    public void test03() {
        System.out.println("b" + " b");
    }
}