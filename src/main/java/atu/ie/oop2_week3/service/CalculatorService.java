package atu.ie.oop2_week3.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int add(int a, int b) {
        return a+b;
    }

    public int devide(int a, int b) {
        return a/b;
    }


}
