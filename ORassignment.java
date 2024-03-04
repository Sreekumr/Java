import java.util.Scanner;
public class ORassignment {

    public static void main(String[] args) {
        LinearProgrammingProblem lpp = new LinearProgrammingProblem();
        lpp.inputCoefficients();
        lpp.solveGraphically();
    }
}

class LinearProgrammingProblem {
    private double[] objectiveFunctionCoefficients = new double[2];
    private double[][] constraintCoefficients = new double[2][2];
    private double[] constraintConstants = new double[2];
    private double[] solution = new double[2];

    public void inputCoefficients() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficients of the objective function (c1 c2): ");
        objectiveFunctionCoefficients[0] = scanner.nextDouble();
        objectiveFunctionCoefficients[1] = scanner.nextDouble();

        System.out.print("Enter coefficients of the first constraint (a11 a12 b1): ");
        constraintCoefficients[0][0] = scanner.nextDouble();
        constraintCoefficients[0][1] = scanner.nextDouble();
        constraintConstants[0] = scanner.nextDouble();

        System.out.print("Enter coefficients of the second constraint (a21 a22 b2): ");
        constraintCoefficients[1][0] = scanner.nextDouble();
        constraintCoefficients[1][1] = scanner.nextDouble();
        constraintConstants[1] = scanner.nextDouble();
    }

    public void solveGraphically() {
        double x1, x2;

        // Calculate the determinant for Cramer's rule
        double determinant = constraintCoefficients[0][0] * constraintCoefficients[1][1]
                - constraintCoefficients[0][1] * constraintCoefficients[1][0];

        if (determinant == 0) {
            System.out.println("No unique solution exists (infinite solutions or no solution)."); 
            return;
        }

        x1 = (constraintConstants[0] * constraintCoefficients[1][1]
                - constraintConstants[1] * constraintCoefficients[0][1]) / determinant;
        x2 = (constraintCoefficients[0][0] * constraintConstants[1]
                - constraintCoefficients[1][0] * constraintConstants[0]) / determinant;

        // Check if the solution satisfies all constraints
        if (checkConstraints(x1, x2)) {
            solution[0] = x1;
            solution[1] = x2;
            System.out.println("Optimal solution found: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("No feasible solution found within the given constraints.");
        }
    }

    public boolean checkConstraints(double x1, double x2) {
        return (constraintCoefficients[0][0] * x1 + constraintCoefficients[0][1] * x2 <= constraintConstants[0])
                && (constraintCoefficients[1][0] * x1 + constraintCoefficients[1][1] * x2 <= constraintConstants[1])
                && (x1 >= 0) && (x2 >= 0);
    }
}