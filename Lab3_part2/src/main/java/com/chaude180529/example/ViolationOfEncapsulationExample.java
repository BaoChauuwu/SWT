package com.chaude180529.example;

class User {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        User u = new User();
        u.setName("Alice");
        u.setAge(21);
        u.display(); // sử dụng class và method
    }
}
