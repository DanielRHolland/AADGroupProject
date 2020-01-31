package com.eksi.storeapi.Authentication;

/**
 * Interface declaring the methods provided by the Authentication component
 */
public interface ApiKeyService{
  /**
   * Creates new apiKey, stores it, and returns it
   * 
   * @param id the id of the the staff member for whom the key is being
   *    created
   * @param hash the password hash of the staff member
   * @return apiKey is the apiKey for the user 
   */
    String createKey(String id, String hash);

    /**
     * Checks an apiKey is valid
     * 
     * @param apiKey key to check
     * @return true if key is valid, false otherwise
     */
    boolean checkKeyValid(String apiKey);

    /**
     * Get the id of a Staff member from their apiKey
     *
     * @param apiKey the apiKey
     * @return staffId, the id of the staff member
     *
     */
    String getStaffId(String apiKey);
}

//TODO Add unit tests for this
