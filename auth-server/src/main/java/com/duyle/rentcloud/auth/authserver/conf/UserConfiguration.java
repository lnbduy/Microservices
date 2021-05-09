package com.duyle.rentcloud.auth.authserver.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {
    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("duyle")
                .password(passwordEncoder.encode("duyle"))
                .roles("ADMIN", "USER")
                .authorities("CAN_READ", "CAN_WRITE", "CAN_DELETE")
            .and()
                .withUser("duylnb")
                .password(passwordEncoder.encode("duylnb"))
                .roles("ADMIN", "USER")
                .authorities("CAN_READ", "CAN_WRITE");
    }
}
