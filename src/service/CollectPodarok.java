package service;

import entities.Choco;
import entities.Lollipop;
import entities.Sweets;
import utils.PrintOut;
import java.io.IOException;
import java.util.*;

public class CollectPodarok {

    private static Sorter sorter = new Sorter();
    private static Weight weight = new Weight();
    //private static InOutFile inOutFile=new InOutFile();

    private static List<Sweets> sweets = new ArrayList<>();

    static {
        sweets.add(new Choco("Kommynarka", "chocolate", 45, " milk choc"));
        sweets.add(new Choco("Znichka", "chocolate", 40, " black choc"));
        sweets.add(new Choco("Mishki", "chocolate", 50, " milk choc"));
        sweets.add(new Lollipop("Aeroflot", "candy", 30, " no stick"));
        sweets.add(new Lollipop("Chupa-Chups", "lollipop", 35, " on a plastick stick"));
        sweets.add(new Lollipop("Lizyn", "lollipop", 60, " on a stick"));
        sweets.add(new Lollipop("Petyshok", "lollipop", 55, "on a wooden stick"));
    }

    public static void main(String[] args) throws IOException {
        //PrintOut.printOut(sweets);

        boolean action = true;

        while (action) {

            System.out.println("0. = Exit");
            System.out.println("1. = Find a sweet in podarok");
            System.out.println("2. = Get the weight of podarok");
            System.out.println("3. = Sort podarok by WEIGHT");
            System.out.println("4. = collect sweets to podarok");
            System.out.println("5. = Write In file");
            System.out.println("6. = Read out from file");

            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            switch (choice) {

                case 0:
                    action = false;
                    System.out.println("Completed");
                    break;

                case 1:
                    System.out.println("Enter a sweet name to search:");
                    String nameToFind = scan.next();
                    PrintOut.printOut(sorter.findByName(sweets, nameToFind));
                    break;

                case 2:
                    System.out.println("Weight of podarok is "+ weight.getWeight(sweets));
                    break;

                case 3:
                    //System.out.println("The list of sweets sorted by weight\n"+sorter.sortByWeight(sweets));
                    PrintOut.printOut(sweets);
                    break;

                case 5:
                    InOutFile.writeIn(sweets);
                    break;

                case 6:
                    InOutFile.readOut(sweets);
                    break;
                 default:
                     System.out.println("Try another number");


            }


        }
    }
}
