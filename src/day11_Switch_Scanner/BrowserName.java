package day11_Switch_Scanner;

public class BrowserName {
    public static void main(String[] args) {
        /*
3. write a program that can display the selected browser
3.1 declare a String variable called browserName
3.2 Assume that the valid browsers are: chrome, firefox,
opera, safari, edge
3.3 if the browser name does not match with the valid
browsers' names, out put should be: Invalid Browser
Do Not use if statement or ternary

         */
        String browserName = "safari",
                result = "";
        switch (browserName){
            case "chrome":
                browserName = "chrome";
                result = "valid browser";
                break;
            case "firefox":
                browserName = "firefox";
                result= "valid browser";
                break;
            case "opera":
                browserName = "opera";
                result = "valid browser";
                break;
            case "edge":
                browserName="edge";
                result = "valid browser";
            default:
                System.out.println("invalid browser");

        }
        System.out.println(browserName +" is  "+ result);
    }
}
