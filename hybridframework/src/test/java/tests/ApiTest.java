package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import api.ApiClient;

public class ApiTest {

    @Test
    public void apiTest() {

        int code = ApiClient.getStatusCode();

        System.out.println("Status Code = " + code);

        Assert.assertEquals(code, 200);
    }
}