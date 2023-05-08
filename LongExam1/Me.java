public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Baguio baguio) {

        //Gastos
        budget -= baguio.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Pumunta sa Baguio: ");
        System.out.println("Taena lamig dito, sana sa Manila rin");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Batangas batangas) {

        //Gastos
        budget -= batangas.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Pumunta sa Batangas: ");
        System.out.println("Puntahan q nga pinsan q");
        checkBudget();
        System.out.println("-------------------------------------------");
    }
    
    public void visit(Boracay boracay) {

        //Gastos
        budget -= boracay.airFare;
        
        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Pumunta sa Boracay: ");
        System.out.println("Wohoi swimming, nognog nanaman hahahaha");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Cebu cebu) {

        //Gastos
        budget -= cebu.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Pumunta sa Cebu: ");
        System.out.println("Swimming nanaman sheesh");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Japan japan) {

        //Gastos
        budget -= japan.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Pumunta sa Japan: ");
        System.out.println("Nakanaks japan japan, ganda dito");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Palawan palawan) {

        //Gastos
        budget -= palawan.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Pumunta sa Palawan: ");
        System.out.println("SWIMMING ULIT?!?");
        checkBudget();
        System.out.println("Wala na kong pera aguy");
        System.out.println("-------------------------------------------");

    }

    public void checkBudget() {

        System.out.println("my budget is " + budget);
    }

}