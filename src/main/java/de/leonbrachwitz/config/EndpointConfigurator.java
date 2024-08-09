package de.leonbrachwitz.config;

public class EndpointConfigurator {
    public static void runConfigForEndpoint(String endpoint) {
        try {
            var config = ConfigReader.readConfigForEndpoint(getPath(endpoint));
            var processBuilder = new ProcessBuilder("/bin/bash", "-c", config);
            processBuilder.start();
        } catch (Exception e) {
            //do nothing
        }
    }

    private static String getPath(String endpoint) {
        return String.format("/scripts/%s.sh", endpoint);
    }
}
