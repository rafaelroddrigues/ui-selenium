package page.search;

import element.Button;
import element.TextField;
import page.Page;

public class HomePage extends Page {

    private TextField pesquisarTextField = new TextField("input[name=\"q\"]");
    private Button pesquisaGoogleButton = new Button("#tsf > div:nth-child(2) > div.A7Yvie.emca > div.zGVn2e > button");

    @Override
    public String getUrl() {
        return "https://www.google.com/";
    }

    @Override
    public String getName() {
        return "Home Page - Search";
    }

    public SearchPage pesquisar(String texto) {
        goTo();

        pesquisarTextField.set(texto);
        pesquisaGoogleButton.click();

        return new SearchPage();
    }
}
