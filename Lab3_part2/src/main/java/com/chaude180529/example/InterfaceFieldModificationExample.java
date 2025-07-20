package com.chaude180529.example;

class Constants {
    public static final int MAX_USERS = 100;

    // Ngăn tạo object từ class này
    private Constants() {
        throw new UnsupportedOperationException("Utility class");
    }
}

public class InterfaceFieldModificationExample {
    public static void main(String[] args) {
        System.out.println(Constants.MAX_USERS);
    }
}
