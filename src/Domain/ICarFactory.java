package Domain;

import Domain.carTypesInterfaces.ISUV;
import Domain.carTypesInterfaces.ISedan;

public interface ICarFactory {
    ISedan createSedan();
    ISUV createSUV();
}
