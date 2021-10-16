package ru.somarov;

import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public abstract class BuildSrcExternalTask extends org.gradle.api.DefaultTask {
    private String externalNickname;

    @Input
    public String getExternalNickname() {
        return externalNickname;
    }

    @TaskAction
    public void greet() {
        System.out.println("hello from ru.somarov.BuildSrcExternalTask, " + externalNickname);
    }

    public void setExternalNickname(String externalNickname) {
        this.externalNickname = externalNickname;
    }
}
