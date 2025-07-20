package com.chaude180529.example;

interface LoginHandler {
    void login(String username, String password);
}

class BaoChau implements LoginHandler {
    @Override
    public void login(String username, String password) {
        System.out.println("BaoChau");
    }

    public static void main(String[] args) {
        BaoChau baoChau = new BaoChau();
        baoChau.login("admin", "admin");
    }
}