import java.util.*;
class priceCalculate {
    Scanner scan = new Scanner(System.in);
    private int statusResidence;
    private int adultQty, childQty, seniorQty;

   public priceCalculate(int s){ //Constructor with parameter

    statusResidence = s; //Initialize value statusResidence
    
    }//END CONSTRUCTOR

    public void getQuantity()
    {
        //Prompt and Get Ticket Quantity
        System.out.println("\n");
        System.out.println("-----------------------");
        System.out.println("Enter Ticket Quantity :");
        System.out.println("-----------------------");
        System.out.print("Adult  > ");
        adultQty = scan.nextInt();
        System.out.print("Child  > ");
        childQty = scan.nextInt();
        System.out.print("Senior > ");
        seniorQty = scan.nextInt();
        System.out.println("-----------------------");

    }//END METHOD

    public int getPrice()
    {
        int adultPrice=0, childPrice=0, seniorPrice=0; //Declare the variable and initialize with value of 0
        int price [] = new int[3]; //Declare array: size of 3
        int totalFees=0;
    
    //USE SWITCH CASE
     /*Use switch case to set the
     price of each category*/
    switch(statusResidence) {
    case 1 :
        adultPrice = 44;
        childPrice = 16;
        seniorPrice = 21;
        break;
    
    case 2 :
        adultPrice = 63;
        childPrice = 33;
        seniorPrice = 63;
        break;
    case 3 :
        adultPrice = 85;
        childPrice = 43;
        seniorPrice = 85;
        break;
    default: 
    System.out.println("Input is invalid !");
    }//END SWITCH CASE
        
        //Process of calculating price for each category
        price [0] = adultPrice*adultQty; //Total fees of Adult Price
        price [1] = childPrice*childQty; //Total fees of Child Price
        price [2] = seniorPrice*seniorQty; //Total fees of Senior Price

        //Process of calculating the grand total of the price
        for (int i=0; i<price.length; i++)
        {
            totalFees += price[i];
        }
        return totalFees;
    }//END METHOD
}//END CLASS
