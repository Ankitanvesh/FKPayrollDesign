package learnJava;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
import java.io.File;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 

public class DeleteEmployee {
    private String name;
    private String filename;
   public void exec(){
    System.out.println("Enter the name of the Employee that needs to be deleted");
    Scanner sc = new Scanner(System.in);


            
       this.name=sc.nextLine();
       this.filename=this.name + ".json";
    
        File myObj=new File("/home/ankit/Desktop/Flipkart/FKPayrollDesign/DataBase/"+filename);
        if (myObj.delete()) { 
            System.out.println("Deleted the file: " + myObj.getName());
          } else {
            System.out.println("Failed to delete the file.");
          } 

   }
   public static void main(String[] args){

    }

}