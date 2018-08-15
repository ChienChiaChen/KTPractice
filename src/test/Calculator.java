package test;

public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        // 计算整数相加的表达式的结果
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
}
