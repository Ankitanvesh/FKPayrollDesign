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

    FlatSalaryEmployee(double monthlySalary,boolean isSalesEmployee,double commisionRate,int payType){
        this.monthlySalary=monthlySalary;
        this.isSalesEmployee=isSalesEmployee;
        this.commisionRate = commisionRate;
        this.isUnionMember= false;
        this.unionDues= 0.0;
        xtraSalaryToBePaid=0;
        this.payToBankAccount=false;
        this.payToPaymaster=false;
        this.payToPostalAddress=false;
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

    public void Update(){
        xtraSalaryToBePaid=0.0;    
     }

     public void updateSalary(int salescount, String dated){
         if(salescount>0 && isSalesEmployee==true){
            double xtraSalary = (double)((double)salescount * commisionRate);
            xtraSalaryToBePaid = xtraSalaryToBePaid + xtraSalary;  
        }
        else if(salescount>0 && isSalesEmployee==false){
            System.out.println("Inconsistent action detected. This feature can be used only by Sales employees Kindly ");
        }
        else if(salescount<0){
            System.out.println("Inconsistent sale count detected. Enter consistent information and try again");
        }
                
     }
     public double getSalary(){
          this.salaryToBePaid = monthlySalary + xtraSalaryToBePaid;
          return this.salaryToBePaid;
     }

     public static void main(String[] args) {
        FlatSalaryEmployee fat = new FlatSalaryEmployee(2.0,true,4.0,1);
        String s="abcd";
        fat.updateSalary(4, s);
        System.out.println( "  "+ fat.getSalary());
    }

    
}