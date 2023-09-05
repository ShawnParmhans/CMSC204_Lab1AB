/*
 Class: CMSC204 CRN 21573
 Program: Activity Lab1A
 Instructor: Gary Thai
 Summary of Description: GradeBook Junit Test creation
 Due Date: 09/04/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Shawn Parmhans
*/
import java.util.Scanner;

public class SoSecProcessor 
{
	public static void main(String[] args)
	{
	//Create scanner and boolean to check if you can continue
	Scanner keyboard = new Scanner(System.in);
	boolean continueProcess = true;
	
	while(continueProcess)
	{
        try {
        	//Receive name and ssn
            System.out.print("Name? ");
            String name = keyboard.nextLine();
            System.out.print("SSN? ");
            String ssn = keyboard.nextLine();
            
            if (isValid(ssn)) {
                System.out.println("Name: " + name);
                System.out.println("Social Security Number: " + ssn);
                System.out.println(ssn + " is valid");
            } else {
                System.out.println("Invalid Social Security Number: " + ssn);
            }

            System.out.print("Continue? (y/n) ");
            String response = keyboard.nextLine();
            if (!response.equalsIgnoreCase("y")) 
                continueProcess = false;
        } 
        catch (SocSecException e) 
        {
            System.out.println("Error: " + e.getMessage());
            System.out.print("Continue? (y/n) ");
            String response = keyboard.nextLine();
            if (!response.equalsIgnoreCase("y")) 
                continueProcess = false;
        }
    }
}
    public static boolean isValid(String ssn) throws SocSecException 
    {
        // Check the length of the SSN
        if (ssn.length() != 11) 
        {
            throw new SocSecException("Invalid SSN length. SSN should be 11 characters");
        }

        // Check for dashes at the correct positions
        if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') 
        {
            throw new SocSecException("Invalid dashes. SSN should be in the format ###-##-####.");
        }

        // Check for non-digits in the SSN
        for (int i = 0; i < ssn.length(); i++) {
            if (i != 3 && i != 6 && !Character.isDigit(ssn.charAt(i))) {
                throw new SocSecException("Invalid character in SSN. SSN should only contain digits");
            }
        }

        return true;
    }

}
