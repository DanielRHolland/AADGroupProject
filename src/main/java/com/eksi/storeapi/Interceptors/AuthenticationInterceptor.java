package com.eksi.storeapi.Interceptors;

import com.eksi.storeapi.ApplicationContext;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("[preHandle] [" + request + "]" + "[" + request.getMethod() + "]" + request.getRequestURI());
        String apiKey = request.getHeader("API_KEY");
        boolean keyIsValid= ApplicationContext.apiKeyService().checkKeyValid(apiKey);
        if (keyIsValid!=true){
            response.sendError(401, "Auth failed");//send failure
return false;
        }else {
            return true;
        }
    }
}
