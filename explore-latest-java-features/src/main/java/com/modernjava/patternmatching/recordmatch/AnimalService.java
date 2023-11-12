package com.modernjava.patternmatching.recordmatch;

public class AnimalService {

    public String retrieveName(Animal animal){
        return switch (animal){
            case Cat cat -> cat.name();
            case Dog dog -> dog.name();
            case null, default -> ""; // This handles the null pointer exception.
        };
    }
    public String retrieveNameV2(Animal animal){
        return switch (animal){
            case Cat(var name, var color) -> name;
            case Dog(var name, var color) -> name;
            case null, default -> ""; // This handles the null pointer exception.
        };
    }
    public String retrieveNameGuardedPattern(Animal animal){
        return switch (animal){
            case Cat(var name, var color) when  name==null-> "";
            case Cat(var name, var color) -> name;
            case Dog(var name, var color) -> name;
        };
    }
}
