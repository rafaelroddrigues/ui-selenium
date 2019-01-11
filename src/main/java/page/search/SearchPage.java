package page.search;

import element.Text;
import page.Page;

public class SearchPage extends Page {

    private Text primeiroResultadoText = new Text("div#rso div:nth-child(1) > div > div:nth-child(1) > div > div > div.r > a:nth-child(1) > h3");

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public String getName() {
        return "Search Page - Result";
    }

    public String pegarTextoPrimeiroResultado() {
        return primeiroResultadoText.getText();
    }

}
