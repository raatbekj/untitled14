package com.company;

import java.util.Arrays;

public class Cat extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Cat(String муся, String name, String breed, String[] commands, Shelter shelter, ColorEnum white) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Cat(String муся, String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String[] getCommands() {
        return commands;
    }void makeVoice(String voice, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    void makeVoice(String voice){
        System.out.println(voice);
    }
    @Override
    public String getInfo() {
        if (commands != null){
            return super.getInfo() +
                    "\nName: " + name +
                    "\nBreed: " + breed +
                    "\nCommands: " + Arrays.toString(commands);
        }else {
            return super.getInfo() +
                    "\nName: " + name +
                    "\nBreed: " + breed;

        }
    }
}










