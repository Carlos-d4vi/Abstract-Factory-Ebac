package Domain.concreteFactories;

import Domain.carTypesInterfaces.ISUV;

public class ToyotaSuv implements ISUV {

    @Override
    public void dirigir() {
        System.out.println("Driving a Toyota SUV");
    }
}
