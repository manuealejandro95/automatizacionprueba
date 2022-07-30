package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.userinterface.ChoucairFormPage;
import cucumber.api.java.vi.Cho;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.*;
import net.serenitybdd.screenplay.rest.interactions.Options;
import org.openqa.selenium.support.ui.Select;

public class Login  implements Task{
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public  <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ChoucairFormPage.VIEWFORM_BUTTON),
                Enter.theValue("Pepito").into(ChoucairFormPage.INPUT_FIRSNAME),
                Enter.theValue("Perez").into(ChoucairFormPage.INPUT_LASTNAME),
                Enter.theValue("pepito23965@gmail.com").into(ChoucairFormPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("February").from(ChoucairFormPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("2").from(ChoucairFormPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("2000").from(ChoucairFormPage.INPUT_YEAR),
                Click.on(ChoucairFormPage.Next_Page),
                Click.on(ChoucairFormPage.Next_Page2)
                );
    }
}
