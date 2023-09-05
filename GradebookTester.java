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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester 
{
	private GradeBook gradeBook1;
	private GradeBook gradeBook2;

	@BeforeEach
	void setUp() throws Exception 
	{
        gradeBook1 = new GradeBook(5); 
        gradeBook2 = new GradeBook(5); 
        gradeBook1.addScore(75.0);
        gradeBook2.addScore(95.0);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		gradeBook1 = null;
		gradeBook2 = null;
	}

    @Test
    public void testAddScore() {
        assertTrue(gradeBook1.addScore(75.0));
        assertTrue(gradeBook1.addScore(80.0)); 
    }

    @Test
    public void testSum() {
        assertEquals(75.0, gradeBook1.sum(), 0.01); 
        assertEquals(95.0, gradeBook2.sum(), 0.01); 
    }

    @Test
    public void testMinimum() {
        assertEquals(75.0, gradeBook1.minimum(), 0.01); 
        assertEquals(95.0, gradeBook2.minimum(), 0.01); 
    }

    @Test
    public void testFinalScore() {
        assertEquals(75.0, gradeBook1.finalScore(), 0.01); 
        assertEquals(95.0, gradeBook2.finalScore(), 0.01); 
    }

}
