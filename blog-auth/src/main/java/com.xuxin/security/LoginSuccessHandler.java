//package com.xuxin.security;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
//import org.springframework.security.web.savedrequest.RequestCache;
//import org.springframework.security.web.savedrequest.SavedRequest;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class LoginSuccessHandler implements AuthenticationSuccessHandler {
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//        String contextPath = request.getContextPath();
//        System.out.println(contextPath);
//        response.setContentType("application/json;charset=utf-8");
//        RequestCache cache = new HttpSessionRequestCache();
//        SavedRequest savedRequest = cache.getRequest(request,response);
//        String url = savedRequest.getRedirectUrl();
//        System.out.println(url);
//        response.sendRedirect(url + "/");
//    }
//}
