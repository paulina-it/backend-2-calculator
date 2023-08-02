package uk.bovykina.calculator._main;

import uk.bovykina.calculator.service.ResultWriterService;
import uk.bovykina.calculator.util.Calculator;

public class _Main {
    public static void main(String[] args){
        float res1 = Calculator.add(24.5F,849);
        ResultWriterService.printResult(24,849, res1, "add");
        float res2 = Calculator.multiply(4.542F,31);
        ResultWriterService.printResult(4.542F,31, res2, "multiply by");
        float res3 = Calculator.substract(42,4.425F);
        ResultWriterService.printResult(42,4.425F, res3, "substract");
    }
}
