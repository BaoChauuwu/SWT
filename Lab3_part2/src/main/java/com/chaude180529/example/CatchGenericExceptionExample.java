package com.chaude180529.example;

public class CatchGenericExceptionExample {
    public static void main(String[] args) {
        try {
            String s = "test"; // thay vì null
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
