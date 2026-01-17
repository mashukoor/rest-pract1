package test;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import utilites.ConfigReader;

public class BaseTest {
    @BeforeClass
    public void setUp(){
        RestAssured.baseURI = ConfigReader.get("base.uri");
    }
}
