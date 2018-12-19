package search;

import base.BaseTest;
import org.junit.Test;
import page.search.HomePage;
import page.search.SearchPage;

import static org.junit.Assert.assertEquals;

public class PesquisaTest extends BaseTest {

    @Test
    public void deveRetornarPrimeiroResultadoDaPesquisa() {
        SearchPage searchPage = new HomePage().pesquisar("Download Selenium");

        assertEquals("Downloads - Selenium", searchPage.pegarTextoPrimeiroResultado());
    }
}
