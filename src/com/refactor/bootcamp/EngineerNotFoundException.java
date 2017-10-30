package com.refactor.bootcamp;

public class EngineerNotFoundException extends IllegalArgumentException {
    public EngineerNotFoundException(String type) {
        super("engineer not found " + type);
    }
}
