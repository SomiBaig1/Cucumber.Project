package utils;

import Pages.AddEmployeePage;
import Pages.DashBoardPage;
import Pages.LoginPage;
import Pages.PersonalDetailsPage;

public class PageInitializer {
    public static LoginPage loginPage;

    public static DashBoardPage dashBoardPage;
    public static AddEmployeePage addEmployeePage;
    public static PersonalDetailsPage personalDetailsPage;


    public static void initPageObjects(){
        loginPage=new LoginPage();
        dashBoardPage=new DashBoardPage();
        addEmployeePage=new AddEmployeePage();
        personalDetailsPage=new PersonalDetailsPage();
    }
}
