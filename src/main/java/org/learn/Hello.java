package org.learn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Jdk8: \t" + new Date());

        Hello test = new Hello();
//        test.testClone();

//        System.out.printf("%d, %d", 23/10, 23%10);
        test.testInt();
    }

    public void testInt(){
        long a = 1000000000;
        System.out.printf("%d:\t\t %d\n", a, a/10);

        a = a*10;
        System.out.printf("%d:\t %d\n", a, a/10);

        a = a*10;
        System.out.printf("%d:\t %d\n", a, a/10);
    }

    public void testClone(){
        List listA = new ArrayList<Integer>();
        listA.add(3);
        listA.add(17);
        listA.add(11);
        System.out.println("listA: \t" +  listA);

        List listB = new ArrayList<Integer>(listA);
        System.out.println("listB: \t" +  listB);

        listB.add(99);
        listB.set(2, 81);

        System.out.println("listA: \t" +  listA);
        System.out.println("listB: \t" +  listB);
    }
}
