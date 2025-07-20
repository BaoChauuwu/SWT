package com.chaude180529.example;

class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();

        Dog d = new Dog();
        d.speak();
    }
}
