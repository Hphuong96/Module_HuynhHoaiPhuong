//package com.casestudy.casestudy.services.serviceImpl;
//
//import com.casestudy.casestudy.entity.Role;
//import com.casestudy.casestudy.entity.User;
//import com.casestudy.casestudy.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class UserImpl implements UserDetailsService {
//@Autowired
//    UserRepository userRepository;
//    @Override
//    @Transactional
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        User user = userRepository.findByEmail(s);
//        if (user == null){
//            throw new UsernameNotFoundException("user not found");
//        }
//        Set<GrantedAuthority> grantedAuthority = new HashSet<>();
//        Set<Role> roles= user.getRoles();
//        for (Role role:roles) {
//            grantedAuthority.add(new SimpleGrantedAuthority(role.getName()));
//        }
//        return new org.springframework.security.core.userdetails.User(
//                user.getEmail(),user.getPassword(),grantedAuthority
//        );
//    }
//}
