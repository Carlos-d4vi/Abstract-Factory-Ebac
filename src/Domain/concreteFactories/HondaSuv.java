package Domain.concreteFactories;

import Domain.carTypesInterfaces.ISUV;

public class HondaSuv implements ISUV {

    @Override
    public void dirigir() {
        System.out.println("Driving a Honda SUV");
    }
}
