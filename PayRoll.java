package learnJava;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;

public class PayRoll {
    private int employeeType;
    private Employee obj;
    private double salaryTobePaid;
    PayRoll(Employee obj,int employeeType){
        this.obj=obj;
        this.employeeType = employeeType;
    }  

    String generatePay(){
        salaryTobePaid = obj.getSalary();
        obj.Update();
        String payment = "Paid "+salaryTobePaid + "To the employee";
        return payment;
    }
   public static void main(String[] args) {
        /* Employee hr= new HourlyEmployee(5.0,1);
        String s="abcd";
        hr.updateSalary(4, s);
        System.out.println( "  "+ hr.getSalary()); */
        
        
    }    
}