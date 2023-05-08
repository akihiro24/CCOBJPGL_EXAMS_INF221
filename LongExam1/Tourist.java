interface Tourist {

    int budget = 0;

    void visit();

    void visit(Baguio baguio);

    void visit(Batangas batangas);

    void visit(Boracay boracay);

    void visit(Cebu Cebu);

    void visit(Japan japan);

    void visit(Palawan palawan);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}