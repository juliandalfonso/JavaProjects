package ejercicio.moda;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Moda {

    public static void main(String[] args) {

        //declarar las variables que necesitamos
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        
        //solicitar al usuario la cantidad de números a ingresar
        nElementos =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros que quiere analizar: "));
        
        float elementos[] = new float[nElementos];
        
        //llenar el arreglo con numeros reales
        for(int i=0; i<nElementos; i++)
        {
            System.out.print((i+1)+" Digite un número: ");
            elementos[i] = entrada.nextFloat();
        };
        //mostrar al usuario los datos ingresados
        System.out.println("\nLos Datos ingresados son: ");
        for(int i=0; i<nElementos; i++)
        {
            System.out.print(elementos[i]+" ");
        };
        //encontrar la moda
        float resultado_moda = moda(nElementos, elementos);
        
        //devolver el resultado
        System.out.println("la moda encontrada es: "+ resultado_moda);

        entrada.close();
    }

    private static float moda(int nElementos, float[] elementos) {
        int maxCount = 0, i, j;
        float maxValue =0;
      for (i = 0; i < nElementos; ++i) {
         int count = 0;
         for (j = 0; j < nElementos; ++j) {
            if (elementos[j] == elementos[i])
            ++count;
         }

         if (count > maxCount) {
            maxCount = count;
            maxValue = elementos[i];
         }
      }
      return maxValue;
    }
}
