package com.company;

import java.util.Arrays;

public final class Dog extends Pet{

    private String name;
    private String breed;
    private String[] commands;

    public Dog(String name, String breed, String[] commands,
               Shelter shelter, ColorEnum colorEnum) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColorEnum(colorEnum);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed,
               Shelter shelter, ColorEnum colorEnum) {
        this.name = name;
        this.breed = breed;
        super.setColorEnum(colorEnum);
        super.setShelter(shelter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    void makeVoice(String voice, int number){
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






