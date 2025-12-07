public class SalaryCalculator {
    private static final double BASE_SALARY = 1000.00;

    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped >= 5) ? 13 : 10;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold >= 20) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        int multiplier = bonusMultiplier(productsSold);
        return multiplier * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double grossSalary = (BASE_SALARY * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        
        return (grossSalary >= 2000.00) ? 2000.00 : grossSalary; 
    }
}