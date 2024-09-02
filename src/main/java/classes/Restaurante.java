package src.main.java.classes;

import src.main.java.interfaces.Bebida;
import src.main.java.interfaces.FabricaAbstrata;
import src.main.java.interfaces.Prato;

public class Restaurante {
    private Prato prato;
    private Bebida bebida;

    public Restaurante(FabricaAbstrata fabrica) {
        this.prato = fabrica.createPrato();
        this.bebida = fabrica.createBebida();
    }

    public String prepararPrato() {
        return this.prato.preparar();
    }

    public String servirBebida() {
        return this.bebida.servir();
    }
}