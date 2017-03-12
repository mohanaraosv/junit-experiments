package com.mycompany.junit.example;

import static org.hamcrest.CoreMatchers.isA;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.mycompany.junit.category.IntegrationTestGroup;

public class IntegrationExampleTest extends AbstractTest {

    @Test
    @Category(IntegrationTestGroup.class)
    public void testIntegration() {
        int numberInLoop = 0;
        for (int i = 0; i < 1000; i++) {
            numberInLoop++;

        }
        System.out.println("IntegrationTestExample : testIntegration");
        Assert.assertThat(numberInLoop, isA(Integer.class));
    }
}
