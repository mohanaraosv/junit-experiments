package com.mycompany.junit.example;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.mycompany.junit.category.RegressionTestGroup;

public class RegressionExampleTest extends AbstractTest {

    @Test
    @Category(RegressionTestGroup.class)
    public void testRegression() {
        System.out.println("RegressionTestExample: testRegression");
    }

}
