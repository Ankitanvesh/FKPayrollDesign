# FKPayrollDesign

### Prerequisites

In order to run the Appliaction The firm needs to follow the following steps:
* Clone the repo in your working directory
* To run the application move into your working directory and type the 
   following in the terminal  
   ```
    javac -d . Home.java
    ```
    Then type
    ```
    java learnJava.Home
    ```
* In order to run the application you would need to install the a jar file
    namely json-simple-1.1.1.jar.
* Then follow the instructions as described in the below link
* [Link to installation guide](https://www.tutorialspoint.com/json_simple/json_simple_quick_guide.htm) - Follow the link to set up JSON.simple(a simple Java based toolkit for JSON) 
* And you will be prompted with a welcome message and from this point on 
    you can use the application to manage the employees of your firm.



### Assumptions

*  The employees of the firm are divided into two major categories 
    HourlyEmployee and the FlatSalaryEmployee. The FixedSalaryEmployee
    is further subdivided into category of employees namely, 
    SalesFlatSalary employee and NonSalesFixedSalary Employee.
*  The two types of employees mentioned above are type 1 and type 2
    are reffered to as type 1 and type 2 internally.      
*  The functionality of adding a new Employee and deleting an existing  
    employee must be used only by the Admin who has the authority to add and delete employees
* The Admin when attempting to add a new employee needs to be aware of
    all the employee ranging from the type of employee to his bank account details. Similarly, When attempting to delete an existing employee the
    Admin must be aware of the name and type of the employee.(Although a newer version of the Application will allow the Admin to delete the Employee using only his name)
*  The posting a time card option will be available to only the
    hourlyEmployees where they can post the details of the time card. Hence
    only the hourlyEmployees may have access to the option.
*  The posting a Sales recipt option will be available to only the
    SalesFlatSalaryEmployees where they can post the details of their sales receipt. Hence only the hourlyEmployees may have access to the option
*  It has been assumed by the application that the SalesFixedSalary employee
    has a fixed commision rate on every sale which will be determined at the time of his joining by the admin. Payment in terms of sales receipt is done by using the number of sales and commision on every sale made.The employee will be getting salary every friday as well as at the end of
    the month.
*  Details about the union membership of a employee, service charges will
    be posted by the EmployeeUnion Admin. To post union membership of the 
    employee the Admin is expected to provide the name and type of employee. To post a service charge the Admin will again be needed to provide with
    name and type of the employee and service charge to be charged.
*  The feature changing employeeDetails can only be accessed by the
    admin. For changing any option the employee name and type must be provided by the admin.
*  The PayRolling feature will be run at the end of every day and 
    update the due salaries for the employee and on appropriate days will pay the employee.           

### Design Thinking 
* All aspects of design covered have been mentioned in the commits leading
    to the completion of the part of project.
*   To view the class diagram follow the steps below
* [Link to viewer for UmlFiles](https://app.diagrams.net/)
* Then add the existing file ClassDiagram.drawio from your local directory
and view its contents. 