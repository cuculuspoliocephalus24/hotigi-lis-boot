package com.hotogislab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .authorizeHttpRequests(auth -> auth

                // 登録画面は誰でも見られる
                .requestMatchers(
                    "/",
                    "/h2-console/**"
                ).permitAll()

                // 記録一覧と分析画面はログイン必須
                .requestMatchers(
                    "/records",
                    "/analysis"
                ).authenticated()

                // その他はひとまず許可
                .anyRequest().permitAll()
            )

            .formLogin(form -> form
                .defaultSuccessUrl("/records", true)
            )

            .logout(logout -> logout
                .logoutSuccessUrl("/")
            )

            // H2 Console用
            .csrf(csrf -> csrf
                .ignoringRequestMatchers("/h2-console/**")
            )

            .headers(headers -> headers
                .frameOptions(frame -> frame.sameOrigin())
            );

        return http.build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories
                .createDelegatingPasswordEncoder();
    }

    @Bean
    UserDetailsService userDetailsService(
            PasswordEncoder passwordEncoder) {

        UserDetails viewer = User
                .withUsername("shide")
                .password(
                    passwordEncoder.encode("death")
                )
                .roles("VIEWER")
                .build();

        return new InMemoryUserDetailsManager(viewer);
    }
}