public class ZOOApp {

    private int statusResidence; //Declare instance variable as private
    /*The variable statusResidence outside of method
    so that every method can access the variable value.*/

    public ZOOApp(int s) //constructor with parameter
    {
        statusResidence = s; //Set value of statusResidence
    }//end of constructor

    //Non-void method with parameter
    public int GetPrice(int adultQty, int childQty, int seniorQty) //Header Method //3 integer parameter received
    {
        //Declare variable
        int price[] = new int[3];//Declare array price[]: size of 3
        int Quantity[] = {adultQty,childQty,seniorQty};//Declare array Quantity[] and set the value.
        int totalFees=0;

    //Use switch case to set the price of each category//
    switch(statusResidence) {
    case 1 :
        price[0] = 44; //Adult Price
        price[1] = 16; //Child Price
        price[2] = 21; //Senior Price
        break;
    case 2 :
        price[0] = 63; //Adult Price
        price[1] = 33; //Child Price
        price[2] = 63; //Senior Price
        break;
    case 3 :
        price[0] = 85; //Adult Price
        price[1] = 43; //Child Price
        price[2] = 85; //Senior Price
        break;
    default:
    //INPUT IS INVALID
    }//END SWITCH CASE

        //Process of calculating the grand total of the price
        for (int i=0; i<price.length; i++)
        {
            price[i] = price[i] * Quantity[i];
            totalFees +=price[i];
        }
        return totalFees; //The return value
    }//end of method GetPrice

}//end of java class

