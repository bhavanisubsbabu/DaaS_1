package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.StringTokenizer;

public class LoadCookiesData {
    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/rnaidu/mapmaker-acceptancetest/Jars/chromedriver");

        driver = new ChromeDriver();


        try {

            File file = new File("Cookies.data");
            FileReader fileReader = new FileReader(file);
            BufferedReader Buffreader = new BufferedReader(fileReader);
            String strline;
            while ((strline = Buffreader.readLine()) != null) {

                StringTokenizer token = new StringTokenizer(strline, ";");

                while (token.hasMoreTokens()) {

                    System.out.println( "............0");

                    String name;

                    if ((name = token.nextToken()).equals("JSESSIONID")) {

                        String value = token.nextToken();

                        String domain = token.nextToken();

                        String path = token.nextToken();
                        Date expiry = null;

                        String val = token.nextToken();

                        System.out.println(val + "............date ");

                        if (!(val.equals("null"))) {

                            expiry = new Date(val);

                        }

                        Boolean isSecure = new Boolean(token.nextToken()).booleanValue();

                        System.out.println(isSecure + "............2");

                        driver.get("http://" + domain + ":8080" + path + "login");

                        driver.manage().deleteAllCookies();

                        Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);

                        System.out.println(ck + "............3");

                        driver.manage().addCookie(ck); // This will add the stored cookie to your current session


                        driver.get("http://" + domain + ":8080" + path + "login");

                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}