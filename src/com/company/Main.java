package com.company;

public class Main {

    public static void main(String[] args) {


            Shelter shelter = new Shelter("Ромашка","Масалиева 10");

            Dog ovcharka = new Dog("Мухтар", "Немецкая овчарка",
                    new String[]{"Сидеть", "Атаковать"},shelter, ColorEnum.BLACK);
            System.out.println(ovcharka.getInfo());
            ovcharka.makeVoice("Гав гав");
            System.out.println("______________________");

            Dog buldog = new Dog("Спайк", "Бульдог",shelter, ColorEnum.BLACK);
            System.out.println(buldog.getInfo());
            buldog.makeVoice("Гав гав", 3);
        System.out.println("____________________");

            Cat siamese = new Cat("Муся", "Сиямская", "Играть", new
                     String[]{"лижать", "кусь"}, shelter, ColorEnum.GRAY);
        System.out.println(siamese.getInfo());
        siamese.makeVoice("МЯУ МЯУ");
        System.out.println("______________________________");




    }
    }

