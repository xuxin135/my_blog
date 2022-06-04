//package com.xuxin.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//            .antMatchers("/static/**",
//                    "/bootstrap-3.4.1/css/**",
//                    "/bootstrap-3.4.1/js/**",
//                    "/jquery-3.4.1/**",
//                    "/web/login",
//                    "/login",
//                    "/actuator/**",
//                    "/instances/**",
//                    "/favicon.ico"
//                ).permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin().loginPage("/web/login").permitAll()
//                .successHandler(new LoginSuccessHandler()).and()
//                .logout().logoutUrl("/logout")
//                .and()
//                .httpBasic().and()
//                .csrf()
//                .disable();
//    }
//}
