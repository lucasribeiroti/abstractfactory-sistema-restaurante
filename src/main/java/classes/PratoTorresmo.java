package src.main.java.classes;

import src.main.java.interfaces.Prato;

public class PratoTorresmo implements Prato {
    @Override
    public String preparar() {
        return "Preparando torresmo";
    }
}
