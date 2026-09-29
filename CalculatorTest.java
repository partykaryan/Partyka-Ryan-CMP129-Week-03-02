public class CalculatorTest {
    public static void main(String[] args) {
        

    //Creating calculator object
    Calculator calculator = new Calculator();
    
    //Sum of two integers
    int total = calculator.add(7,8);
    
    //Sum of two doubles
    double totalTwo = calculator.add(4.5, 8.75);
    
    //Sum of three integers
    int totalThree = calculator.add(14, 6, 10);
    
    //Concatenated String message
    String message = calculator.add("Hello", "World");


    //Displaying Results
    System.out.println("Sum of two integers:  " + total);
    System.out.println("Sum of two doubles: " + totalTwo);
    System.out.println("Sum of three integers: " + totalThree);
    System.out.println("Concatenated String: " + message);
    
    }//end of main method
}// end of public class
