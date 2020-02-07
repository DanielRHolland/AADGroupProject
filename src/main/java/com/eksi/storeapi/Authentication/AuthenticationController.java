package com.eksi.storeapi.Authentication;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/auth")
public class AuthenticationController {
    private ApiKeyService aks = ApplicationContext.apiKeyService();

    @GetMapping(value = "/l")
    public String login(@RequestParam("id") String id, @RequestParam("hash") String hash) {
        return aks.createKey(id, hash);
    }

}
