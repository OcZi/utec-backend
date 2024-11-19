package com.github.utec.utecbackend;

public interface Fibonacci {

    static Long fib(int num) {
        if (num == 0) {
            return 0L;
        } else if (num == 1) {
            return 1L;
        } else {
            return fib(num - 1) + fib(num - 2);
        }
    }
}
