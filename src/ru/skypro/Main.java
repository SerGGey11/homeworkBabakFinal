package ru.skypro;

public class Main {

    public static void main(String[] args) {
        byte a = 1;
        short b = 235;
        int c = 5555;
        long d = 123L;
        float e = 1.23f;
        double f = 25.1356D;

        float weightFighterOne = 78.2f;
        float weightFighterTwo = 82.7f;

        float totalWeight = weightFighterTwo + weightFighterOne;
        System.out.println("Общий вес бойцов " + totalWeight + "кг!");

        float differenceWeight = weightFighterTwo - weightFighterOne;
        System.out.println("Разница бойцов в весе составляет " + differenceWeight + "кг!");

    }}




















