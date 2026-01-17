package test;

import clients.AddOrderClient;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.addorder.AddOrderPojo;
import utilites.ConfigReader;
import utilites.TextReaderUtil;

import java.io.IOException;
import java.util.List;

public class AddOrderTest extends BaseTest {
    @Test
           public void addOrderTests() throws IOException {

        String body= "[\n" +
                "  {\n" +
                "    \"user_id\": \"18\",\n" +
                "    \"product_id\": \"18\",\n" +
                "    \"product_name\": \"pencil124\",\n" +
                "    \"product_amount" +
                "\": 10,\n" +
                "    \"qty\": 1,\n" +
                "    \"tax_amt\": 1,\n" +
                "    \"total_amt\": 12\n" +
                "  }\n" +
                "]";
        //Response response = AddOrderClient.addOrder(body);
        Response response = AddOrderClient.addOrders(body);
        System.out.println(response.toString());
        AddOrderPojo responseAddOrderPojo = response.as(AddOrderPojo.class);
        int total_amtValue = responseAddOrderPojo.getOrders().get(5).getTotal_amt();
        String productNameValue=responseAddOrderPojo.getOrders().get(5).getProduct_name();
        List<Object[]> lines = TextReaderUtil.readExpectedValues("src/test/resources/AddOrderExpectedResults.txt");
        for(Object[] data:lines){
            String expectedProductName = (String)data[0];
            int expectedTotalAmount = (int)data[1];
            System.out.println(expectedProductName);
        }


        System.out.println(total_amtValue);
        Assert.assertEquals(12,total_amtValue);
        Assert.assertEquals("pencil123",productNameValue);
    }

    


}
