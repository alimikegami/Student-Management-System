/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.Scanner;

/**
 *
 * @author alimi
 */
public class utility {
    public static boolean getBool(String msg) {
        boolean ans;
        
        Scanner inputUser = new Scanner(System.in);
        System.out.print(msg + "? <y/n>: ");
        String answer = inputUser.next();
        ans = answer.equalsIgnoreCase("y");
        
        return ans;
    }
}
