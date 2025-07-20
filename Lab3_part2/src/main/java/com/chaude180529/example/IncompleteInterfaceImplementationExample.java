package com.chaude180529.example;

interface Shape {
    void draw();
    void resize();
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }

    @Override
    public void resize() {
        System.out.println("Resizing square");
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.draw();
        s.resize();
    }
}
