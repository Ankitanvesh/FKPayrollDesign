package learnJava;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
//import Employee.java;



public class HourlyEmployee implements Employee  {
    private double hourlyRate;
    private double salaryToBePaid;
    private boolean isUnionMember;
    private double unionDues;
    private double currDues;
    private boolean payToPostalAddress;
    private boolean payToPaymaster;
    private boolean payToBankAccount;
   // private int hoursWorkedDuringDay;
    
    HourlyEmployee(double hourlyRate,int payType){
        //hoursWorkedDuringDay=0;
        this.hourlyRate= hourlyRate;
        this.isUnionMember= false;
        this.unionDues= 0.0;
        this.payToBankAccount=false;
        this.payToPaymaster=false;
        this.payToPostalAddress=false;
        this.currDues=0.0;
        if(payType==1){
          this.payToPostalAddress=true;
        }
        else if(payType==2){
          this.payToPaymaster=true;
        }
        else if(payType==3){
          this.payToBankAccount=true;
        }
        else{
          System.out.println("Invalid type specified");
          System.out.println("Momentarily pay to postal address will be the default mode of payment");
          System.out.println("You Can change the mode later");
          this.payToPostalAddress=true;
        }
    }

    public void setUnionMembership(){
      this.isUnionMember=true;
    }

    public void unionWeeklyDeduction(){
      currDues = currDues + unionDues;
    }
    public void unionServiceChargeDeduction(double serviceCharge){
      currDues = currDues + serviceCharge;
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
        salaryToBePaid = salaryToBePaid - currDues;
        if(salaryToBePaid<0){
          currDues = (-1.0 * salaryToBePaid);
          salaryToBePaid=0.0;
        }
        else{
          currDues=0.0;
        } 
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

    public double getSalary(){
      return this.salaryToBePaid; 
    }
    
     public static void main(String[] args) {
        
    }
}