package com.company;

public class RegistryOffice {
    public static void married(Man man, Woman woman) {
        if (man.getAge() < 18 && woman.getAge() < 18) {
            System.out.println("Жениться нельзя");
        } else {
            man.setWife(woman);
            woman.setHusband(man);
            for (Human human : woman.getChildren()) {
                if (man.getChildren().contains(human)) {
                    continue;
                } else man.addChild(human);


            }
            for (Human human : man.getChildren()) {
                if (woman.getChildren().contains(human)) {
                    continue;
                } else woman.addChild(human);
            }

        }

        System.out.println(woman.getName()+ "/"+ woman.getAge()+" лет");
        System.out.println(man.getName()+ "/" + man.getAge()+" лет");
    }
}

