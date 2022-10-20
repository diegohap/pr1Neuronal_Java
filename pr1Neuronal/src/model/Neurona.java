package model;

import java.util.Random;

public class Neurona {

    private static int idNeurona;
    private Double[] pesos;
    private Double umbral;

    public Neurona(Integer entradas, Random r) {
        this.pesos = new Double[entradas];
        this.umbral = r.nextDouble();
        for (int i=0; i<pesos.length; i++){
            pesos[i] = r.nextDouble();
            System.out.println();
        }
    }

    public Neurona(Integer entradas, Double[] pesos){

    }

    public Double activacion(Double[] entradas){
        Double salida = umbral;

        for (int i=0; i< pesos.length; i++){
            salida += entradas[i]*pesos[i];
        }
        return sigmoide(salida);
    }

    public double sigmoide(double x){
        return 1 / (1 + Math.exp(-x));
    }

}
