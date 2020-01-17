package com.eksi.storeapi.Authentication;

import com.eksi.storeapi.ApplicationContext;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
//TODO reimplement this completely
public class ApiKeyImpl implements ApiKeyService {

    private List<SessionKey> sessionKeys;//TODO use binary tree instead

    @Override
    public String createKey(String id, String hash) {
       // if (ApplicationContext.customersBl().getStaff(id).getHash() == hash) { //TODO make this check if hash is correct for hash
            final SessionKey sessionKey = new SessionKey(md5(id+hash), id);//TODO investigate whether a more sophisticated ApiKey generation method would be more appropriate
            sessionKeys.add(sessionKey);
            return sessionKey.getApiKey();
        //}
        //return null; //TODO should show failure in a more elegant way than by returning null
    }

    private String md5(String s) {
        try {
            return new BigInteger(1, MessageDigest.getInstance("MD5").digest(s.getBytes())).toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace(); //TODO Handle this in a better way
        }

        return null; //TODO should not fail by returning null
    }

    @Override
    public boolean checkKeyValid(String apiKey) {
        return sessionKeys.stream().anyMatch(sessionKey -> sessionKey.getApiKey().equals(apiKey));
    }

    @Override
    public String getStaffId(String apiKey) {//TODO reimplement this
        return sessionKeys.stream().filter(sessionKey -> sessionKey.getApiKey() == apiKey).findFirst().get().getApiKey();
    }
}
