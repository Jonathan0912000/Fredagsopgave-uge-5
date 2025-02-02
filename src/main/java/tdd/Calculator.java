package tdd;
import java.util.ArrayList;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }
    public int add(String a){
        int finalNumber = 0;
        if (a.contains(",")) {
            String[] data = a.split(",");
            for(String numbers : data){
                finalNumber += Integer.parseInt(numbers);
            }
        }
        return finalNumber;
    }
    public int add(int[] numbers){
        int finalNumber = 0;
        for (int number : numbers) {
            finalNumber += number;
        }
        return finalNumber;
    }
    public int subtract(int a, int b) {
        return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        return a/b;
    }
}
