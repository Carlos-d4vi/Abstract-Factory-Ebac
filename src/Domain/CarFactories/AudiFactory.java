package Domain.CarFactories;

import Domain.ICarFactory;
import Domain.carTypesInterfaces.ISUV;
import Domain.carTypesInterfaces.ISedan;
import Domain.concreteFactories.AudiSedan;
import Domain.concreteFactories.AudiSuv;

public class AudiFactory implements ICarFactory {

    @Override
    public ISedan createSedan() {
        return new AudiSedan();
    }

    @Override
    public ISUV createSUV() {
        return new AudiSuv();
    }
}
