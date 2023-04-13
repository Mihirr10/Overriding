package com.overriding.student;

public class CommerceStudent extends Student{

  float commerceStudentFees=20000;

  @Override
  public double fees() {
    return super.admissionFees + commerceStudentFees;
  }
}
