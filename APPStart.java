
/**
 * Escreva a descrição da classe AppStart aqui.
 * 
 * @Miguel Pintado (200221029) 
 * @Lab0
 */

import java.util.Scanner;

 public class APPStart {
    static Scanner scanner = new Scanner(System.in);
    public static void  main(String args[]){
    System.out.println("1: Pequeno");
    System.out.println("2: Medio");
    System.out.println("3: Grande");
    int menuOption = scanner.nextInt();
    
    switch(menuOption){
        case 1:
            Size size1 = Size.SMALL;
            break;
        case 2:
            Size size1 = Size.MEDIUM;
            break;
        case 3:
            Size size1 = Size.LARGE;
            break;
        default:
            System.out.println("Opção inválida");}
        
    System.out.println("Name:"+size1.name());
    System.out.println("toString():" +size1.toString()+"");
    System.out.println("Ordem:"+size1.ordinal());
    System.out.println("Valor minimo:"+size1.getMinValue());
    System.out.println("Valor maximo:"+size1.getMaxValue());
    System.out.println("Código:'"+size1.getCode()+"''");
    }
    }}

