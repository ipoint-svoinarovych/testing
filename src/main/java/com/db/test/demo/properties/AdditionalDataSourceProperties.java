package com.db.test.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "spring.datasource")
public class AdditionalDataSourceProperties {
    private String validationQuery;

    public String getValidationQuery () {
        return validationQuery;
    }

    public void setValidationQuery ( String validationQuery ) {
        this.validationQuery = validationQuery;
    }
}
