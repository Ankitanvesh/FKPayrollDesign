package learnJava;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
//import Employee.java;

interface Employee{
  void Update();
  void updateSalary(int a,String b);
  double getSalary();
  
}

public class FlatSalaryEmployee implements Employee{
    private double monthlySalary;
    private double salaryToBePaid;
    private double xtraSalaryToBePaid;
    private boolean isUnionMember;
    private double unionDues;
    private boolean isSalesEmployee;
    private double commisionRate;

    FlatSalaryEmployee(double monthlySalary,boolean isSalesEmployee,double commisionRate){
        this.monthlySalary=monthlySalary;
        this.isSalesEmployee=isSalesEmployee;
        this.commisionRate = commisionRate;
        this.isUnionMember= false;
        this.unionDues= 0.0;
        xtraSalaryToBePaid=0;

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
        FlatSalaryEmployee fat = new FlatSalaryEmployee(2.0,true,4.0);
        String s="abcd";
        fat.updateSalary(4, s);
        System.out.println( "  "+ fat.getSalary());
    }

    
}