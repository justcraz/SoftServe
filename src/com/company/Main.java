package com.company;

public class Main {
public static boolean isPrime(int n) {
    boolean result = true;
    for (int i = 2; i < n; i++) {
        if (n % i == 0 ){
            result = false;
            System.out.println(i);
            break;
        }
    }
    return result;
}
    public static void main(String[] args) {
        System.out.println(isPrime(11));
        System.out.println(isPrime(18));
        System.out.println(isPrime(31));
    }
}
