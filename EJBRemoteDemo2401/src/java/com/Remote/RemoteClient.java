package com.Remote;

import com.demo.methods.IReverseString;

/**
 *
 * @author m.dossa
 */
public class RemoteClient {

    // Create an object with an implementation of the IReverseString
    private static IReverseString r_str = new StringReversalBean();
    
    public static void main(String[] args) {
        // Call the method to get, and reverse a user string
        r_str.reverseString();
    }
    
}
