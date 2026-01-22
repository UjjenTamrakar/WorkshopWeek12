package Week12;

public class BusMain{
    public static void main(String[] args){

        BusCompany company = new BusCompany();

        company.addBus(new Bus("C-9514", "Red", "B-C", "Jake", true, 500));
        company.addBus(new Bus("P-50719", "Yellow", "C-D", "Logan", true, 750));
        company.addBus(new Bus("K-2567", "Blue", "A-B", "Herald", false, 800));

        System.out.println("All Bus:");
        company.displayAllBuses();

        System.out.println("\nRate > 500:");
        company.displayBusRateMoreThan500();

        System.out.println("\nRed or Blue Bus:");
        company.displayRedOrBlueBuses();

        company.removeBus(5); 
    }
}