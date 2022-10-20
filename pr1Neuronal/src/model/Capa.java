package model;

import java.util.ArrayList;
import java.util.Random;

public class Capa {
    public ArrayList<Neurona> neuronas;
    public Double[] salidas;

    Capa(int numEntradas, int numNeuronas, Random r){
        neuronas = new ArrayList<Neurona>();

        // creo "numNeuronas" y a cada una la inicializo con "numEntradas"
        for(int i = 0; i < numNeuronas; i++){
            neuronas.add(new Neurona(numEntradas, r));
        }
    }

    public Double[] Activacion(Double[] entradas){
        // inicializo el array estatico de salidas con tantas salidas como neuronas tenga la capa
        salidas = new Double[neuronas.size()];

        // calculo la salida de cada neurona llamando a su funcion de activacion
        for(int i = 0; i < neuronas.size(); i++){
            salidas[i] = neuronas.get(i).activacion(entradas);
        }
        return salidas;
    }
}
