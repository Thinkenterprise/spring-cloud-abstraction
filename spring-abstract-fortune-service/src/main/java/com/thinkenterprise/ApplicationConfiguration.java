package com.thinkenterprise;

import org.springframework.cloud.aws.jdbc.config.annotation.EnableRdsInstance;
import org.springframework.cloud.aws.jdbc.config.annotation.RdsInstanceConfigurer;
import org.springframework.cloud.aws.jdbc.datasource.DataSourceFactory;
import org.springframework.cloud.aws.jdbc.datasource.TomcatJdbcDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableRdsInstance(dbInstanceIdentifier = "aas4q7qdhwrqfr",password = "fortunedb")
public class ApplicationConfiguration {

    @Bean
    public RdsInstanceConfigurer instanceConfigurer() {
        return new RdsInstanceConfigurer() {
            @Override
        	public DataSourceFactory getDataSourceFactory() {
        		TomcatJdbcDataSourceFactory dataSourceFactory = new TomcatJdbcDataSourceFactory();
        		dataSourceFactory.setInitialSize(10);
        		dataSourceFactory.setValidationQuery("SELECT 1 FROM DUAL");
        		return dataSourceFactory;
        	}
        };
    }
}