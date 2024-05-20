package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface LogOutSidebar extends ExtendedWebPage {

    @Description("Log out button on Log Out sidebar")
    @FindBy("//button[contains(@class, 'btn-sign-out')]")
    ExtendedMyWebElement logOutButton();

}
