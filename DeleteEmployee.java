package learnJava;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
import java.io.File;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 

public class DeleteEmployee {
    private String name;
    private String filename;
   public void exec(){
    System.out.println("Enter the name of the Employee that needs to be deleted");
    Scanner sc = new Scanner(System.in);
    
                
       this.name=sc.nextLine();
       System.out.println("Enter the name of the Employee that needs to be deleted");
       
       int type;
       type = sc.nextInt();
       if(type==1){
           this.filename="DataBase/";
       }
       else{
           this.filename="DataBase2/";
       }
        this.filename=this.filename+this.name + ".json";
        
       try{ 
       
        Object obj = new JSONParser().parse(new FileReader("/home/ankit/Desktop/Flipkart/FKPayrollDesign/"+filename)); 
          
        JSONObject jo = (JSONObject) obj; 
       System.out.println(type);
          File myObj=new File("/home/ankit/Desktop/Flipkart/FKPayrollDesign/"+filename);
            try{
                if (myObj.delete()) { 
                    System.out.println("Deleted the file: " + myObj.getName());
                  } else {
                    System.out.println("Failed to delete the file.");
                  }
                }
                catch(Exception e){
                    e.printStackTrace();
                }


        }catch(Exception e){
            e.printStackTrace();
        }   
       

   }
   public static void main(String[] args){

    }

}