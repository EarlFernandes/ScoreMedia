package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PreloginBtns extends BasePage {

    public PreloginBtns(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "action_button_text")
    WebElement ActionBtn;

    @AndroidFindBy(id = "btn_primary")
    WebElement ContinueBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='NBA Basketball']")
    WebElement NBA_Basketball;

    @AndroidFindBy(id = "btn_allow")
    WebElement AllowBtn1;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    WebElement AllowBtn2;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    WebElement While_using_app;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Toronto Raptors']")
    WebElement Raptors;

    @AndroidFindBy(id = "dismiss_modal")
    WebElement DismissModal;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Leagues\"]/android.view.ViewGroup/android.widget.TextView")
    WebElement Leagues;

    //League Buttons

    @AndroidFindBy(id = "header_right_text")
    WebElement Edit;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='NBA']")
    WebElement League_NBA;

    @AndroidFindBy(id = "titleTextView")
    WebElement League_Title;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='STANDINGS']")
    WebElement Standings_tab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='DIVISION']")
    WebElement Division_tab;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    WebElement Back_btn;

    public void GetStartedBtn() {
        try {
            ActionBtn.click();
        } catch (Exception ignored) {

        }
    }

    public void NavigateToLeague() {
        try {
            NBA_Basketball.click();
            ActionBtn.click();
            AllowBtn1.click();
            While_using_app.click();
            Raptors.click();
            ContinueBtn.click();
            ContinueBtn.click();
            AllowBtn2.click();
            DismissModal.click();
            Leagues.click();
            Edit.click();
            Edit.click();

        } catch (Exception ignored) {

        }
    }

    //Verifying the tasks 1 ~ 5 as in the requested assignment document
    public void VerifyInLeague(String ExpectedTitle1, String ExpectedTitle2) {
        try {

            League_NBA.click();

            String ActualLeagueTitle = League_Title.getText();

            //Verifying that the tab title is actually NBA
            Assert.assertEquals(ActualLeagueTitle, ExpectedTitle1, "Actual title is not NBA");
            System.out.println(League_Title.getText() + " is displayed in Title indicating the League (NBA) is selected correctly.");
            Standings_tab.click();

            //Verifying if the actual Standings tab is selected
            if (Standings_tab.isSelected()) {
                System.out.println("Standings tab is selected correctly as expected");
            } else {
                System.out.println("Standings tab is not selected");
            }

            //Verifying if Division is displayed as a sub tab of Standings (since Division is only part of NBA league)
            if (Division_tab.isDisplayed()) {
                System.out.println("Content is correct and related to NBA league");
            } else {
                System.out.println("Content is not related to NBA league as expected");
            }

            //Verifying that back navigation returns you to the previous page correctly.
            Back_btn.click();
            Assert.assertEquals(League_Title.getText(), ExpectedTitle2, "Back button did not navigate back to Leagues page");
            System.out.println(League_Title.getText() + " is displayed in Title indicating back navigation returns you to the previous page (Leagues) correctly.");


        } catch (Exception ignored) {

        }
    }
}
