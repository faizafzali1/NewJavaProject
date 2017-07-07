package faiz;

import java.util.ArrayList;
import java.util.Scanner;

public class June30 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
                
                Scanner sc = new Scanner(System.in);
                
        while (true) {
        	System.out.println("Please enter your name: ");
            String s = sc.nextLine();
            name.add(s);
           
            System.out.println("Do you wanna continue YES/NO key for Exit");
            String exit = sc.nextLine();
            if(exit.equalsIgnoreCase("no")) {
            	break;
            }
        }
        
    }
}
