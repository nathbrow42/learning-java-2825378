public class Main {

    public static double calcEmpSalary(double weeklyHours, double payRate, int vacDays) {
        double salary = (weeklyHours * payRate * 52) - (8 * payRate * vacDays);
        return salary;
    };

    public static void main(String[] args) {
        System.out.println(calcEmpSalary(40, 15.75, 5));
    }

}

