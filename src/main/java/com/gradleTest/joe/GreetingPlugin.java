package com.gradleTest.joe;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by joe321 on 2016/12/19.
 */
public class GreetingPlugin implements Plugin<Project> {
    public void apply(Project target) {
        target.getTasks().create("hello", GreetingTask.class);
    }
}
