package com.duyle.rentclound.authorizationserver.service;

import com.duyle.rentclound.authorizationserver.model.AuthUserDetail;
import com.duyle.rentclound.authorizationserver.model.User;
import com.duyle.rentclound.authorizationserver.repository.UserDetailRepository;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    private UserDetailRepository repository;

    public UserDetailServiceImpl(UserDetailRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username or password is wrong"));
        AuthUserDetail authUserDetail = new AuthUserDetail(user);

        new AccountStatusUserDetailsChecker().check(authUserDetail);
        return authUserDetail;
    }
}
