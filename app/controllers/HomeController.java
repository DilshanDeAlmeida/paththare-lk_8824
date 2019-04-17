package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import play.libs.Json;
import play.mvc.*;

class AppSummary {
    private String content;

    AppSummary(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

public class HomeController extends Controller {

    public Result appSummary() {
        JsonNode jsonNode = Json.toJson(new AppSummary("Java Play Angular Seed"));
        return ok(jsonNode).as("application/json");
    }

    public Result postTest() {
        JsonNode jsonNode = Json.toJson(new AppSummary("Post Request Test => Data Sending Success"));
        return ok(jsonNode).as("application/json");
    }

    public Result showProduct(String productId){
//        Product product=Product.findProduct.byId(productId);
//        return ok(Json.toJson(product.getCategory()));
        JsonNode jsonNode = Json.toJson(new AppSummary("shit"));
        return ok(jsonNode).as("application/json");
    }
}
