import java.util.Scanner;
public class ComplexNumber {
    private double imaginaryNum;
    private double realNum;
    public ComplexNumber(double real, double imaginary) {
        this.realNum = real;
        this.imaginaryNum = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        // Add the real and imaginary components separately
        return new ComplexNumber(realNum + other.realNum, imaginaryNum + other.imaginaryNum);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        // Subtract the real and imaginary components separately
        return new ComplexNumber(realNum - other.realNum, imaginaryNum - other.imaginaryNum);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        // Foil the
        double newImaginary = realNum * other.imaginaryNum + imaginaryNum * other.realNum;
        double newReal = realNum * other.realNum - imaginaryNum * other.imaginaryNum;

        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        // Perform division using the complex conjugate
        double divisor = other.realNum * other.realNum + other.imaginaryNum * other.imaginaryNum;
        double newReal = (realNum * other.realNum + imaginaryNum * other.imaginaryNum) / divisor;
        double newImaginary = (imaginaryNum * other.realNum - realNum * other.imaginaryNum) / divisor;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return realNum + " + " + imaginaryNum + "i";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loopTrigger = 0;
        while(loopTrigger!=-1) {
            System.out.println("Select which mathematical operation you would like to implement");
            System.out.println("Type the number 1 for Addition:");
            System.out.println("Type the number 2 for Subtraction:");
            System.out.println("Type the number 3 for Multiplication:");
            System.out.println("Type the number 4 for Division:");
            loopTrigger = scan.nextInt();
            switch (loopTrigger) {
                case 1 -> {
                    System.out.println("Enter real and imaginary parts of first complex number:");
                    double real1 = scan.nextDouble();
                    double imaginary1 = scan.nextDouble();
                    System.out.println("Enter real and imaginary parts of Second complex number:");
                    double real2 = scan.nextDouble();
                    double imaginary2 = scan.nextDouble();
                    ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);
                    ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);
                    ComplexNumber sum = complex1.add(complex2);
                    System.out.println("Sum: " + sum);
                }
                case 2 -> {
                    System.out.println("Enter real and imaginary parts of first complex number:");
                    double real1 = scan.nextDouble();
                    double imaginary1 = scan.nextDouble();
                    System.out.println("Enter real and imaginary parts of Second complex number:");
                    double real2 = scan.nextDouble();
                    double imaginary2 = scan.nextDouble();
                    ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);
                    ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);
                    ComplexNumber difference = complex1.subtract(complex2);
                    System.out.println("Difference: " + difference);
                }
                case 3 -> {
                    System.out.println("Enter real and imaginary parts of first complex number:");
                    double real1 = scan.nextDouble();
                    double imaginary1 = scan.nextDouble();
                    System.out.println("Enter real and imaginary parts of Second complex number:");
                    double real2 = scan.nextDouble();
                    double imaginary2 = scan.nextDouble();
                    ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);
                    ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);
                    ComplexNumber product = complex1.multiply(complex2);
                    System.out.println("Product: " + product);
                }
                case 4 -> {
                    System.out.println("Enter real and imaginary parts of first complex number:");
                    double real1 = scan.nextDouble();
                    double imaginary1 = scan.nextDouble();
                    System.out.println("Enter real and imaginary parts of Second complex number:");
                    double real2 = scan.nextDouble();
                    double imaginary2 = scan.nextDouble();
                    ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);
                    ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);
                    ComplexNumber quotient = complex1.divide(complex2);
                    System.out.println("Quotient: " + quotient);
                }
            }
            System.out.println("Enter -1 to finish the program otherwise type 1");
            loopTrigger = scan.nextInt();
        }
        scan.close();
    }
}