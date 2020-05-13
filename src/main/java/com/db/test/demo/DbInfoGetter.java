package com.db.test.demo;

import javax.sql.DataSource;

import com.db.test.demo.properties.AdditionalDataSourceProperties;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.jdbc.DataSourceHealthIndicator;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.stereotype.Component;

@Component
public class DbInfoGetter {

    private String driverClassName;

    private String username;

    private String password;

    private String url;

    private String validationQuery;


    DbInfoGetter ( DataSourceProperties properties, AdditionalDataSourceProperties additionalDataSourceProperties ) {
        this.driverClassName = properties.getDriverClassName ();
        this.username = properties.getUsername ();
        this.password = properties.getPassword ();
        this.url = properties.getUrl ();
        this.validationQuery = additionalDataSourceProperties.getValidationQuery ();


    }


    public DataSource getDataSource () {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create ();
        dataSourceBuilder.password ( password );
        dataSourceBuilder.username ( username );
        dataSourceBuilder.url ( url );
        dataSourceBuilder.driverClassName ( driverClassName );
        return dataSourceBuilder.build ();
    }

    public HealthIndicator dbHealthIndicator () {
        DataSourceHealthIndicator dshi = new DataSourceHealthIndicator ( getDataSource (), validationQuery);
        System.out.println ( dshi.health ().getStatus () );
        return dshi;
    }


    public DbStatusInfo getDbInfo ( String dbName ) {
        DbStatusInfo info = new DbStatusInfo ();
        HealthIndicator indicator = dbHealthIndicator ();
        info.setDbName ( url );
        info.setDbUser ( username );
        info.setDbPassword ( password );
        info.setDbDriver ( driverClassName );
        info.setDbStatus ( indicator.health ().getStatus ().toString () );
        return info;
    }

}
