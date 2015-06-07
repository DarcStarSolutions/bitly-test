package org.darcstarsolutions.bitly.test.configurations;

import com.rosaloves.bitlyj.Bitly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mharris on 6/6/15.
 */

@Configuration
@EnableConfigurationProperties(BitlyConfiguration.class)
public class ApplicationConfiguration {

    @Autowired
    private BitlyConfiguration configuration;

    @Bean
    public Bitly.Provider bitly() {
        Bitly.Provider bitly = Bitly.as(configuration.getLogin(), configuration.getApiKey());
        return bitly;
    }
}
