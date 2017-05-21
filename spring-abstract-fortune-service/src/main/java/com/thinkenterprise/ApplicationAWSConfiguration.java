package com.thinkenterprise;

import org.springframework.cloud.aws.context.config.annotation.EnableContextCredentials;
import org.springframework.cloud.aws.context.config.annotation.EnableContextInstanceData;
import org.springframework.cloud.aws.context.config.annotation.EnableContextRegion;
import org.springframework.cloud.aws.jdbc.config.annotation.EnableRdsInstance;
import org.springframework.cloud.aws.jdbc.config.annotation.RdsInstanceConfigurer;
import org.springframework.cloud.aws.jdbc.datasource.DataSourceFactory;
import org.springframework.cloud.aws.jdbc.datasource.TomcatJdbcDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("aws")
@EnableContextCredentials(accessKey="",secretKey="",instanceProfile=true)
@EnableContextRegion(autoDetect=true)
@EnableContextInstanceData
@EnableRdsInstance(dbInstanceIdentifier = "fortuneDb",password = "fortuneDb", username="fortuneDb", databaseName="fortuneDb")
public class ApplicationAWSConfiguration {

  
}