package com.eksi.storeapi.quickbooks;

import com.eksi.storeapi.ApplicationContext;
import com.eksi.storeapi.Authentication.ApiKeyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/quickbooks")
@RestController
public class QuickBooksController {

    private QuickBooksService qb = ApplicationContext.quickBooksService();


}
