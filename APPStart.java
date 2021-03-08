
/**
 * Escreva a descrição da classe AppStart aqui.
 * 
 * @Miguel Pintado (200221029) 
 * @Lab0
 */

import java.util.Scanner;

public class APPStart
{
     static Scanner scanner = new Scanner(System.in);
     public static void main(){
        System.out.println("1: Pequeno");
        System.out.println("2: Médio");
        System.out.println("3: Grande");
        int menuOption = scanner.nextInt();
        switch(menuOption){
            case 1:
                Size size1 = Size.SMALL;
                System.out.println("Name:"+size1.name());
                System.out.println("toString():"+size1.toString()+"");
                System.out.println("Ordem:"+size1.ordinal());
                System.out.println("Valor minimo:"+size1.getMinValue());
                System.out.println("Valor maximo:"+size1.getMaxValue());
                System.out.println("Código:'"+size1.getCode()+"''");
                break;
            case 2:
                Size size2 = Size.MEDIUM;
                System.out.println("Name:"+size2.name());
                System.out.println("toString():"+size2.toString()+"");
                System.out.println("Ordem:"+size2.ordinal());
                System.out.println("Valor minimo:"+size2.getMinValue());
                System.out.println("Valor maximo:"+size2.getMaxValue());
                System.out.println("Código:'"+size2.getCode()+"''");
                break;
            case 3:
                Size size3 = Size.MEDIUM;
                System.out.println("Name:"+size3.name());
                System.out.println("toString():"+size3.toString()+"");
                System.out.println("Ordem:"+size3.ordinal());
                System.out.println("Valor minimo:"+size3.getMinValue());
                System.out.println("Valor maximo:"+size3.getMaxValue());
                System.out.println("Código:'"+size3.getCode()+"''");
        }
        }
}

