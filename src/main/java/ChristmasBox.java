/**
 * Формируется новогодний подарок. Он может включать в себя разные сладости (Jellybean, BestCandy, Bounty)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр.
 * Выводим в консоль общий вес подарка, общую стоимость подарка и информацию о всех сладостях в подарке.
 */

import sweets.Candies;
import sweets.JellyBean;
import sweets.Bounty;
import sweets.BestCandy;

public class ChristmasBox {
    public static void main(String[] args) {
        JellyBean jellybean1 = new JellyBean("Android", 5.0, 0.9, "Green");
        BestCandy bestCandy1 = new BestCandy("Snikers", 6.02, 0.6, "Mars.Co");
        Bounty bounty1 = new Bounty("Bounty", 5.40, 0.5, "USA");
        Candies[] box = {jellybean1, bestCandy1, bounty1};

        double sum = 0.00;
        double totalWeight = 0.00;

        for (int i = 0; i < box.length; i++) {
            System.out.println(box[i].toString());
            sum = sum + box[i].getPrice();
            totalWeight = totalWeight + box[i].getWeight();
        }

        System.out.println("Общая стоимость подарка: " + sum + " usd");
        System.out.println("Общий вес подарка: " + totalWeight + " lbs");

    }
}