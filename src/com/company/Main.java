package com.company;

import Model.Dobbelsteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Hoofdlus met scanner voor invoer van worp
        String Invoer;
        int result;
        int positie = 1;  // altijd starten op veld 1
        int volgendVeld;  // positie na optellen worp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Een spelletje ganzebord. Druk op q om te stoppen");
        do {
            System.out.println("druk op g voor volgende worp:");
            Invoer = scanner.nextLine(); // invoer één teken
            if (Invoer.charAt(0) == 'g') {
                // rolldice
                Dobbelsteen.rol();
                result = Dobbelsteen.getWorp();  // hoeveel heb je geworpen
                System.out.println("Je hebt " + result + " gegooid.");
                volgendVeld = positie + result;  // eerst vasthouden volgende positie
                // case voor de diverse posities
                switch (volgendVeld) {
                    case 10: // bonus worp
                    case 20:
                    case 30:
                    case 40:
                    case 50:
                    case 60:
                        System.out.println("Op veld " + volgendVeld+ " ,Bonus worp!");
                        positie = volgendVeld + result;
                        break;
                    case 23:  // de gevangenis
                        System.out.println("Veld "+ volgendVeld + ", De gevangenis!");
                        System.out.println("Het spel is uit!");
                        return;
                    case 25:
                        System.out.println("Veld "+ volgendVeld + ", Terug naar start");
                        positie = 1;  // terugzetten van de positie op veld 1
                        break;
                    case 45:
                        System.out.println("Veld "+ volgendVeld + ", Terug naar start");
                        positie = 1;  // terugzetten van de positie op veld 1
                        break;
                    default:
                        positie = volgendVeld;
                }
                // tonen  nieuwe positie
                System.out.println("Je staat nu op veld: " + positie);
                if (positie >= 63){
                    System.out.println("Je hebt de finish gehaald!");
                    return;
                }
            }
        }
        while (Invoer.charAt(0) != 'q');
        scanner.close();
        System.out.println("Stoppen..");
    }
}
