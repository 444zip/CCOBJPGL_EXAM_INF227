public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

            Locations boracay = new Boracay();
            Locations ilocosnorte = new IlocosNorte();
            Locations launion = new LaUnion();
            Locations siargao = new Siargao();
            Locations palawan = new Palawan();
            Locations amanpulo = new Amanpulo ();
           
            Me myself = new Me();
            boracay.accept(myself);
            ilocosnorte.accept(myself);
            launion.accept(myself);
            palawan.accept(myself);
            siargao.accept(myself);
            amanpulo.accept(myself);
    }
}
