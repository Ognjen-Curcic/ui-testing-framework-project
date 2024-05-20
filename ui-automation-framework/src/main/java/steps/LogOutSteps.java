package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.LogOutSidebar;

public class LogOutSteps {

    private static final MyPageFactory PAGE_FACTORY = MyPageFactoryProvider.getInstance();

    private LogOutSidebar logOutSidebar() {
        return PAGE_FACTORY.on(LogOutSidebar.class);
    }

    public LogOutSteps clickOnLogOutButton() {
        logOutSidebar().logOutButton().click();
        return new LogOutSteps();
    }


}
