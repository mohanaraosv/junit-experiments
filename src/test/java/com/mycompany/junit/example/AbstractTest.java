package com.mycompany.junit.example;

import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractTest {

    protected final Logger logger    = LoggerFactory.getLogger(getClass());

    @Rule
    public final TestRule  testWatch = new TestWatcher() {

         /**
          * {@inheritDoc}
          */
         @Override
         protected void starting(final Description description) {
             logger.info("About to run {}", description);
             super.starting(description);
         }

         /**
          * {@inheritDoc}
          */
         @Override
         protected void failed(final Throwable e, final org.junit.runner.Description description) {
             logger.error("Test {} failed", description, e);
             super.failed(e, description);
         }
     };
}