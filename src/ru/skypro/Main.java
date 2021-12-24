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

        byte bananas = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte eggs = 4;
        byte bananasWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggsWeight = 70;

        long totalBanansWeght = bananasWeight * bananas ;
        long totalMilkWeight = milkWeight * milk;
        long totalIceCreamWeight = iceCreamWeight * iceCream;
        long totalEggsWeight = eggsWeight * eggs;

        long totalBreakfestWeight = totalEggsWeight + totalBanansWeght + totalIceCreamWeight + totalMilkWeight;
        double totalProductsWeight = totalBreakfestWeight / 1000;
        System.out.println("Вес спорт завтрака составляет " + totalProductsWeight + "кг!") ;

        short allResettingWeight = 7000;
        short lostWeightInDay = 250;
        long daysForResetWeight = allResettingWeight / lostWeightInDay;
        System.out.println("Если сбрасывать каждый день по 250 грамм, то это займёт " + daysForResetWeight + "дней!");

        short allResetWeight1 = 7000;
        short lostWeightInDay1 = 500;
        long daysForResetWeight1 =  allResetWeight1 / lostWeightInDay1;
        System.out.println("Если сбрасывать каждый день по 500 грамм, то это займёт " + daysForResetWeight1 + "дней!");

        int mashaWages = 67760;
        int denisWages = 83690;
        int kristinaWages = 76230;

        int mashaProcents = mashaWages * 10 / 100;
        int denisProcents = denisWages * 10 / 100;
        int kristinaProcents = kristinaWages * 10 / 100;

        int mashaFinishWages = mashaWages + mashaProcents;
        int denisFinishWages = denisWages + denisProcents;
        int kristinaFinishWages = kristinaWages + kristinaProcents;

        long mashaWagesInYear = mashaWages * 12;
        long denisWagesInYear = denisWages * 12;
        long kristinaWagesInYear = kristinaWages * 12;

        long mashaFinishWagesInYear = mashaFinishWages * 12;
        long denisFinishWagesInYear = denisFinishWages * 12;
        long kristinaFinishWagesInYear = kristinaFinishWages * 12;

        long mashaDifferentWagesInYear = mashaFinishWagesInYear - mashaWagesInYear;
        long denisDifferentWagesInYear = denisFinishWagesInYear - denisWagesInYear;
        long kristinaDifferentWagesInYear = kristinaFinishWagesInYear - kristinaFinishWages;

        System.out.println("Маша теперь получает " + mashaFinishWages + "рублей, годовой доход вырос на " + mashaDifferentWagesInYear + " рублей!");
        System.out.println("Денис теперь получает " + denisFinishWages + "рублей, годовой доход вырос на " + denisDifferentWagesInYear + " рублей!");
        System.out.println("Кристина теперь получает " + kristinaFinishWages + "рублей, годовой доход вырос на " + kristinaDifferentWagesInYear + " рублей!");










    }}




















