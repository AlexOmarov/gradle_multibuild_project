package ru.somarov;

import static ru.somarov.Singleton.*;

public class Main {
    public static void main(String[] args) {
        INSTANCE.sayHello(new CustomData("Wow, it works!","Wow, it works!").getCode());
    }
}
