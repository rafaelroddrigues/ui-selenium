package page.search;

import element.Text;
import page.Page;

public class SearchPage extends Page {

    private Text primeiroResultadoText;

    public SearchPage() {

        if ("true".equals(String.valueOf(System.getProperty("browser.mobile")))) {
            primeiroResultadoText = new Text("#rso > div:nth-child(1) > div:nth-child(1) > div > div > div:nth-child(1) > div > a > div.MUxGbd.v0nnCb");
        } else {
            primeiroResultadoText = new Text("#rso > div:nth-child(1) > div > div:nth-child(1) > div > div > div.r > a:nth-child(1) > h3");
        }

    }

    @Override
    public String getUrl() {
        return null;
    }

    public String pegarTextoPrimeiroResultado() {
        return primeiroResultadoText.getText();
    }

}
