package learnJava;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
//import Employee.java;

interface Employee{
  void Update();
  void updateSalary(int a,String b);
  void setUnionMembership();
  void unionWeeklyDeduction();
  void unionServiceChargeDeduction(double serviceCharge);  
  double getSalary();
  
}

public class GenEmployee {
    public static void main(String[] args){
        new GenEmployee();
    }
}