package com.bokecc.system;

import com.sun.deploy.config.SecuritySettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by lijm on 2017/12/17.
 */
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private SecuritySettings settings;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
    }
}
