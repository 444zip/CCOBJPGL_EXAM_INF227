public class Me implements Tourist {

    static int budget = 550
    ;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {

        if ( budget > boracay.airFare ) {
            System.out.println("now: swimming in borcay!");
            budget = budget - boracay.airFare;
            checkBudget();
        }

        else {
            System.out.println("sorry, sa bahay ka nalang muna");
            checkBudget();

        }
            
    }

    public void visit(IlocosNorte ilocosnorte) {
        if ( budget > ilocosnorte.airFare ) {
            System.out.println("eAting ilocos empanada!");
            budget = budget - ilocosnorte.airFare;
            checkBudget();
        }

        else {
            System.out.println("kulang pera mo awE");
            checkBudget();

        }


    }


    public void visit(LaUnion launion) {
        if ( budget > launion.airFare ) {
            System.out.println("chilling in LU!");
            budget = budget - launion.airFare;
            checkBudget();
        }

        else {
            System.out.println("ipon ka pa beh");
            checkBudget();

        }
    }

    public void visit(Palawan palawan) {
        if ( budget > palawan.airFare ) {
            System.out.println("sunbathing in palawan");
            budget = budget - palawan.airFare;
            checkBudget();
        }

        else {
            System.out.println("sa batya ka nalang, i guess");
            checkBudget();

        }
    }
    public void visit(Siargao siargao) {

        if ( budget > siargao.airFare ) {
            System.out.println("surfing in siargao!");
            budget = budget - siargao.airFare;
            checkBudget();
        }

        else {
            System.out.println("next year nalang ;p ");
            checkBudget();

        }
    }
    public void visit(Amanpulo amanpulo) {

        if ( budget > amanpulo.airFare ) {
            System.out.println("yEHEY AMANPULO!!");
            budget = budget - amanpulo.airFare;
            checkBudget();
        }

        else {
            System.out.println("saaaaad,, ang mahal ");
            checkBudget();

        }
    }




    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}