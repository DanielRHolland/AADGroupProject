package com.eksi.storeapi.Authentication;

public interface ApiKeyService{
    String createKey(String id, String hash);
    boolean checkKeyValid(String apiKey);
    String getStaffId(String apiKey);
}
