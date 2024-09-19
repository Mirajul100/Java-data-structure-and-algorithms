package LinkList;

import java.util.Scanner;

public class MainTest extends SinglyLinkList {
    public static void main(String args[]) {
        SinglyLinkList ll = new SinglyLinkList();
        Node rll = null;
        int s;
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("press 1 to insert first");
            System.out.println("press 2 to print the node value");
            System.out.println("press 3 to insert last node");
            System.out.println("press 4 to insert node value in any position");
            System.out.println("press 5 to delete the first node");
            System.out.println("press 6 to delete the last node");
            System.out.println("press 7 to exit the program");
            System.out.println("press 8 to delete any node value in any position");
            System.out.println("press 9 to reverse the link list");
            System.out.println("press 10 to print the reversed link list");
            System.out.println("press 11 to scarce the node value");
            System.out.print("Enter your choice : ");

            s = input.nextInt();

            switch (s) {
                case 1:
                    ll.InsertFirstLinkList();
                    break;
                case 2:
                    ll.PrintLinkList();
                    break;
                case 3:
                    ll.InsertLast();
                    break;
                case 4:
                    ll.InsertLinListInAnyPosition();
                    break;
                case 5:
                    System.out.println("Deleted first node value is : " + ll.DeleteFirst().getData());
                    break;
                case 6:
                    System.out.println("Deleted last node value is : " + ll.DeleteLast().getData());
                    break;
                case 7:
                    System.exit(s);
                    break;
                case 8:
                    System.out.println("Deleted any position node value : " + ll.DeletedInAnyPosition().getData());
                    break;
                case 9:
                    rll = ll.reverse();
                    break;
                case 10:
                    ll.printR(rll);
                    break;
                case 11:
                    ll.scarce();
                    break;
                default:
                    System.out.println("you enter invalided number !");
                    break;
            }
        }
    }
}