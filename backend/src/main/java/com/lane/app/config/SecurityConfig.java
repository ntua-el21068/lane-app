package com.lane.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Phase 0/1 security posture: public health check, everything else
 * locked down by default. JWT-based authentication for real user
 * sessions is introduced in a later phase (see docs/ARCHITECTURE.md).
 *
 * Keeping this explicit from commit #1 avoids the common mistake of
 * "we'll add security later" - the filter chain exists from the start,
 * it just grows in scope as features are added.
 */
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // stateless API, revisit if cookie-based auth is introduced
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/health", "/swagger-ui/**", "/v3/api-docs/**").permitAll()
                .anyRequest().authenticated()
            );

        return http.build();
    }
}
