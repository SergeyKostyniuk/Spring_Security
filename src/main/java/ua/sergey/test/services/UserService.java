package ua.sergey.test.services;


import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.sergey.test.domain.Role;
import ua.sergey.test.domain.User;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private  UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        return User.builder()
                .username("user")
                    .password("user")
                    .authorities(ImmutableList.of(Role.USER))
                    .accountNonExpired(true)
                .accountNonLocked(true)
                .credentialsNonExpired(true)
                .enabled(true)
                .build();
    }
}
