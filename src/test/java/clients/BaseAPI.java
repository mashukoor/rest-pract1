package clients;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseAPI {
    private static RequestSpecification requestSpecification;
    public static RequestSpecification getRequestSpecification(){
        if(requestSpecification==null){
            RequestSpecBuilder builder = new RequestSpecBuilder();
            builder.setContentType(ContentType.JSON);
            builder.setAccept(ContentType.JSON);
            builder.addFilter(new RequestLoggingFilter());
            requestSpecification = builder.build();
        }
        return requestSpecification;
    }
}
