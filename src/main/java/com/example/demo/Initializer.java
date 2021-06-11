package com.example.demo;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * Reference: https://www.baeldung.com/running-setup-logic-on-startup-in-spring
 */
public class Initializer implements InitializingBean {

    /* Order of execution */

    /** first */
	@PostConstruct
	private void check() {
		System.out.println("\tPost construct");
	}

    /** second */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.printf("\tWelcome to InitializingBean %s\n", "Aadavan");
    }

    /** third */
    private void init() {
        System.out.println("\tInit test.");
    }

}
