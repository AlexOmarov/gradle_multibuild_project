package ru.somarov.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class BuildSrcExternalPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        BuildSrcExternalPluginExtension extension = project.getExtensions()
                .create("BuildSrcExternalPluginExtension", BuildSrcExternalPluginExtension.class);

        project.task("buildSrcExternalPluginTask")
                .doLast(task -> {
                    System.out.println("Hello, " + extension.getGreeter());
                    System.out.println("I have a message for you: " + extension.getMessage());
                });
    }
}

