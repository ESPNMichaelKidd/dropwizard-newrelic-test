package com.espn.test.newrelic;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class NewrelicApplication extends Application<NewrelicConfiguration> {

    public static void main(String[] args) throws Exception {
        new NewrelicApplication().run(args);
    }
    
    @Override
    public void run(NewrelicConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().disable();
        System.out.println("done");
    }

}
