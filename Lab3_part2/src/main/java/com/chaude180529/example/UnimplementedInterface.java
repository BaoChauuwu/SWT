package com.chaude180529.example;

interface Drawable {
}

class Circle implements Drawable {
    private void draw() {
        System.out.println("Drawing a circle");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw(); // Sử dụng class và phương thức
    }
}

