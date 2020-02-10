package com.eksi.storeapi;

import com.eksi.storeapi.Authentication.ApiKeyImpl;
import com.eksi.storeapi.Authentication.ApiKeyService;
import com.eksi.storeapi.Entries.EntriesService;
import com.eksi.storeapi.Entries.EntriesServiceImpl;
import com.eksi.storeapi.Products.ProductService;
import com.eksi.storeapi.Staff.StaffService;
import com.eksi.storeapi.Transactions.TransactionService;
import com.eksi.storeapi.Products.ProductServiceImpl;
import com.eksi.storeapi.Staff.StaffServiceImpl;
import com.eksi.storeapi.Transactions.TransactionServiceImpl;
import com.eksi.storeapi.quickbooks.QuickBooksService;
import com.eksi.storeapi.quickbooks.QuickBooksServiceImpl;

public class ApplicationContext {

    static private ProductService productService;
    static public ProductService productsService() {
        if (productService==null) {
            productService = new ProductServiceImpl();
        }
        return productService;
    }

    static private StaffService staffService;
    static public StaffService staffService() {
        if (staffService==null) {
            staffService = new StaffServiceImpl();
        }
        return staffService;
    }

    static private TransactionService transactionService;
    static public TransactionService transactionService() {
        if (transactionService==null) {
            transactionService = new TransactionServiceImpl();
        }
        return transactionService;
    }

    static private EntriesService entriesService;
    static public EntriesService entriesService(){
        if(entriesService==null){
            entriesService = new EntriesServiceImpl();
        }
        return entriesService;
    }

    static private ApiKeyService apiKeyService;
    static public ApiKeyService apiKeyService() {
        if (apiKeyService==null) {
            apiKeyService = new ApiKeyImpl();
        }
        return apiKeyService;
    }

    static private QuickBooksService quickBooksService;
    static public QuickBooksService quickBooksService(){
        if(quickBooksService==null){
            quickBooksService = new QuickBooksServiceImpl();
        }
        return quickBooksService;
    }
}
