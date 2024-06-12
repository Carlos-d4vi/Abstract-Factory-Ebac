package Domain.CarFactories;

import Domain.ICarFactory;
import Domain.carTypesInterfaces.ISUV;
import Domain.carTypesInterfaces.ISedan;
import Domain.concreteFactories.ToyotaSedan;
import Domain.concreteFactories.ToyotaSuv;

public class ToyotaFactory implements ICarFactory {

    @Override
    public ISedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public ISUV createSUV() {
        return new ToyotaSuv();
    }
}
