package Domain.concreteFactories;

import Domain.carTypesInterfaces.ISUV;

public class AudiSuv implements ISUV {
    @Override
    public void dirigir() {
        System.out.println("Driving a Audi Suv.");
    }
}
