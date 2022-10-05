import java.util.Scanner;

//* =============================================================
//Name : Andy Zhang
//Class : CIS211
//Class Section : 401
//Date : 09/21/2022
//Assignment : Assignment 3 -  Linked Stack, Tower of Hanoi
//Notes :
//Code Used :
//Sites Referenced : https://www.daniweb.com/programming/software-development/threads/437899/transferring-elements-from-stack-to-another
//============================================================== */
public class LinkedStackMain {
    static LinkedStack<Integer> towerOne = new LinkedStack<>();
    static LinkedStack<Integer> towerTwo = new LinkedStack<>();
    static LinkedStack<Integer> towerThree = new LinkedStack<>();

    public static void towerOneOperation(int towerFrom, int towerTo) {
        if ((towerFrom == 1) && (towerTo != 1) && (!towerOne.isEmpty())) {
            if (towerTo == 2) {
                if (!(towerTwo.isEmpty()) && (towerTwo.peek() < towerOne.peek())) {
                    System.out.println("Cannot stack bigger disk on top of smaller disk.");
                }
                else {
                    towerTwo.push(towerOne.pop());
                    System.out.println("Tower 1: " + towerOne + "\n" + "Tower 2: " + towerTwo + "\n" + "Tower 3: " + towerThree);
                }
            }
            else if (towerTo == 3) {
                if (!(towerThree.isEmpty()) && (towerThree.peek() < towerOne.peek())) {
                    System.out.println("Cannot stack bigger disk on top of smaller disk.");
                }
                else {
                    towerThree.push(towerOne.pop());
                    System.out.println("Tower 1: " + towerOne + "\n" + "Tower 2: " + towerTwo + "\n" + "Tower 3: " + towerThree);
                }
            }
        }
        else {
            System.out.println("No disk moved, please try again.");
        }
    }

    public static void towerTwoOperation(int towerFrom, int towerTo) {
        if ((towerFrom == 2) && (towerTo != 2) && (!towerTwo.isEmpty())) {
            if (towerTo == 3) {
                if (!(towerThree.isEmpty()) && (towerThree.peek() < towerTwo.peek())) {
                    System.out.println("Cannot stack bigger disk on top of smaller disk.");
                }
                else {
                    towerThree.push(towerTwo.pop());
                    System.out.println("Tower 1: " + towerOne + "\n" + "Tower 2: " + towerTwo + "\n" + "Tower 3: " + towerThree);
                }
            }
            else if (towerTo == 1) {
                if (!(towerOne.isEmpty()) && (towerOne.peek() < towerTwo.peek())) {
                    System.out.println("Cannot stack bigger disk on top of smaller disk.");
                }
                else {
                    towerOne.push(towerTwo.pop());
                    System.out.println("Tower 1: " + towerOne + "\n" + "Tower 2: " + towerTwo + "\n" + "Tower 3: " + towerThree);
                }
            }
        }
        else {
            System.out.println("No disk moved, please try again.");
        }
    }

    public static void towerThreeOperation(int towerFrom, int towerTo) {
        if ((towerFrom == 3) && (towerTo != 3) && (!towerThree.isEmpty())) {
            if (towerTo == 1) {
                if (!(towerOne.isEmpty()) && (towerOne.peek() < towerThree.peek())) {
                    System.out.println("Cannot stack bigger disk on top of smaller disk.");
                }
                else {
                    towerOne.push(towerThree.pop());
                    System.out.println("Tower 1: " + towerOne + "\n" + "Tower 2: " + towerTwo + "\n" + "Tower 3: " + towerThree);
                }
            }
            else if (towerTo == 2) {
                if (!(towerTwo.isEmpty()) && (towerTwo.peek() < towerThree.peek())) {
                    System.out.println("Cannot stack bigger disk on top of smaller disk.");
                }
                else {
                    towerTwo.push(towerThree.pop());
                    System.out.println("Tower 1: " + towerOne + "\n" + "Tower 2: " + towerTwo + "\n" + "Tower 3: " + towerThree);
                }
            }
        }
        else {
            System.out.println("No disk moved, please try again.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepGoing = true;
        towerOne.push(3);
        towerOne.push(2);
        towerOne.push(1);

        System.out.println("Tower 1: " + towerOne + "\n" + "Tower 2: " + towerTwo + "\n" + "Tower 3: " + towerThree);

        while (keepGoing) {
            int towerTo = 0;
            int towerFrom = 0;
            System.out.print("Pick a tower to move from (1-3): ");
            towerFrom = input.nextInt();
            System.out.print("Pick a tower to move to (1-3): ");
            towerTo = input.nextInt();

            if (towerFrom == 1 && (towerTo < 4 && towerTo > 0)) {
                towerOneOperation(towerFrom, towerTo);
            }
            else if (towerFrom == 2 && (towerTo < 4 && towerTo > 0)) {
                towerTwoOperation(towerFrom, towerTo);
            }
            else if (towerFrom == 3 && (towerTo < 4 && towerTo > 0)) {
                towerThreeOperation(towerFrom, towerTo);
            }
            else {
                System.out.println("Sorry try again.");
            }

            System.out.println("Would you like to continue? Enter Y/N");
            String userInput = input.next().toUpperCase();
            System.out.println("Tower 1: " + towerOne + "\n" + "Tower 2: " + towerTwo + "\n" + "Tower 3: " + towerThree);
            if (userInput.equals("N")) {
                keepGoing = false;
            }
        }
    }
}
