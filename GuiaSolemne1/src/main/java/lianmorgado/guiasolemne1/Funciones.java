/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lianmorgado.guiasolemne1;

/**
 *
 * @author lianm
 */
public class Funciones {
    
    public int SumaNIterativo(int n)
    {
        int suma = 0;
        for (int i = 1; i <= n; i++)
        {
            suma += i;
        }
        return suma;
    }
    
    public int FactorialRecursivo(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return n * FactorialRecursivo(n-1);
        }
    }
    
    public int PotenciaIterativo(int n1, int n2)
    {
        int potencia = 1;
        for (int i = 0; i < n2; i++)
        {
            potencia *= n1;
        }
        return potencia;
    }
    
    public boolean EsPrimoIterativo(int n)
    {
        for (int i = n/2; i > 1; i--)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public boolean EsBisiestoRecursivo(int n)
    {
        if (n < 4)
        {
            return false;
        }
        else if (n == 4)
        {
            return true;
        }
        else
        {
            return EsBisiestoRecursivo(n - 4);
        }
    }
    
    public boolean EsPrimoRecursivo(int numero, int n)
    {
        if (n > numero/2)
        {
            return true;
        }
        else if (numero % n == 0 && n != 1)
        {
            return false;
        }
        else
        {
            return EsPrimoRecursivo(numero, n+1);
        }
    }
    
    public boolean EsBisiestoIterativo(int año)
    {
        while (año > 4)
        {
            año -= 4;
        }
        return año == 4;
    }
    
    public int SumaDigitosIterativo(int numero)
    {
        int suma = 0;
        while (numero > 0)
        {
            suma += numero%10;
            numero /= 10;
        }
        return suma;
    }
    
    public int ProductoDigitosRecursivo(int numero)
    {
        if (numero == 0)
        {
            return 1;
        }
        else
        {
            return numero%10 * ProductoDigitosRecursivo(numero/10);
        }
    }
}
