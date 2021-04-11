package interfaces_and_resourceBundle;

import java.util.Scanner;

public class Operations implements IArithmetics {
    static Scanner sc = new Scanner(System.in);
    @Override
    public double calculaSoma() {
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        return a1+a2;
    }

    @Override
    public double calculaSub() {
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        return a1-a2;
    }

    @Override
    public double calculaSMult() {
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        return a1*a2;
    }

    @Override
    public double calculaDiv() {
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        return a1/a2;
    }
}
