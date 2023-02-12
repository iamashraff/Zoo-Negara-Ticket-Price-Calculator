public class Main {
    public static void main(String[] args) {

        int statusResidence;
        int totalFees;

            //Get Menu
            menuList getObj = new menuList();
            getObj.getMenu();

            //Prompt & Get Residence Status
            statusResidence = getObj.setResidence();

            //Calculate the ticket price
            priceCalculate getCalc = new priceCalculate(statusResidence);
            getCalc.getQuantity();
            totalFees = getCalc.getPrice();

            //Output
            System.out.println("Total fees is : RM " + totalFees);
            
    }//END MAIN
}//END CLASS
