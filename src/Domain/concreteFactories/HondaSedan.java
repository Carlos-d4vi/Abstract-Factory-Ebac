package Domain.concreteFactories;

import Domain.carTypesInterfaces.ISedan;

public class HondaSedan implements ISedan {

    @Override
    public void dirigir() {
        System.out.println("Driving a Honda Sedan");
    }
}

