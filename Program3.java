//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3{
    public static void main(String[] args) {
        //Declare Variables 
        int length = 0; 
        int width = 0;
        
        //Create my scanner
        Scanner numScanner = new Scanner(System.in);
        
        //Ask for user intput
        System.out.println("Enter the length: ");
        length = numScanner.nextInt(); 
        
        System.out.println("Enter the width: ");
        width = numScanner.nextInt();
        
        //Calc 
        int area = length * width; 
        int perimeter = 2*length + 2*width;
        
        //Print results 
        System.out.println("The lenght is: " + length);
        System.out.println("The width is: " + width);
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}



//Paste console output below:
/*
Enter the length: 
143
Enter the width: 
82
The lenght is: 143
The width is: 82
The area is: 11726
The perimeter is 450
*/
