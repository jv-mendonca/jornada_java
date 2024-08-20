package entities;

public class hypotenuse {
    public double catetoAdjacente;
    public double catetoOposto;


    public double calculo_hipotenusa() {
            double hipotenusa = Math.sqrt(Math.pow(catetoAdjacente, 2) + Math.pow(catetoOposto, 2));
            return hipotenusa;
    }


    public String toString(){
        return "Valor da Hipotenusa:" + String.format("%.2f",calculo_hipotenusa());
    }
}
