/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_win22_tue;

/**
 *
 * @author safa-
 */
public class Part_Time_student extends student {
    private int numCourses;
    
    public Part_Time_student(String studentId,String studentName){
        super(studentId, studentName);
        this.numCourses=numCourses;
    }
    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
}
