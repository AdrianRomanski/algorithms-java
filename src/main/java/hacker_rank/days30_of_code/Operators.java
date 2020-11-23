package hacker_rank.days30_of_code;
//Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent
// (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
public class Operators {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip_percent_double = (double) tip_percent / 100;
        System.out.println(tip_percent_double);
        double tax_percent_double = (double) tax_percent / 100;
        System.out.println(tax_percent_double);
        float totalCost = Math.round(meal_cost +
                            (meal_cost * tip_percent_double) + (meal_cost * tax_percent_double));
        totalCost = Math.round(totalCost);
        System.out.println( (int) totalCost);
    }

    public static void main(String[] args) {

        solve(12.00, 20, 8);

    }

}
