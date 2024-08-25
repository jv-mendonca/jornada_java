package util;

public class conversorDeMoeda {
    public  static double cotacaoDolar = 5.34;
    public static final double IOF = 0.06;

    public static double valorReais(double valorDolar){
        return  valorDolar * cotacaoDolar * (1.00 + IOF);
    }
}
