package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseCalculatorApplication<result> {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseCalculatorApplication.class, args);


    Calculator calc = new Calculator();
    int result = calc.addAtoB(3,6);
    int result2 = calc.minusAfromB(9,2);
    System.out.println(result);
    System.out.println(result2);
    }
}
