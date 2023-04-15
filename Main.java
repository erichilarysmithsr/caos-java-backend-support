package com.aphidb;

import com.aphidb.Usda;
import com.aphidb.SearchResultFood;
import com.aphidb.NutritionixClient;
import com.aphidb.FirebaseApp;
import com.aphidb.PostmarkMessage;
import java.lang.Object;
import com.squareup.okhttp.*;

class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n    \"collection\":\"PIRDDIIQFoodOntoMyPlate\",\n    \"database\":\"CO2REMEDi\",\n    \"dataSource\":\"CAOS\",\n    \"projection\": {\"_id\": 1}\n\n}");
        Request request = new Request.Builder()
          .url("https://data.mongodb-api.com/app/data-hgnct/endpoint/data/v1/action/findOne")
          .method("POST", body)
          .addHeader("Content-Type", "application/json")
          .addHeader("Access-Control-Request-Headers", "*")
          .addHeader("api-key", "<API_KEY>")
          .build();
        Response response = client.newCall(request).execute();
    }
}
