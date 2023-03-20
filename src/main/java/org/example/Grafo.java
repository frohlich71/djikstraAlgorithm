package org.example;

import java.util.HashMap;

public class Grafo {
    HashMap<String, HashMap<String, Float>> body;
    HashMap<String, Float> firstEdges;
    HashMap<String, Float> aEdges;
    HashMap<String, Float> bEdges;

    public HashMap<String, HashMap<String, Float>> getBody() {
        return body;
    }

    public void setBody(HashMap<String, HashMap<String, Float>> body) {
        this.body = body;
    }

    public HashMap<String, Float> getFirstEdges() {
        return firstEdges;
    }

    public void setFirstEdges(HashMap<String, Float> firstEdges) {
        this.firstEdges = firstEdges;
    }

    public HashMap<String, Float> getaEdges() {
        return aEdges;
    }

    public void setaEdges(HashMap<String, Float> aEdges) {
        this.aEdges = aEdges;
    }

    public HashMap<String, Float> getbEdges() {
        return bEdges;
    }

    public void setbEdges(HashMap<String, Float> bEdges) {
        this.bEdges = bEdges;
    }

    public Grafo() {
        this.body = new HashMap<>();

        this.firstEdges = new HashMap<>();
        this.aEdges = new HashMap<>();
        this.bEdges = new HashMap<>();


        firstEdges.put("A", 6F);
        firstEdges.put("B", 2F);
        aEdges.put("Fim", 1F);
        bEdges.put("A", 3F);
        bEdges.put("Fim", 5F);

        body.put("Inicio", firstEdges);
        body.put("A", aEdges);
        body.put("B", bEdges);
        body.put("Fim", null);
    }
}
