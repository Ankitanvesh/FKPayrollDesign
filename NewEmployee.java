package learnJava;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
import java.io.File;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 


/* class Utili{
    public static Map<String,Employee> database = new HashMap<String,Employee>();
    
} */

public class NewEmployee {
    private String name;
    private int empType;
    private String postalAddress;
    private String bankAccountDetails;
    private String payStatement;
    private int iD;
    private String filename;
    private double commisionRate=0.0;
    private double hourlyRate=0.0;
    private double monthlySalary=0.0;
    private boolean isSalesEmployee=false;
    private int payType;
    private double salaryToBePaid=0.0;
    private boolean isUnionMember=false;
    private double unionDues=0.0;
     


    public void call(int id) {
        this.iD=id;
        System.out.println("U will be required to submit information");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name : ");
        this.name = sc.nextLine();
        
        System.out.println();
        System.out.println("Enter your employee type based on the below choices");
        System.out.println("1> If you are an hourlyEmployee press 1");
        System.out.println("2> If you are an fixedSalaryEmployee press 2");
        this.empType= sc.nextInt();
        
        
        System.out.println("1> If the employee prefers to be paid to his postal address press 1");
        System.out.println("2> If the employee prefers to be paid to his payMaster press 2");
        System.out.println("3> If the employee prefers to be paid to his bank account press 3");
        this.payType=sc.nextInt();
        sc.nextLine();

        if(this.empType==1){
            System.out.println("Enter hourly rate of employee");
            this.hourlyRate=sc.nextDouble();
            sc.nextLine();
             
            
           
        }


        else if(this.empType==2){
            System.out.println("Enter monthlySalary of employee");
            this.monthlySalary=sc.nextDouble();
            sc.nextLine();
            System.out.println("If the employee is a Sales Empoyee. Press 1.Else press 0");
            int comma = sc.nextInt();
            sc.nextLine();
            this.hourlyRate=0.0;
            isSalesEmployee=false;
            if(comma==1){
                isSalesEmployee=true;
                System.out.println("Enter commision rate of employee");
                this.commisionRate=sc.nextDouble();
                sc.nextLine();
            }
        }
        System.out.println("Enter your postal address ");
        this.postalAddress = sc.nextLine();


        System.out.println("Enter your Bank Account details ");
        this.bankAccountDetails= sc.nextLine();
        this.payStatement="";

        System.out.println("Please wait while the system updates records");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");

        if(empType==1)
        filename="DataBase/";
        else
        filename="DataBase2/";
        filename=filename+this.name + ".json";



        File file = new File("/home/ankit/Desktop/Flipkart/FKPayrollDesign/"+filename);
        try {if (file.createNewFile()) {
            System.out.println("Employee Added to FK"+file.getName());
          }
        }catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }



          JSONObject jo= new JSONObject();
          jo.put("Name", this.name); 
        jo.put("Id", this.iD); 
        jo.put("EmployeeType", this.empType); 
        jo.put("PostalAddress",this.postalAddress);
        jo.put("BankAccountDetails",this.bankAccountDetails);
        jo.put("UnionJoiningDate","");
        jo.put("PayStatement","");
        jo.put("SalaryToBePaid",this.salaryToBePaid);
        jo.put("UnionDues",this.unionDues);
        jo.put("isSalesEmployee",this.isSalesEmployee);
        jo.put("MonthlySalary",this.monthlySalary);
        jo.put("HourlySalary",this.hourlyRate);
        jo.put("CommisionRate",this.commisionRate);

        

        
        
        try{
            PrintWriter pw = new PrintWriter("/home/ankit/Desktop/Flipkart/FKPayrollDesign/"+filename);
            pw.write(jo.toJSONString());
            pw.flush(); 
            pw.close(); 
        }catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        


    }

    public static void main(String[] args){

    }
}