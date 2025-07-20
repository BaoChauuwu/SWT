
package com.chaude180529.example;


public class UnreachableCodeExample {
    public static int getNumber() {
        System.out.println("This will execute");
        return 42;
    }

    public static void main(String[] args) {
        System.out.println(getNumber());
    }
}
