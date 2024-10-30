package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.DriverSetup;

@Epic("Mobile automation Calendar app testing")
@Feature("Event")
public class CalendarTwoTest extends DriverSetup {

    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description: Create new event")
    @Story("Unsuccessful creation of a new calendar event")
    @Test(testName = "Calendar test two")
    public void calendarTest() {

        Assert.assertTrue(calendarHomePage.calendarHomePageLoaded(), "Calendar home page is not loaded");

//        calendarHomePage.chooseTimeslot("02:00");
        Assert.assertTrue(newEventPage.newEventPageLoaded(), "New event page is not loaded");

        newEventPage.chooseStartHour("20", "05");
    }
}
