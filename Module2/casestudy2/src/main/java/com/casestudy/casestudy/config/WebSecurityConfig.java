//package com.casestudy.casestudy.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
////@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    UserDetailsService userDetailsService;
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder managerBuilder) throws Exception {
//        managerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//    @Override
//    public void configure(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.authorizeRequests()
//                .antMatchers("/","login","register").permitAll()
//                .antMatchers("/review","booking").hasAnyRole("MEMBER","ADMIN")
//                .antMatchers("/admin").hasRole("ADMIN")
//                .and()
//                .formLogin()
//                .loginPage("login")
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .defaultSuccessUrl("/")
//                .failureUrl("/login?error")
//                .and()
//                .exceptionHandling()
//                .accessDeniedPage("/403");
//    }
//}
