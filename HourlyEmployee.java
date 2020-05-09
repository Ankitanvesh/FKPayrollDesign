package learnJava;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
//import Employee.java;

interface Employee{
  void Update();
  void updateSalary(int a,String b);
  
}


public class HourlyEmployee implements Employee  {
    private double hourlyRate;
    private double salaryToBePaid;
    private boolean isUnionMember;
    private double unionDues;
   // private int hoursWorkedDuringDay;
    
    HourlyEmployee(double hourlyRate){
        //hoursWorkedDuringDay=0;
        this.hourlyRate= hourlyRate;
        this.isUnionMember= false;
        this.unionDues= 0.0;
    }
     
    public void Update(){
       salaryToBePaid=0.0;
       
    }
    
    public void updateSalary(int hoursWorkedDuringDay,String dated ){
       if(hoursWorkedDuringDay>8 && hoursWorkedDuringDay<24){
        double extraHours= (double)hoursWorkedDuringDay -(double)8.0 ;
        double normalHours = 8.0;
        double normalPay =  (double)(normalHours * (double)hourlyRate);
        double xtraRate = (double)(1.5* extraHours);
        double xtraPay = (double)(extraHours * xtraRate);
        salaryToBePaid = salaryToBePaid + normalPay + xtraPay;
         
       }
       else if(hoursWorkedDuringDay<8 && hoursWorkedDuringDay>=0){
        double normalHours = (double)hoursWorkedDuringDay;
        double normalPay =  (double)(normalHours * (double)hourlyRate);
        salaryToBePaid = salaryToBePaid + normalPay;
       }
       else{
         System.out.println("Inconsistent data received Kindly try again");
       }  
    }
    
     public static void main(String[] args) {
        HourlyEmployee hr= new HourlyEmployee(5.0);
        //hr.HourlyUpdate();
       // System.out.println("hours "+ hr.hoursWorkedDuringDay);
        //hr.DailyUpdate();
        String s="abcd";
        hr.updateSalary(4, s);
        System.out.println(hr.hourlyRate + "  "+ hr.salaryToBePaid);
    }
}