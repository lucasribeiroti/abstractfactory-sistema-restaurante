package src.main.java.classes;

import src.main.java.interfaces.Bebida;
import src.main.java.interfaces.FabricaAbstrata;
import src.main.java.interfaces.Prato;

public class FabricaCombinacaoUm implements FabricaAbstrata {
    @Override
    public Prato createPrato() {
        return new PratoLasanha(); // ou Pasta
    }

    @Override
    public Bebida createBebida() {
        return new BebidaVinho(); // ou Espresso
    }
}
