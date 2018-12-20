package page.search;

import element.Text;
import page.Page;

public class SearchPage extends Page {

    private Text primeiroResultadoText = new Text("#rso > div:nth-child(1) > div:nth-child(1) > div > div > div:nth-child(1) > div > a > div.MUxGbd.v0nnCb");

    @Override
    public String getUrl() {
        return null;
    }

    public String pegarTextoPrimeiroResultado() {
        return primeiroResultadoText.getText();
    }

}
