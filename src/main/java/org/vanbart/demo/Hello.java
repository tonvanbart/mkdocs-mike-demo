package org.vanbart.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * The super awesome Hello app.
 */
@Slf4j
public class Hello {

    public static void main(String[] args) {
        log.info("Greeting the world");
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.println("Hello, " + args[0] + "!");
        }
    }
}
