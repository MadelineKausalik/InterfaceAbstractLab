package lab1;

import javax.swing.JOptionPane;


public class IntroJavaCourse extends CollegeCourse {
    
   private String prerequisites;
    
    public IntroJavaCourse(String courseName, String courseNumber, double Credits, String prerequisites) {
        
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCredits(Credits);
        setPrerequisites(prerequisites);
        
    }
        @Override
        public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        
        this.prerequisites = prerequisites;
        
}
        
        
}
