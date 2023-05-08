public class App {
    public static void main(String[] args) throws Exception {

        Locations baguio = new Baguio();
        Locations batangas = new Batangas();
        Locations boracay = new Boracay();
        Locations cebu = new Cebu();
        Locations japan = new Japan();
        Locations palawan = new Palawan();
        
        Tourist me = new Me();

        baguio.accept(me);
        batangas.accept(me);
        boracay.accept(me);
        cebu.accept(me);
        japan.accept(me);
        palawan.accept(me);


        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

    }
}