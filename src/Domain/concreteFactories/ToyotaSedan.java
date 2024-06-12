package Domain.concreteFactories;

import Domain.carTypesInterfaces.ISedan;

public class ToyotaSedan implements ISedan {

    @Override
    public void dirigir() {
        System.out.println("Driving a Toyota Sedan");
    }
}

