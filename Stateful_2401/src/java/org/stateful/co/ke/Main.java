package org.stateful.co.ke;

/**
 *
 * @author m.dossa
 */

public class Main {
//    public static DemoExampleBeanRemote demoExampleBean;
    public static void main(String[] args) {
        DemoExampleBeanRemote demoExampleBean = new DemoBeanExample();
        
        // Display the sum of 3 and 5
        System.out.println("3 + 5 = " +  demoExampleBean.add(3, 5));
    }
    
}
