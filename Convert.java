import java.util.Scanner;

class Convert {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a 
        
        
        
        System.out.println("Enter the first number");
        String num1 = myObj.nextLine(); 
        System.out.println("Enter the first base (2-16)");
        int base1 = myObj.nextInt();
        System.out.println("Enter the second number");
        String num2 = myObj.nextLine(); 
        System.out.println("Enter the second base (2-16)");
        int base2 = myObj.nextInt();
        System.out.println("Number 1: " & num1 & "base : " & base1);
        
        
    }
}
