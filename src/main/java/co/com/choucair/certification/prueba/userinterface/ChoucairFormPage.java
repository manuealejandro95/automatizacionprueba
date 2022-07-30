package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairFormPage extends PageObject {
    public static final Target VIEWFORM_BUTTON = Target.the("This button open the page of form register")
            .located(By.xpath("//*[@class='unauthenticated-nav-bar__sign-up'  or  text()='Join Today']"));

    public static final Target INPUT_FIRSNAME = Target.the("This input write the Firs name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("This input write the lastname")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL= Target.the("This input write the Email")
            .located(By.name("email"));

    public static final Target SELECT_MONTH = Target.the("This input write the MONTH")
            .located(By.id("birthMonth"));

    public static final Target SELECT_DAY = Target.the("This input write the DAY")
            .located(By.id("birthDay"));

    public static final Target INPUT_YEAR = Target.the("This input write the YEAR")
            .located(By.id("birthYear"));

    public static final Target Next_Page = Target.the("Next Page")
            .located(By.xpath("//div/form/div/a"));

    public static final Target INPUT_CITY = Target.the("This input write OF THE CITY")
            .located(By.id("city"));

    public static final Target INPUT_POSTAL= Target.the("This input write The Postal code")
            .located(By.id("zip"));

    public static final Target INPUT_COUNTRY= Target.the("This input write The COUNTRY")
            .located(By.id("//div[@class='ui-select']/div/div/div"));

    public static final Target Next_Page2 = Target.the("Next Page")
            .located(By.xpath("a[ng-click=\"validateAddressInfoStep(forms.userForm);\"]"));
}
