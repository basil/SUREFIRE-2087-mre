package test;

public class Calculator {

    public int sum(int first, int second) {
        if (first == 0) {
            // intentional bug
            first += 1;
        }
        return first + second;
    }
}
