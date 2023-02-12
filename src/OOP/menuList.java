import java.util.*;
class menuList {
    Scanner scan = new Scanner(System.in);
    private int statusResidence;
    public void getMenu() {

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
    
    }//END METHOD

    public int setResidence()
    {
        System.out.println("Select Residence Status :");
        System.out.println("-------------------------");
        System.out.println("1 - Malaysian");
        System.out.println("2 - Asean");
        System.out.println("3 - Others");
        System.out.print("  Enter your selection : ");
        statusResidence = scan.nextInt();
        return statusResidence;
    }

}//END CLASS
