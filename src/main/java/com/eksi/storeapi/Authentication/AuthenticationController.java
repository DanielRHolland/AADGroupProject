package com.eksi.storeapi.Authentication;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private ApiKeyService aks = ApplicationContext.apiKeyService();

    @GetMapping(value = "/l")
    public String login(@RequestParam("id") String id, @RequestParam("hash") String hash) {
        return aks.createKey(id, hash);
    }

}
