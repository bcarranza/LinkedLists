import java.io.*;
public class Main 
{
    public static void main(String args[])
    {
        int opt=0;
        int subOpt=0;
        int x=0;
        try {
            do{
                System.out.println(" ");
                System.out.println("LISTAS ENLAZADAS");
                System.out.println("------------------------");
                System.out.println("------------------------");
                System.out.println("1. Listas simplemente enlazadas");
                System.out.println("5. Salir");
                System.out.println("Ingrese un valor para continuar");
                opt = Integer.parseInt(System.console().readLine());
                    switch(opt){
                        case 1:
                                SimpleList sl = new SimpleList();
                                do{
                                    printGenericOptionList();
                                    System.out.println("Ingrese un valor para continuar");
                                    subOpt = Integer.parseInt(System.console().readLine());
                                    switch(subOpt){
                                        case 1: {
                                            System.out.println("¿La lista esta vacia?: " + sl.isEmpty());
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("El tamaño de la lista es: " + sl.getLength());
                                            break;
                                        }
                                        case 3:{
                                            System.out.println("Ingrese el valor a agregar en el final lista: ");
                                            x = Integer.parseInt(System.console().readLine());
                                            sl.addEnd(x);
                                            break;
                                        }
                                        case 4:{
                                            System.out.println("Ingrese el valor a agregar en el inicio de la lista: ");
                                            x = Integer.parseInt(System.console().readLine());
                                            sl.addBegin(x);
                                            break;
                                        }
                                        case 5:{
                                            System.out.println("Imprimiendo lista........");
                                            sl.print();
                                            break;
                                        }
                                    }
                                    printPressKey();
                                } while (subOpt!=0);
                                sl=null;
                        default: 
                                System.out.println("Opción Invalida");
                    }
                
            } while (opt!=5);
            System.out.println("Hasta luego!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void printGenericOptionList()
    {
        System.out.println("1. La Lista vacia?");
        System.out.println("2. Tamaño de la lista");
        System.out.println("3. Agregar elemento al final");
        System.out.println("4. Agregar elemento al inicio");
        System.out.println("4. Imprimir");
        System.out.println("0. Retornar");
    }
    private static void printPressKey()
    {
        try{
            System.out.println("Presiona una tecla para continuar...: ");
            System.in.read();
        }catch (Exception e) {  //system.in.read need a try catch 
            e.printStackTrace();
        }
    }
}
