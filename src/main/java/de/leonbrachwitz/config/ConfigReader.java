package de.leonbrachwitz.config;

import de.leonbrachwitz.api.MatchGoalsApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class ConfigReader {
    public static String readConfigForEndpoint(String path) {
        var inputStream = MatchGoalsApi.class.getResourceAsStream(path);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            return reader.lines().collect(Collectors.joining("\n"));
        } catch (Exception e) {
            return "";
        }
    }
}
