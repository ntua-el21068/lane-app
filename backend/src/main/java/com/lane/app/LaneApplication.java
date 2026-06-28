package com.lane.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Lane backend.
 *
 * Phase 0 / Phase 1 scope: expose a minimal API surface (health check) and
 * wire up the project skeleton (persistence, security, docs) so later
 * phases (Guide engine, Season engine, Board engine) can be added as
 * self-contained packages without restructuring the project.
 */
@SpringBootApplication
public class LaneApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaneApplication.class, args);
    }
}
