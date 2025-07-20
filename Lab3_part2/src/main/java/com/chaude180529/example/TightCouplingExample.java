package com.chaude180529.example;

class Printer {
    void print() {
        System.out.println("Generating report...");
    }
}

class Report {
    private final Printer printer = new Printer(); // thêm final

    void generate() {
        printer.print();
    }

    public static void main(String[] args) {
        Report report = new Report();
        report.generate(); // sử dụng class và method
    }
}
