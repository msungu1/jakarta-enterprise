package com.Remote;

import com.demo.methods.IReverseString;
import jakarta.ejb.Stateless;
import java.util.Scanner;

/**
 *
 * @author m.dossa
 */
@Stateless
public class StringReversalBean implements IReverseString {

    @Override
    public void reverseString() {
        String inputString, reversedString = "";
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the string to be reversed
        System.out.println("Enter the string you want to reverse: ");
        inputString = sc.nextLine();

        int lenght = inputString.length();

        for (int n = lenght - 1; n >= 0; n--) {
            reversedString += inputString.charAt(n);
        }

        System.out.printf("InputString: %s\nReversed String: %s", inputString, reversedString);

    }

}
