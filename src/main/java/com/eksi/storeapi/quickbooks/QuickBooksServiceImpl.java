package com.eksi.storeapi.quickbooks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class QuickBooksServiceImpl implements QuickBooksService {

    @Override
    public String createPurchaseOrder(String jsonInputString) throws IOException {
        QuickBooksAPI api = new QuickBooksAPI();
        URL url = new URL(QuickBooksAPI.BASE_QUICKBOOK_URL + api.getCreatePurchaseOrder());
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        try {
            con.setDoOutput(true);
            OutputStream os = con.getOutputStream();
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                if (con.getResponseCode() == 200) {
                    return "pass";
                } else {
                    return "fail";
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return "null";
    }
}
