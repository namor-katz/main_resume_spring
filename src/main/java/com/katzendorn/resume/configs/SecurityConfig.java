package com.katzendorn.resume.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/login/**", "/css/**", "/images/**", "/js/**", "/webjars/**", "/categories/**", "/rest/admin/add", "/rest/kladr/*", "/rest/posting/*", "/rest/messages/**").permitAll()
                .anyRequest().permitAll();
    }
}
