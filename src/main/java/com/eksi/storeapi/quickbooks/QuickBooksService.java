package com.eksi.storeapi.quickbooks;

import java.io.IOException;

public interface QuickBooksService {
    String createPurchaseOrder(String jsonInputString) throws IOException;

}
