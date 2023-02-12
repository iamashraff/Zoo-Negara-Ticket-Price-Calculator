import java.util.*;
public class ZOOAppTest {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //Declare variable
    int sentinelLoop;
    int adultQty, childQty, seniorQty;
    int statusResidence;

    //Initialize Sentinel Loop
    System.out.print("Press any key to start or '0' to stop > ");
    sentinelLoop = scan.nextInt();

    //Sentinel DOWHILE
        while(sentinelLoop!=0)
        {
        System.out.println("======================================================");
        System.out.println("                   ZOO NEGARA MALAYSIA                ");
        System.out.println("                Hulu Kelang, 68000 Ampang             ");
        System.out.println("                   Selangor Darul Ehsan               ");
        System.out.println("------------------------------------------------------");
        System.out.println("              Ticket Price Calculator                 ");
        System.out.println("Entrance Fee                                          ");
        System.out.println("---------------                                       ");
        System.out.println("------------------------------------------------------");
        System.out.println("|         |  MALAYSIAN   |         FOREIGNER         |");
        System.out.println("|         |              |    ASEAN   |    OTHERS    |");
        System.out.println("------------------------------------------------------");
        System.out.println("|ADULT    |    RM 44     |    RM63    |     RM85     |");
        System.out.println("|CHILDREN |    RM 16     |    RM33    |     RM43     |");
        System.out.println("|SENIOR   |    RM 21     |    RM63    |     RM85     |");
        System.out.println("------------------------------------------------------");
        System.out.println("\n");

        //Prompt and Get statusResidence
        System.out.println("Select Residence Status :");
        System.out.println("-------------------------");
        System.out.println("1 - Malaysian");
        System.out.println("2 - Asean");
        System.out.println("3 - Others");
        System.out.print("  Enter your selection : ");
        statusResidence = scan.nextInt();
        System.out.println("-------------------------");
        

         //Use DOWHILE loop structure
            /* Using DOWHILE to make sure that the user
            input for statusResidence with range value
            1 to 3 only.*/
        while (statusResidence>3 || statusResidence<1)
        {
            System.out.println("\n");
            System.out.println("Your input is invalid. Please try again !");
            System.out.println("-------------------------");
            System.out.println("\n");
        System.out.println("Select Residence Status :");
        System.out.println("-------------------------");
        System.out.println("1 - Malaysian");
        System.out.println("2 - Asean");
        System.out.println("3 - Others");
        System.out.print("  Enter your selection : ");
        statusResidence = scan.nextInt();
        System.out.println("-------------------------");
        }
    
        //Declare object to call zooProcess class
        ZOOApp myZooProcess = new ZOOApp(statusResidence);

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

        //Declaring variable to get return values of method GetPrice
        int totalFees = myZooProcess.GetPrice(adultQty, childQty, seniorQty);

        //Output
        System.out.println("\n");
        System.out.println("THANK YOU FOR YOUR PURCHASE !");
        System.out.println("Total Fees : RM" + totalFees);

        //Update Sentinel Loop
        System.out.print("Press any key to continue or '0' to stop > ");
        sentinelLoop = scan.nextInt();
        }//END DO
        
        System.out.println("Thank you !");
    }//END MAIN
}//END CLASS

