package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(ageTemperature(21,35));
        System.out.println(ageTemperature(15,46));
        System.out.println(ageTemperature(20,45));
        System.out.println(ageTemperature(46,-5));
        System.out.println(ageTemperature(30,-1));
    }
    //возраст человека и температуру на улице
    public static String ageTemperature(int age, int temperature){
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30){
            return "Можно идти гулять";
        }else if (age > 20 && temperature >= 0 && temperature <= 28){
            //меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов
            return "Можно идти гулять";
        }else if (age > 45 && temperature >= -10 && temperature <= 25){
            // от -10 до 25
            return "Можно идти гулять";
        }else {
            return "Оставайтесь дома";
        }
    }
}
