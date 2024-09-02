package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.classes.FabricaCombinacaoDois;
import src.main.java.classes.FabricaCombinacaoTres;
import src.main.java.classes.FabricaCombinacaoUm;
import src.main.java.classes.Restaurante;
import src.main.java.interfaces.FabricaAbstrata;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {

    @Test
    void devePrepararLasanha() {
        FabricaAbstrata fabrica = new FabricaCombinacaoUm();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("Preparando lasanha", restaurante.prepararPrato());
    }

    @Test
    void deveServirVinho() {
        FabricaAbstrata fabrica = new FabricaCombinacaoUm();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("Servindo vinho", restaurante.servirBebida());
    }

    @Test
    void devePrepararHamburguer() {
        FabricaAbstrata fabrica = new FabricaCombinacaoDois();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("Preparando hamburguer", restaurante.prepararPrato());
    }

    @Test
    void deveServirCerveja() {
        FabricaAbstrata fabrica = new FabricaCombinacaoDois();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("Servindo cerveja", restaurante.servirBebida());
    }

    @Test
    void devePrepararTorresmo() {
        FabricaAbstrata fabrica = new FabricaCombinacaoTres();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("Preparando torresmo", restaurante.prepararPrato());
    }

    @Test
    void deveServirCachaca() {
        FabricaAbstrata fabrica = new FabricaCombinacaoTres();
        Restaurante restaurante = new Restaurante(fabrica);
        assertEquals("Servindo cachaça", restaurante.servirBebida());
    }
}