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
    
    HourlyEmployee(double hourlyRate,int payType,int salaryToBePaid,int unionDues){
        //hoursWorkedDuringDay=0;
        this.hourlyRate= hourlyRate;
        this.unionDues= 0.0;
        this.payToBankAccount=false;
        this.payToPaymaster=false;
        this.payToPostalAddress=false;
        this.currDues=0.0;
        this.salaryToBePaid=salaryToBePaid;
        this.unionDues=unionDues; 
        if(payType==1){
          this.payToPostalAddress=true;
        }
        else if(payType==2){
          this.payToPaymaster=true;
        }
        else if(payType==3){
          this.payToBankAccount=true;
        }
        
    }

    public void setUnionMembership(){
      this.isUnionMember=true;
    }

    public void unionWeeklyDeduction(double currDues){
      this.currDues=currDues;
      this.currDues = this.currDues + unionDues;
    }
    public double getCurrDues(){
      return this.currDues;
    }
    public void unionServiceChargeDeduction(double currDues,double serviceCharge){
      this.currDues=currDues;
      this.currDues = this.currDues + serviceCharge;
    }
     
    public void Update(){
       salaryToBePaid=0.0;
       
    }
    
    public void updateSalary(int hoursWorkedDuringDay,String dated,double salaryToBe,double currDue ){
        this.salaryToBePaid=salaryToBe;
        this.currDues= currDue;
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
    }

    public double getSalary(double salaryToBePaid){
      ///this.salaryToBePaid= salaryToBePaid;
            return this.salaryToBePaid; 
    }
    
     public static void main(String[] args) {
        
    }
}