import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Capitan capVelero = new Capitan("Juan", "Perez", "DRZ628IA");
        Velero vel = new Velero(capVelero, 1000.0, 20000.0, 2022, 15.0, 5);

        Capitan capYate = new Capitan("Maria", "Lopez", "DPO231SNJ");
        Yate yate = new Yate(capYate, 2000.0, 20000.0, 2019, 20.0, 8);

        vel.validar();
        yate.validar();

        System.out.println("Monto de alquiler del Velero: $" + vel.montoAlquiler());
        System.out.println("Monto de alquiler del Yate: $" + yate.montoAlquiler());
    }
}