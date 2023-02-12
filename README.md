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

### General Output
<img src="https://raw.githubusercontent.com/iamashraff/Zoo-Negara-Ticket-Price-Calculator/main/img/Output1.png" width=500>

### Output : If user initialize sentinel value is 0
<img src="https://raw.githubusercontent.com/iamashraff/Zoo-Negara-Ticket-Price-Calculator/main/img/Output%202.png" width=400>
