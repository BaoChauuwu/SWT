package com.chaude180529.example;

class OverCatchingExceptionExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[0] = 42; // Gán giá trị trước khi in
            System.out.println(arr[0]); // Truy cập hợp lệ
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        }
    }
}
