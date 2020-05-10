package learnJava;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
//import Employee.java;



public class FlatSalaryEmployee implements Employee{
    private double monthlySalary;
    private double salaryToBePaid;
    private double xtraSalaryToBePaid;
    private boolean isUnionMember;
    private double unionDues;
    private boolean isSalesEmployee;
    private double commisionRate;
    private boolean payToPostalAddress;
    private boolean payToPaymaster;
    private boolean payToBankAccount;
    private double currDues;

    FlatSalaryEmployee(double monthlySalary,boolean isSalesEmployee,double commisionRate,int payType,double salaryToBePaid,double unionDues){
        this.monthlySalary=monthlySalary;
        this.isSalesEmployee=isSalesEmployee;
        this.commisionRate = commisionRate;
        this.isUnionMember= false;
        this.unionDues= 0.0;
        xtraSalaryToBePaid=0;
        this.payToBankAccount=false;
        this.payToPaymaster=false;
        this.payToPostalAddress=false;
        this.unionDues=currDues;
        this.salaryToBePaid=salaryToBePaid;

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
     
    public void setUnionMembership(){
        this.isUnionMember=true;
      }
      

    public void Update(){
        xtraSalaryToBePaid=0.0;    
     }

     public void updateSalary(int salescount, String dated,double salaryToBe,double xtraSalaryPay){
        this.salaryToBePaid=salaryToBe;
        //this.currDues= currDue;
        xtraSalaryToBePaid=xtraSalaryPay;
          double xtraSalary = (double)((double)salescount * commisionRate);
          xtraSalaryToBePaid = xtraSalaryToBePaid + xtraSalary; 
            
                
     }

     public double getWeeklySalary(double xtraSalaryPay,double currDue){
      xtraSalaryToBePaid = xtraSalaryPay;
      currDues=currDue;
      this.salaryToBePaid = xtraSalaryToBePaid - currDues;
      if(this.salaryToBePaid<0){
          currDues = (-1.0 * this.salaryToBePaid);
          this.salaryToBePaid=0;
      }
      else{
          currDues=0;
      }
      return this.salaryToBePaid;
     }

     public double getSalary(double salaryToBePaid){
       this.salaryToBePaid =salaryToBePaid-this.currDues;
        
          return this.salaryToBePaid;
     }

     public static void main(String[] args) {
       /*  FlatSalaryEmployee fat = new FlatSalaryEmployee(2.0,true,4.0,1);
        String s="abcd";
        /* fat.updateSalary(4, s); */
        //System.out.println( "  "+ fat.getSalary());
         
    }

    
}