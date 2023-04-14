package com.overriding.student;

public class ScienceStudent extends Student {

  float scienceStudentFees = 30000;

  @Override
  public double fees() {
    return super.admissionFees + scienceStudentFees;
  }
}
