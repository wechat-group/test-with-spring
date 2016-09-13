package com.testwithspring.starter.spring.web;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import static com.testwithspring.starter.spring.web.WebTestConfig.objectMapper;

public final class WebTestUtil {

    /**
     * Prevents instantiation.
     */
    private WebTestUtil() {}

    public static byte[] convertObjectToJsonBytes(Object object) throws IOException {
        ObjectMapper mapper = objectMapper();
        return mapper.writeValueAsBytes(object);
    }

    /**
     * Creates a new {@code String} object.
     * @param length    The length of the created {@code String}.
     * @return  The created {@code String} object.s
     */
    public static String createStringWithLength(int length) {
        StringBuilder string = new StringBuilder();
        for (int index = 0; index < length; index++) {
            string.append("a");
        }
        return string.toString();
    }
}
