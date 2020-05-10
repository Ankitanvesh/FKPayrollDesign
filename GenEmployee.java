package learnJava;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
//import Employee.java;

interface Employee{
  void Update();
  void updateSalary(int a,String b,double c,double d);
  void setUnionMembership();
  void unionWeeklyDeduction(double a);
  double getCurrDues();
  void unionServiceChargeDeduction(double a,double serviceCharge);  
  double getSalary(double a);
  
}

public class GenEmployee {
    public static void main(String[] args){
        new GenEmployee();
    }
}