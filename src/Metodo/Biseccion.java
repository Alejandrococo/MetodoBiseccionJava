/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Metodo;
import java.lang.Math.*;

/**
 *
 * @author Ingeniero
 */
public class Biseccion {

    //atributos de la clase
    private double a;
    private double b;

    //metodos constructores
    Biseccion() {
        a = 0;
        b = 0;
    }

    Biseccion(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //metodos modificadores
    void setA(double a) {
        this.a = a;
    }

    void setB(double b) {
        this.b = b;
    }

    //metodos analizadores
    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    //metodo de iteraciones
    double numIteracionesR(double a, double b) {
        double ValA = a;
        double ValB = b;
        double valE = 0.01;
        double NumIt = Math.round((Math.log((b - a) / valE) / Math.log(2)) - 1);

        return NumIt;
    }
    
    double numIteraciones(double a, double b) {
        double ValA = a;
        double ValB = b;
        double valE = 0.01;
        double NumIt =((Math.log((b - a) / valE) / Math.log(2)) - 1);

        return NumIt;
    }
    //metodo F(a)
    double getfdea(double a) {
        double x = a;
        double formula = Math.pow(x, 4) - 2 * Math.pow(x, 3) - 4 * Math.pow(x, 2) + (4 * x + 4);
        
        return formula;
    }
    //metodo f(b)
    double getfdeb(double b) {
        double x = b;
        double formula = Math.pow(x, 4) - 2 * Math.pow(x, 3) - 4 * Math.pow(x, 2) + (4 * x + 4);
       
        
        return formula;
    }
    // Metodo Xr
    double getXr(double a, double b) {
        double Vala = a;
        double Valb = b;
        double Xr = (Vala + Valb) / 2;
        
        return Xr;
    }
    //Metodo f(Xr)
    double fdeXr(double Xr) {
        double fdeXr = Math.pow(Xr, 4) - 2 * Math.pow(Xr, 3) - 4 * Math.pow(Xr, 2) + (4 * Xr + 4);
        
        
        return fdeXr;
    }
    //Metodo Multiplicacion f(a)*f(Xr)
    double MultFaxr(double fa, double fxr) {
        double fdea = fa;
        double fdexr = fxr;
        double multip = fdea * fdexr;

        return multip;
    }
    //Metodo Error 
   
    
    
}
