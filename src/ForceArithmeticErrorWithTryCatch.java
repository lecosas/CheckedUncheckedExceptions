public class ForceArithmeticErrorWithTryCatch {

    public double dividedByZero(int divisor) {
        try {
            return (10 + 12) / divisor;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

}
