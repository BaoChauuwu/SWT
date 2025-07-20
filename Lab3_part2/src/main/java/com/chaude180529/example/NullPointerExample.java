package com.chaude180529.example;

public class NullPointerExample {
    public static void main(String[] args) {
        // text có thể null hoặc không, ví dụ nhận từ input
        String text = args.length > 0 ? args[0] : null;

        if (text != null && !text.isEmpty()) {
            System.out.println("Text is not empty");
        } else {
            System.out.println("Text is null or empty");
        }
    }
}
