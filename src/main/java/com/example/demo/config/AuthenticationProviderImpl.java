package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

public class AuthenticationProviderImpl implements AuthenticationProvider {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();//아이디
        String pwd = (String)authentication.getCredentials();
        Object obj = authentication.getPrincipal();
        System.out.println(username+","+pwd+","+obj);

        User user = (User) userDetailsService.loadUserByUsername(username);
        boolean state = passwordEncoder.matches(pwd, user.getPassword());
        System.out.println(state);

        UsernamePasswordAuthenticationToken authUser = null;

        if(state) {
            System.out.println("Login Success");
            authUser = new UsernamePasswordAuthenticationToken(user, pwd, user.getAuthorities());
        }else {
            System.out.println("Login Fail");
        }

        return authUser;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
