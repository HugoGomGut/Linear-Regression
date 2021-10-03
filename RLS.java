import java.util.Scanner;

public class RLS{
    public static void main(String[] args){
        double input;
        double year = 9;
        double[] sales = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};   //Y
        double[] advertising = {23, 26, 30, 34, 43, 48, 52, 57, 58};            //X
        //double[] sales = {2, 3, 4, 4, 4, 6, 5, 7};   //Y
        //double[] advertising = {1, 2, 2, 3, 4, 4, 5, 6};            //X
        double[] xy = new double[9];
        double[] x2 = new double[9];
        double sumSales = 0, sumAdvertising = 0, sumXY = 0, sumX2 = 0;

        for(int i=0; i<year; i++)
        {
            xy[i] = advertising[i] * sales[i];
            x2[i] = advertising[i] * advertising[i];
            sumSales = sumSales + sales[i];
            sumAdvertising = sumAdvertising + advertising[i];
            sumXY = sumXY + xy[i];
            sumX2 = sumX2 + x2[i];
        }

        double m1 = (year*sumXY) - (sumAdvertising*sumSales);
        double m2 = (year*sumX2) - (sumAdvertising*sumAdvertising);
        double m=m1/m2;
        double b = (sumSales/year) - (m*(sumAdvertising/year));
        System.out.println("Ingrese el valor de X que desea calcular: ");
        Scanner leer=new Scanner(System.in);
        input=leer.nextDouble();
        double b2 = m*input + b;
        System.out.println("y^=B0+B1x1");
        System.out.println("y^= " + m + " + " + b + "  =  " + b2);
    }
}