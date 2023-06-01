package com.eversun.flywaydb.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@Log4j2
@RequiredArgsConstructor
public class DatasourceConfig {

    private static final String ACCOUNT_DB_PASS = "Tv(=<]]r<HQP0J?]";
    private static final String ACCOUNT_DB_USER = "sd-dev";
    private static final String ACCOUNT_DB_URL = "jdbc:postgresql://34.172.161.190:5432/my_database";

    @Bean
    public DataSource getDataSource() {

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(ACCOUNT_DB_URL);
        dataSourceBuilder.username(ACCOUNT_DB_USER);
        dataSourceBuilder.password(ACCOUNT_DB_PASS);

        return dataSourceBuilder.build();
    }
}

//package com.eversun.flywaydb.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//@Configuration
//public class DatasourceConfig {
//
//    @Value("${spring.datasource.url}")
//    private String url;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    @Value("${spring.datasource.driver-class-name}")
//    private String driverClassName;
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
//}
