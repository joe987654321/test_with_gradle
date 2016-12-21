package com.gradleTest.joe;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class GreetingTask extends DefaultTask {
    String greeting = "hello from GreetingTask2";

    @TaskAction
    public void greet() {
        System.out.println(greeting);
    }
}