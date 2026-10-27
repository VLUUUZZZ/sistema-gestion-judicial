package mx.edu.utez.judicial.common.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ApiErrorTest {

    @Test
    void ofCreatesErrorWithoutDetails() {
        ApiError error = ApiError.of("COURT_NOT_FOUND", "Court does not exist");

        assertEquals("COURT_NOT_FOUND", error.code());
        assertTrue(error.details().isEmpty());
    }

    @Test
    void nullDetailsBecomeEmptyList() {
        ApiError error = new ApiError("INVALID_DATA", "Missing fields", null);

        assertTrue(error.details().isEmpty());
    }
}
