package learnJava;
import java.util.*;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
import java.io.IOException; 


public class Home {
    private static int Id;
    public static Map<Integer,Employee> empType = new HashMap<Integer,Employee>();
    public static int id=1;
    public String name;


    public static void main(String[] args) {
        System.out.println("Welcome to FK's payroll application");
        System.out.println("We can assign you in one of the following ways");
        System.out.println("1> If you wish to add a new Employee press 1");
        System.out.println("2> If you wish to delete an existing Employee press 2");
        System.out.println("3> If you are a hourlyEmployee and wish to add a time card press 3");
        System.out.println("4> If you are a FlatSalarySalesEmployee and wish to add a sales receipt press 4");
        System.out.println("5> If you wish to post a union related stuff press 5");
        System.out.println("6> If you wish to change an existing Employee's details press 6");
        System.out.println("7> If you wish to run the payroll for press 6");
        Scanner sc = new Scanner(System.in); 

		// String input 
        int reply = sc.nextInt();
        if(reply==1){
             NewEmployee newEmployee = new NewEmployee();
             id++;
             System.out.println(id);
             Id=id;
             newEmployee.call(Id);   
        }
        if(reply==2){
            DeleteEmployee delEmployee = new DeleteEmployee();
            
            delEmployee.exec();
        }
        
    }
}