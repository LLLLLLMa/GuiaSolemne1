/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lianmorgado.guiasolemne1;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author lianm
 */
public class Menu {
    private Funciones funciones;
    private Scanner leer;
    
    public Menu()
    {
        funciones = new Funciones();
        leer = new Scanner(System.in);
        MostrarMenu();
    }

    public Funciones getFunciones() {
        return funciones;
    }

    public void setFunciones(Funciones funciones) {
        this.funciones = funciones;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    private void MostrarMenu()
    {
        System.out.println("=======MENU=======");
        System.out.println("1.....Suma hasta 1-n");
        System.out.println("2.....Factorial de n");
        System.out.println("3.....Potencia de dos numeros (iterativo)");
        System.out.println("4.....Verificar primo (iterativo)");
        System.out.println("5.....Verificar año bisiesto (recursivo)");
        System.out.println("6.....Verificar primo (recursivo)");
        System.out.println("7.....Verificar año bisiesto (iterativo)");
        System.out.println("8.....Suma digitos de n");
        System.out.println("9.....Producto digitos de n");
        System.out.println("0.....Salir");
        EjecutarOpcion(OpcionValida());
    }
    
    private void EjecutarOpcion(int opcion)
    {
        boolean continuar = true;
        switch(opcion)
        {
            case 0:
                System.out.println("Saliendo del programa...");
                continuar = false;
                break;
            case 1:
                System.out.println("La suma de 1 hasta su numero es " + funciones.SumaNIterativo(EnteroPositivo()));
                break;
            case 2:
                System.out.println("El factorial de el numero es " + funciones.FactorialRecursivo(EnteroPositivo()));
                break;
            case 3:
                System.out.println("Ingrese la base de la potencia");
                int base = EnteroPositivo();
                System.out.println("Ingrese el exponente de la potencia");
                int exponente = EnteroPositivo();
                System.out.println("La potencia es " + funciones.PotenciaIterativo(base, exponente));
                break;
            case 4:
                if (funciones.EsPrimoIterativo(EnteroPositivo()))
                {
                    System.out.println("El numero es primo");
                }
                else
                {
                    System.out.println("El numero no es primo");
                }
                break;
            case 5:
                if (funciones.EsBisiestoRecursivo(EnteroPositivo()))
                {
                    System.out.println("El año es bisiesto");
                }
                else
                {
                    System.out.println("El año no es bisiesto");
                }
                break;
            case 6:
                if (funciones.EsPrimoRecursivo(EnteroPositivo(), 1))
                {
                    System.out.println("El numero es primo");
                }
                else
                {
                    System.out.println("El numero no es primo");
                }
                break;
            case 7:
                if (funciones.EsBisiestoIterativo(EnteroPositivo()))
                {
                    System.out.println("El año es bisiesto");
                }
                else
                {
                    System.out.println("El año no es bisiesto");
                }
                break;
            case 8:
                System.out.println("La suma de los digitos de su numero es " + funciones.SumaDigitosIterativo(EnteroPositivo()));
                break;
            case 9:
                System.out.println("El producto de los digitos de su numero es " + funciones.ProductoDigitosRecursivo(EnteroPositivo()));
                break;
        }
        if (continuar) MostrarMenu();
    }
    
    private int OpcionValida()
    {
        int opcion = 0;
        boolean continuar = true;
        System.out.println("Ingrese su opcion");
        while (continuar)
        {
            try
            {
                opcion = leer.nextInt();
                while (opcion < 0 || opcion > 9)
                {
                    System.out.println("Error, esa no es una opcion valida");
                    System.out.println("Vuelva a ingresar su opcion");
                    opcion = leer.nextInt();
                }
                continuar = false;
            }
            catch(InputMismatchException ex)
            {
                continuar = true;
                System.out.println("Error, ingrese un numero entero.");
                System.out.println("Vuelva a ingresar su opcion");
            }
        }
        return opcion;
    }
    
    private int EnteroPositivo()
    {
        int numero = 0;
        boolean continuar = true;
        System.out.println("Ingrese su numero");
        while (continuar)
        {
            try
            {
                numero = leer.nextInt();
                while (numero < 0)
                {
                    System.out.println("Error, debe ser un numero positivo");
                    System.out.println("Vuelva a ingresar su numero");
                    numero = leer.nextInt();
                }
                continuar = false;
            }
            catch(InputMismatchException ex)
            {
                continuar = true;
                System.out.println("Error, ingrese un numero entero.");
                System.out.println("Vuelva a ingresar su numero");
            }
        }
        return numero;
    }
}
