package loop;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        out:while(b) {
            System.out.println("Input Command ... (q,c,r,u,d)");
            String cmd = sc.next();
            if (cmd.equals("q")) {
                System.out.println("Bye");
                sc.close();
                break;
            }
            switch (cmd) {
                case "c":
                    System.out.println("Create"); break;
                case "r":
                    System.out.println("Input Id .. ");
                    String id = sc.next();
                    System.out.println("Read ID Info...");
                    break;
//                    sc.close();
//                    break out; //while문의 break
                case "u":
                    System.out.println("Update"); break;
                case "d":
                    System.out.println("Delete"); break;
                default:
                    System.out.println("Try Again"); break;
            }
        }
        System.out.println("End ...");
    }
}
