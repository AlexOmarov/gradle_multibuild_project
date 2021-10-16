package ru.somarov.plugin;

public class BuildSrcExternalPluginExtension {
    private String greeter = "Admin";
    private String message = "Message from the plugin!";

    public String getGreeter() {
        return greeter;
    }

    public void setGreeter(String greeter) {
        this.greeter = greeter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
