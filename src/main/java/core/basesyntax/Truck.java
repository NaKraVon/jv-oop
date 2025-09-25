package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.print("Truck start working" + "\n");
    }

    @Override
    public void stopWork() {
        System.out.print("Truck stop working" + "\n");
    }
}
