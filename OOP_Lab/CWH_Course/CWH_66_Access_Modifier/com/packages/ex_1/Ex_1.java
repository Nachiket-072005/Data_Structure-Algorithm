package com.packages.ex_1;

public class Ex_1 {
    
    public int a = 45;
    protected int b = 50;
    int c = 65;
    private int d = 85;

    // Same Class - Accessible
    public void meth1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void main(String[] args) {
        System.out.println("Hello...");
    }
}