package Entities;

public class Retangulo
{
    public double largura;
    public double altura;



    public double areaRetangulo(){
        return largura * altura;
    }
    public double perimetroRetangulo(){
        return  2.00* (altura + largura);
    }

    public  double diagonalRetangulo(){
        return Math.sqrt(Math.pow(altura,2) + Math.pow(largura, 2));
    }



    public String toString(){
        return "Area: " + String.format("%.2f%n",areaRetangulo())+
                "Perimetro: " +String.format("%.2f%n",perimetroRetangulo()) +
                "Diagonal: " + String.format("%.2f%n",diagonalRetangulo());
    }


}
