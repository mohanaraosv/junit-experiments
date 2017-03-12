package com.mycompany.junit.example;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.mycompany.junit.category.SmokeTestGroup;

public class SmokeExampleTest extends AbstractTest {

    @Test
    @Category(SmokeTestGroup.class)
    public void testSmoking() {
        System.out.println("SmokeTestExample: testSmoking");
    }
}
