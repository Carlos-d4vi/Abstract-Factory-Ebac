import Domain.CarFactories.AudiFactory;
import Domain.CarFactories.ToyotaFactory;
import Domain.ICarFactory;
import Domain.carTypesInterfaces.ISUV;
import Domain.carTypesInterfaces.ISedan;
import Domain.concreteFactories.HondaSedan;

public class App {
    public static void main(String[] args) {
       ICarFactory carFactory = new ToyotaFactory();

        ISedan sedan = carFactory.createSedan();
        ISUV suv = carFactory.createSUV();

        sedan.dirigir();
        suv.dirigir();

        ICarFactory audiFactory = new AudiFactory();

        ISedan audiSedan = audiFactory.createSedan();

        audiSedan.dirigir();
    }
}
