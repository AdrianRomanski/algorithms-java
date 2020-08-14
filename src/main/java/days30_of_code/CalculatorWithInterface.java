package days30_of_code;



interface AdvancedArithmetic{
    int divisorSum(int n);
}

class CalculatorWithInterface implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sum+=i;
            }
        }
        return sum;
    }
}

