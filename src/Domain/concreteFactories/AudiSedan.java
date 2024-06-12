package Domain.concreteFactories;

import Domain.carTypesInterfaces.ISedan;

public class AudiSedan implements ISedan {
    @Override
    public void dirigir() {
        System.out.println("Driving a Audi sedan.");
    }
}
