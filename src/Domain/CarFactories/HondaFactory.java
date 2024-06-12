package Domain.CarFactories;

import Domain.ICarFactory;
import Domain.carTypesInterfaces.ISUV;
import Domain.carTypesInterfaces.ISedan;
import Domain.concreteFactories.HondaSedan;
import Domain.concreteFactories.HondaSuv;

public class HondaFactory implements ICarFactory {

    @Override
    public ISedan createSedan() {
        return new HondaSedan();
    }

    @Override
    public ISUV createSUV() {
        return new HondaSuv();
    }
}
