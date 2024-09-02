package src.main.java.classes;

import src.main.java.interfaces.Prato;

public class PratoHamburguer implements Prato {
    @Override
    public String preparar() {
        return "Preparando hamburguer";
    }
}