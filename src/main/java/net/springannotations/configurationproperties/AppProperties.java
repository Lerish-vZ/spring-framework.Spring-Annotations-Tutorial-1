package net.springannotations.configurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "app")
@Component
public class AppProperties {
    private String name;
    private String description;
    private String uploadDir;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUploadDir() {
        return uploadDir;
    }
}
