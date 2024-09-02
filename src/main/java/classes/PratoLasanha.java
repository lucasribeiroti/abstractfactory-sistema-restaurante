package src.main.java.classes;

import src.main.java.interfaces.Prato;

public class PratoLasanha implements Prato {
    @Override
    public String preparar() {
        return "Preparando lasanha";
    }
}
