# Zoo Negara Ticket Price Calculator

Zoo Negara Ticket Price Calculator is a simple Java application that calculate total ticket price based on residence status, quantity of tickets and age. This project was developed for the course Principles of Computer Programming - ISB10103 at the Universiti Kuala Lumpur.

## License

The source code has been published on GitHub Repository under  _MIT License_.  
Please visit  `LICENSE`  file to read the details about the license.

## About the project

The project focus on implementation of basic fundamentals principle of programming using Java. However, I also made some modification in the existing Java file to apply the Object Oriented Programming (OOP) concept as in folder `src/OOP`. The source code that are without OOP implementation is at folder `src/Non OOP`.

Programming concept that I applied in this project are:
- Declaring and identify **variables** and its **datatype**
- **Fetching input** from user using `Scanner` class.
- **Assigning user input** to the variables.
- Using **sentinel** loop to start or stop getting user input.
- Using **nested loop** within a loop.
- Using **for loop** to calculate total ticket price.
- **Create instance** named `myZooProcess` of class `ZooApp`.
- **Pass parameter** named `statusResidence` to the object `myZooProcess`.
- Create new **separate class** named `ZooApp` for calculation process.
- Initialize **constructor** in class `ZooApp`, in this case is constructor with parameter `int  s`.
- Using **non-void method** with **three parameter** named `adultQty, childQty, seniorQty` to return calculated price which will return as integer datatype.
- Using **switch case statement** to set price of each category; Adult, Child or Senior.
- Using **array** to store price and quantity of the ticket.

## Project Requirements
Zoo Negara determines their admission fees based on the age of the guest and their status of residence. Create a program that asks the user to enter the status of residence, and quantity of the tickets (based on the age). Program should display the admission cost with an appropriate message.
Below is the pricing table:
|   | Malaysian | Asean | Others |
| :-------------: | :-------------: | :-------------: | :-------------: |
|Adult| RM44 | RM63 | RM85 |
|Children<br>(3 to 12 years old)| RM16 | RM33 | RM43 |
|Senior Citizen<br>(60 years and above)| RM21 | RM63 | RM85 |

## How it works ?

The source code is available on folder `src`. There are two folder which are `OOP` and `Non OOP`. Both of them are delivering and producing the same output but with different implementation in terms of its coding style.

For Non OOP code version, the main class is located at folder `src/Non OOP` and file name is `ZooAppTest.java`. OOP version located at folder `src/OOP` and main class name is `Main.java`.

1. Call the `Scanner` class to retrieve input from a user.
2. Declare variables named `sentinelLoop`, `adultQty`, `childQty`, `seniorQty`, `statusResidence`.
3. Use sentinel loop; input any value to start or input value `0` stop getting input from users.
4. Input residence status; Malaysian, Asean or Others. If the input value is not within the accepted range, then an error message will be shown.
5. Input ticket quantity for each category; Adult, Child and Senior.
6. Invoke method `GetPrice` from class object `myZooProcess`. Since method `GetPrice` is a non-void method that return value as an integer datatype, I will assign the return value to variable named `totalFees`.
7. Print `totalFees` and display the output of total ticket price.
8. Update the sentinel loop value; input any value to start again or input value `0` stop getting input from users.

## Output

### 1. General Output
<img src="https://raw.githubusercontent.com/iamashraff/Zoo-Negara-Ticket-Price-Calculator/main/img/Output1.png" width=500>

### 2. Output : If user initialize sentinel value is 0
<img src="https://raw.githubusercontent.com/iamashraff/Zoo-Negara-Ticket-Price-Calculator/main/img/Output%202.png" width=380>


### 3. Output : If user input value of Residence Status is 1 which is “1 – Malaysian”

<img src="https://raw.githubusercontent.com/iamashraff/Zoo-Negara-Ticket-Price-Calculator/main/img/Output_Malaysian.png" width=380>
<br>
<p  align="center">
<img src="https://raw.githubusercontent.com/iamashraff/Zoo-Negara-Ticket-Price-Calculator/main/img/Output_DryRun_Malaysian.png" width=700><br>
Dry run table to prove that the calculation process acts accordingly
</p>

### 4. Output : If user input value of Residence Status is 2 which is “2 – Asean”
<img src="https://raw.githubusercontent.com/iamashraff/Zoo-Negara-Ticket-Price-Calculator/main/img/Output_Asean.png" width=380>
<br>
<p  align="center">
<img src="https://raw.githubusercontent.com/iamashraff/Zoo-Negara-Ticket-Price-Calculator/main/img/Output_DryRun_Asean.png" width=700><br>
Dry run table to prove that the calculation process acts accordingly
</p>

### 5. Output : If user input value of Residence Status is 3 which is “3 – Others”
<img src="https://raw.githubusercontent.com/iamashraff/Zoo-Negara-Ticket-Price-Calculator/main/img/Output_Others.png" width=380>
<br>
<p  align="center">
<img src="https://raw.githubusercontent.com/iamashraff/Zoo-Negara-Ticket-Price-Calculator/main/img/Output_DryRun_Others.png" width=700><br>
Dry run table to prove that the calculation process acts accordingly
</p>

### 6. Output : If user input value of Residence Status other than 1,2 or 3.
<img src="https://raw.githubusercontent.com/iamashraff/Zoo-Negara-Ticket-Price-Calculator/main/img/Output_OtherValue.png" width=380>

### References
Liang, Y. D. (2014). _Introduction to JAVA Programming: Comprehensive Version_. Pearson.

## Credit

**Developed by :**  
Muhamad Ashraff Othman  
© 2021 All rights reserved.
