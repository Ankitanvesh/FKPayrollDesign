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
        private int iD;


    public void call(int id) {

        String name;
        int empType;
        String postalAddress;
        String bankAccountDetails;
        String payStatement;
        
        String filename;
        double commisionRate=0.0;
        double hourlyRate=0.0;
        double monthlySalary=0.0;
        boolean isSalesEmployee=false;
        int payType;
        double salaryToBePaid=0.0;
        boolean isUnionMember=false;
        double unionDues=0.0;
        
        iD=id;
        System.out.println("U will be required to submit information");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        
        System.out.println();
        System.out.println("Enter your employee type based on the below choices");
        System.out.println("1> If you are an hourlyEmployee press 1");
        System.out.println("2> If you are an fixedSalaryEmployee press 2");
        empType= sc.nextInt();
        
        
        System.out.println("1> If the employee prefers to be paid to his postal address press 1");
        System.out.println("2> If the employee prefers to be paid to his payMaster press 2");
        System.out.println("3> If the employee prefers to be paid to his bank account press 3");
        payType=sc.nextInt();
        sc.nextLine();

        if(empType==1){
            System.out.println("Enter hourly rate of employee");
            hourlyRate=sc.nextDouble();
            sc.nextLine();
             
            
           
        }


        else if(empType==2){
            System.out.println("Enter monthlySalary of employee");
            monthlySalary=sc.nextDouble();
            sc.nextLine();
            System.out.println("If the employee is a Sales Empoyee. Press 1.Else press 0");
            int comma = sc.nextInt();
            sc.nextLine();
            hourlyRate=0.0;
            isSalesEmployee=false;
            if(comma==1){
                isSalesEmployee=true;
                System.out.println("Enter commision rate of employee");
                this.commisionRate=sc.nextDouble();
                sc.nextLine();
            }
        }
        System.out.println("Enter your postal address ");
        postalAddress = sc.nextLine();


        System.out.println("Enter your Bank Account details ");
        bankAccountDetails= sc.nextLine();
        payStatement="";

        System.out.println("Please wait while the system updates records");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        String filename;
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
          jo.put("Name", name); 
        jo.put("Id", iD); 
        jo.put("EmployeeType", empType); 
        jo.put("PostalAddress",postalAddress);
        jo.put("BankAccountDetails",bankAccountDetails);
        jo.put("UnionJoiningDate","");
        jo.put("PayStatement","");
        jo.put("SalaryToBePaid",salaryToBePaid);
        jo.put("UnionDues",unionDues);
        jo.put("isSalesEmployee",isSalesEmployee);
        jo.put("MonthlySalary",monthlySalary);
        jo.put("HourlySalary",hourlyRate);
        jo.put("CommisionRate",commisionRate);

        

        
        
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