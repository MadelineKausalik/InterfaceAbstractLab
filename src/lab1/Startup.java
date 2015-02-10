package lab1;

import javax.swing.JOptionPane;

public class Startup {
    
    public static void main(String[] args) {
        
        
        
        CollegeCourse introToProgramming = new IntroToProgrammingCourse("Introduction to Programming","123-456",2.0,"None");
            
        
        System.out.println(introToProgramming.getCourseName());
        System.out.println(introToProgramming.getCourseNumber());
        System.out.println(introToProgramming.getCredits());
        System.out.println(introToProgramming.getPrerequisites());
        
    }
    
    
    
}
