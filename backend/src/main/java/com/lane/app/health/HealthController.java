package com.lane.app.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

/**
 * Minimal endpoint to verify the backend is reachable end-to-end
 * (CI build -> container -> deployed instance -> frontend call).
 *
 * This is intentionally the very first feature in the codebase:
 * it lets the CI pipeline and the Docker setup be validated before
 * any real domain logic (Guide / Season / Now Point / Board) exists.
 */
@RestController
public class HealthController {

    @GetMapping("/api/health")
    public Map<String, Object> health() {
        return Map.of(
                "status", "UP",
                "service", "lane-backend",
                "timestamp", Instant.now().toString()
        );
    }
}
