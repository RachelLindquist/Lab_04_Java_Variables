//Accidentally didn't use a template, just creating the main file myself
public class Main {
    public static void main(String[] args){
        //Part 1 A, ints and doubles
        int intOperandA = 11;
        int intOperandB = 2;
        int intSum = 5;
        int intProduct = 12;
        int intDifference = 3;
        int intQuotient = 6;
        int intModulo = 7;

        double doubleOperandA = 5.2;
        double doubleOperandB = 7.4;
        double doubleSum = 9.5;
        double doubleProduct = 4.8;
        double doubleDifference = 8.6;
        double doubleQuotient = 1.6;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum); // Output statement
        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);
        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);

        //Part 1 B, declaring variables

        int familyKids = 0;
        boolean raining = false;
        double gasPrice = 4.84;
        int favNum = 52;
        double shoeSize = 7.5;
        String birthMonth = "May";
        String fullName = "Rachel Marie Lindquist";
    }
}