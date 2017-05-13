package unit.actions;

import com.hribol.spiderman.core.actions.TypeTextInElementFoundByCssSelector;
import com.hribol.spiderman.core.actions.WebDriverAction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 13.05.17.
 */
public class TypeTextInElementFoundByCssSelectorTest {

    @Test
    public void typesIfSuitableElementExists() {
        String cssSelector = ".something";
        String text = "text";
        String eventName = "event name";
        boolean expectsHttp = true;

        WebElement textBox = mock(WebElement.class);
        WebDriver driver = mock(WebDriver.class);
        when(driver.findElement(By.cssSelector(cssSelector))).thenReturn(textBox);

        WebDriverAction action = new TypeTextInElementFoundByCssSelector(cssSelector, text, eventName, expectsHttp);
        action.execute(driver);

        verify(textBox).sendKeys(text);
    }
}
