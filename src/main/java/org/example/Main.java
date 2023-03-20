package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Grafo grafo = new Grafo();

        HashMap<String, Float> custos = new HashMap<>();
        HashMap<String, String> pais = new HashMap<>();
        ArrayList<String> processados = new ArrayList<String>();

        custos.put("A", 6F);
        custos.put("B", 2F);
        custos.put("Fim", Float.POSITIVE_INFINITY);

        pais.put("A", "Inicio");
        pais.put("B", "Inicio");
        pais.put("Fim", "");



        String nodo = acheNoCustoMaisBaixo(custos, processados);


        while (!nodo.isBlank()) {
            Float custo = custos.get(nodo);
            HashMap<String, Float> vizinhos = grafo.getBody().get(nodo);

            if (Objects.isNull(vizinhos)) {
                break;
            }

            for (String key : vizinhos.keySet()) {
                Float novoCusto = custo + vizinhos.get(key);

                if (custos.get(key) > novoCusto) {
                    custos.put(key, novoCusto);
                    pais.put(key, nodo);
                }
            }
            processados.add(nodo);
            nodo = acheNoCustoMaisBaixo(custos, processados);
        }

        System.out.println(custos);
        System.out.println(pais);
    }

    public static String acheNoCustoMaisBaixo(HashMap<String, Float> custos, ArrayList<String> processadsos) {
        Float custoMaisBaixo = Float.POSITIVE_INFINITY;
        String keyCustoMaisBaixo = null;

        for (String key: custos.keySet()) {
            Float custo = custos.get(key);

            if (custo < custoMaisBaixo && !processadsos.contains(key)) {
                custoMaisBaixo = custo;
                keyCustoMaisBaixo = key;
            }
        }
        return keyCustoMaisBaixo;
    }
}
