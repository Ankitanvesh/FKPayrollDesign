package learnJava;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


 class HourlyEmployee {
    private double hourly_rate;
    private int hoursWorkedDuringDay;
    
    HourlyEmployee(double hourly_rate){
        hoursWorkedDuringDay=0;
        this.hourly_rate= hourly_rate;
    }
    void HourlyUpdate(){
        hoursWorkedDuringDay++;
    }
    int getHoursWorkedDuringDay(){
        
      return this.hoursWorkedDuringDay;  
    }
    String getDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String s=dtf.format(now);
        return s;
    } 
    void DailyUpdate(){
      this.getHoursWorkedDuringDay();
      System.out.println("Before hours "+ hoursWorkedDuringDay);
      this.hoursWorkedDuringDay=0;
      System.out.println("Before hours "+ hoursWorkedDuringDay);  
    }

     public static void main(String[] args) {
        HourlyEmployee hr= new HourlyEmployee(5.0);
        hr.HourlyUpdate();
        System.out.println("hours "+ hr.hoursWorkedDuringDay);
        hr.DailyUpdate();
    }
}