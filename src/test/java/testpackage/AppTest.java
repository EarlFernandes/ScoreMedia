package testpackage;
import org.example.PreloginBtns;
import org.example.baseclass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest extends baseclass {



    @DataProvider(name = "Titles")
    public static Object[][] credentials() {

        // The number of times data is repeated, test will be executed the same no. of times

        // Here it will execute one time

        return new Object[][] {{"NBA" , "Leagues"}};

    }


    @Test(dataProvider = "Titles")
    public void RunTest(String Title1, String Title2) throws InterruptedException {

        PreloginBtns pgeobj = new PreloginBtns(driver);
        pgeobj.GetStartedBtn();
        pgeobj.NavigateToLeague();
        pgeobj.VerifyInLeague(Title1, Title2);
    }
}
