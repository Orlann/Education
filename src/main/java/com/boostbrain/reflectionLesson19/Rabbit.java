package com.boostbrain.reflectionLesson19;

public class Rabbit {

    @Deprecated
    @RabbitAnnotation
    private String Name;

    @Deprecated
    @SuppressWarnings(value = "")
    private String Age;

    public String getName() {
        return Name;
    }

    public String getAge() {
        return Age;
    }
}
