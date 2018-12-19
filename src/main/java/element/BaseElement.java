package element;

import browser.Chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static espera.Espera.esperaElementoAparecer;
import static espera.Espera.esperaElementoSumir;

public abstract class BaseElement {

    private WebElement element;
    private String seletor;
    private ChromeDriver driver = Chrome.getDriver();

    public BaseElement(final String seletor) {
        this.seletor = seletor;
    }

    protected WebElement getElement() {
        try {
            esperaElementoAparecer(seletor);
            //esperaElementoSumir("");

            if(seletor.contains("//*")){
                element = driver.findElement(By.xpath(seletor));
            } else {
                element = driver.findElement(By.cssSelector(seletor));
            }
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException(String
                .format("Elemento não encontrado na página.\nXpath ou CssSelector: %s \n" + e, seletor));
        }

        return element;
    }

}
