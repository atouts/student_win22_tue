/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_win22_tue;

public class StudentList {
  public static void main(String[] args) {
      student[]studentList=new student[3];
      studentList[0]=new student("s1", "Safa Atout");
      studentList[1]=new student("s2", "Shadi Albustami");
      studentList[2]=new student("s3", "Husni Albustami");
      
      for(int i=0; i<studentList.length;i++){
        System.out.print(studentList[i].getStudentId());
        System.out.print("    ");
        System.out.println(studentList[i].getStudentName());
      }
  }  
}
