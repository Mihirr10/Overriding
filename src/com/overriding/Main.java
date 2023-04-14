package com.overriding;

import com.overriding.student.CommerceStudent;
import com.overriding.student.ScienceStudent;
import com.overriding.student.Student;


public class Main {
  public static void main(String[] args) {

    Student student = new Student();
    System.out.println("Admission fees of student:" + student.fees());

    ScienceStudent scienceStudent = new ScienceStudent();
    System.out.println("Total fees of science student:" + scienceStudent.fees());

    CommerceStudent commerceStudent = new CommerceStudent();
    System.out.println("Total fees of commerce student:" + commerceStudent.fees());
  }
}