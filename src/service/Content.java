package service;

import entities.Sweets;

import java.util.List;

public class Content {

    private static String podarokTitle=" NOVOGODNYI";
    private static String lollipopType;
    private static int lollipopWeight;
    private static String candyType;
    private static int candyWeight;
    private static String chocolateType;
    private static int chocolateWeight;
    private static int totalVes;


    public static String podarokContent(List<Sweets> sweets) {

        for (Sweets sweet : sweets) {
            if (sweet.getType().equalsIgnoreCase("lollipop")) {
                lollipopType = sweet.getType();
                lollipopWeight += sweet.getWeight();
            } else if (sweet.getType().equalsIgnoreCase("candy")) {
                candyType = sweet.getType();
                candyWeight += sweet.getWeight();
            } else {
                chocolateType = sweet.getType();
                chocolateWeight += sweet.getWeight();
            }

totalVes=chocolateWeight+lollipopWeight+candyWeight;
        }
        String content = String.format("%s contains: konfeti %s weight %d, konfeti %s weight %d, konfeti %s weight %d.\n Total ves is %d", podarokTitle, chocolateType, chocolateWeight, lollipopType, lollipopWeight, candyType, candyWeight, totalVes );
        return content;

    }
}
