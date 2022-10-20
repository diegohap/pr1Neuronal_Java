package model;

import java.util.ArrayList;
import java.util.Random;

public class Perceptron {
    public ArrayList<Capa> capas;
    ArrayList<double[]> sigmas;

    public Perceptron(int[] numNeuronasPorCapa){
        capas = new ArrayList<Capa>();
        Random r = new Random();

        for(int i = 0; i < numNeuronasPorCapa.length; i++){
            if(i == 0){
                capas.add(new Capa(numNeuronasPorCapa[i], numNeuronasPorCapa[i], r));
            }else{
                capas.add(new Capa(numNeuronasPorCapa[i - 1], numNeuronasPorCapa[i], r));
            }
        }
    }
}