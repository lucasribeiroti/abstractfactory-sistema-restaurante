package src.main.java.classes;

import src.main.java.interfaces.Bebida;
import src.main.java.interfaces.FabricaAbstrata;
import src.main.java.interfaces.Prato;

public class FabricaCombinacaoTres implements FabricaAbstrata {
    @Override
    public Prato createPrato() {
        return new PratoTorresmo();
    }

    @Override
    public Bebida createBebida() {
        return new BebidaCachaca();
    }
}
