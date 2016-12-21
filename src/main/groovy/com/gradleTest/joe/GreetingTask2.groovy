package com.gradleTest.joe

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GreetingTask2 extends DefaultTask {
    String greeting = "hello from GreetingTask";

    @TaskAction
    public void greet() {
        System.out.println(greeting);
    }
}