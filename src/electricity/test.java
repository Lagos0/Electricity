package electricity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {

    static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        int op2;
        System.out.println("BIENBENIDO AL PROGRAMA ELECTRICITY!!!");
        while (!salir) {

            System.out.println("");
            System.out.println("Seleccione Componente");
            System.out.println("1. MONITOR");
            System.out.println("2. TECLADO");
            System.out.println("3. RATON");
            System.out.println("4. PROCESADOR");
            System.out.println("5. TARJETA GRAFICA");
            System.out.println("6. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                sn.nextLine();
                boolean salir2 = false;
                switch (opcion) {
                    case 1:
                        Monitor objM=new Monitor();
                        objM.generarconsumo();
                        while (!salir2) {
                            System.out.println("");
                            submenu();
                            try {
                                System.out.println("Escribe una de las opciones");
                                op2 = sn.nextInt();
                                sn.nextLine();                                
                                switch (op2) {
                                    case 1:                                        
                                        System.out.println("EL consumo del monitor es: "+objM.getConsumowatts());
                                        break;
                                    case 2:
                                        System.out.println("EL costo por hora del monitor es: "+objM.getCostohora());
                                        break;
                                    case 3:
                                        
                                        System.out.println("EL costo total del monitor es: "+objM.calcularconsumototal());
                                        break;                                 
                                    case 4:
                                        salir2 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 4");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }
                        break;
                    case 2:
                        
                        Teclado objT=new Teclado();
                        objT.generarconsumo();
                        while (!salir2) {
                            System.out.println("");
                            submenu();
                            try {
                                System.out.println("Escribe una de las opciones");
                                op2 = sn.nextInt();
                                sn.nextLine();                                
                                switch (op2) {
                                    case 1:                                        
                                        System.out.println("EL consumo del teclado es: "+objT.getConsumowatts());
                                        break;
                                    case 2:
                                        System.out.println("EL costo por hora del teclado es: "+objT.getCostohora());
                                        break;
                                    case 3:
                                        
                                        System.out.println("EL costo total del teclado es: "+objT.calcularconsumototal());
                                        break;                                 
                                    case 4:
                                        salir2 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 4");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }
                        break;
                    case 3:
                        
                        Raton objR=new Raton();
                        objR.generarconsumo();
                        while (!salir2) {
                            System.out.println("");
                            submenu();
                            try {
                                System.out.println("Escribe una de las opciones");
                                op2 = sn.nextInt();
                                sn.nextLine();                                
                                switch (op2) {
                                    case 1:                                        
                                        System.out.println("EL consumo del raton es: "+objR.getConsumowatts());
                                        break;
                                    case 2:
                                        System.out.println("EL costo por hora del raton es: "+objR.getCostohora());
                                        break;
                                    case 3:
                                        
                                        System.out.println("EL costo total del raton es: "+objR.calcularconsumototal());
                                        break;                                 
                                    case 4:
                                        salir2 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 4");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }
                        break;
                    case 4:
                        
                        Procesador objP=new Procesador();
                        objP.generarconsumo();
                        while (!salir2) {
                            System.out.println("");
                            submenu();
                            try {
                                System.out.println("Escribe una de las opciones");
                                op2 = sn.nextInt();
                                sn.nextLine();                                
                                switch (op2) {
                                    case 1:                                        
                                        System.out.println("EL consumo del Procesador es: "+objP.getConsumowatts());
                                        break;
                                    case 2:
                                        System.out.println("EL costo por hora del Procesador es: "+objP.getCostohora());
                                        break;
                                    case 3:
                                        
                                        System.out.println("EL costo total del Procesador es: "+objP.calcularconsumototal());
                                        break;                                 
                                    case 4:
                                        salir2 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 4");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }
                        break;
                    case 5:
                        
                        Tarjeta objtg=new Tarjeta();
                        objtg.generarconsumo();
                        while (!salir2) {
                            System.out.println("");
                            submenu();
                            try {
                                System.out.println("Escribe una de las opciones");
                                op2 = sn.nextInt();
                                sn.nextLine();                                
                                switch (op2) {
                                    case 1:                                        
                                        System.out.println("EL consumo de la tarjeta grafica es: "+objtg.getConsumowatts());
                                        break;
                                    case 2:
                                        System.out.println("EL costo por hora de la tarjeta grafica es: "+objtg.getCostohora());
                                        break;
                                    case 3:
                                        
                                        System.out.println("EL costo total de la tarjeta grafica es: "+objtg.calcularconsumototal());
                                        break;                                 
                                    case 4:
                                        salir2 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 4");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }
                        break;
                    case 6:
                        salir = true;
                        System.out.println("GRACIAS POR USAR EL SISTEMA!!!");
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

    public static void submenu() {
        System.out.println("Seleccione Operacion:");
        System.out.println("1. CONSUMO DE WATTS");
        System.out.println("2. COSTO POR HORA");
        System.out.println("3. COSTO TOTAL");
        System.out.println("4. SALIR");
    }

}
