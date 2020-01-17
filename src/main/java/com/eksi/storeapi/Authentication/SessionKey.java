package com.eksi.storeapi.Authentication;

public class SessionKey {
    public String apiKey;
    public String userId;

    public SessionKey(String apiKey, String userId) {
        this.apiKey = apiKey;
        this.userId = userId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
