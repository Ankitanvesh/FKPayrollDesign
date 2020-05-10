package learnJava;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;



public class NewEmployee {
    private String name;
    private int empType;
    private String postalAddress;
    private String bankAccountDetails;
    private Employee employee;

    public void call(int id){
        System.out.println("U will be required to submit information");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        this.name = sc.nextLine();
        System.out.println();
        System.out.println("Enter your employee type based on the below choices");
        System.out.println("1> If you are an hourlyEmployee press 1");
        System.out.println("2> If you are an fixedSalaryEmployee press 2");
        this.empType= sc.nextInt();
        sc.nextLine();
        //database.put(id, this.name);
        if(this.empType==1){
            this.employee = new HourlyEmployee(2.2,1);  
            //Database.empType.put(id,this.empType);
        }
        else if(this.empType==2){
            //Database.empType.put(id,this.empType);
        }
        else{

        }
        System.out.println("Enter your postal address ");
        //sc.nextLine();
        this.postalAddress = sc.nextLine();
        System.out.println("Enter your Bank Account details ");
        //sc.nextLine();
        this.bankAccountDetails= sc.nextLine();

    }

    public static void main(String[] args){

    }
}