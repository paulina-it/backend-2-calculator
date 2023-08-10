package uk.bovykina.calculator.service;

public class ResultWriterService {
    public static void printResult(float n1, float n2, float result, String action) {
        System.out.println(n1 + " " + action + " " + n2 + " = " + result);
    }
}
