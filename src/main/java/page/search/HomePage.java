package page.search;

import element.Button;
import element.TextField;
import page.Page;

public class HomePage extends Page {

    private TextField pesquisarTextField;
    private Button pesquisaGoogleButton;

    public HomePage() {

        if ("true".equals(String.valueOf(System.getProperty("browser.mobile")))) {

            pesquisarTextField = new TextField("input[name=\"q\"]");
            pesquisaGoogleButton = new Button("#tsf > div:nth-child(2) > div.A7Yvie.emca > div.zGVn2e > button");

        } else {

            pesquisarTextField = new TextField("input[name=\"q\"]");
            pesquisaGoogleButton = new Button("form#tsf div.aajZCb > div > center > input[name=\"btnK\"]");

        }

    }

    @Override
    public String getUrl() {
        return "https://www.google.com/";
    }

    public void pesquisar(String texto) { pesquisarTextField.set(texto); }

    public void click() { pesquisaGoogleButton.click(); }

}
