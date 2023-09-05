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
public class SocSecException extends Exception 
{
    public SocSecException(String error) 
    {
        super("Invalid social security number: " + error);
    }
}
