package utils;

import static utils.WebDriverUtils.*;

public class Main {
    public static void main(String[] args) {
        launchBrowser(ConfigFileReader.getPropertyV("url"));
        takeScreenshot("LoginPage");
    }
}
