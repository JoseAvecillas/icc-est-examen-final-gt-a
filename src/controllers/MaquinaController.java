package controllers;

import java.util.*;
import models.Maquina;

public class MaquinaController {
    

    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquinas, int umbral){
        Stack<Maquina> maquinas1 = new Stack<>();
        for(Maquina map : maquinas1){
            int subred = map.getSubred();
            if (subred<= umbral) {
                maquinas1.add(map);
            }
        }
        return maquinas1;
    }

    public Stack<Maquina> ordenarPorSubred(List<Maquina> pila ){
        Set<Maquina> ordernada = new TreeSet<>();
        for(Maquina mac : pila){
            ordernada.add(mac);
        }
        return (Stack<Maquina>) ordernada;
    }

    public Stack<Maquina> agruparPorRiesgo(List<Maquina> maquinas ){
        Queue<Maquina> machine = new LinkedList<>();
        for (Maquina nMaquina : maquinas) {
            int riesgo = ((Maquina) machine).getRiesgo();  
        }
        return null;
    }

    public Stack<Maquina> explotarGrupo(Map<Integer, Queue<Maquina>> mapa){
        return  null;
    }
    
}
