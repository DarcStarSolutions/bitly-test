package org.darcstarsolutions.bitly.test;

import com.rosaloves.bitlyj.Bitly;
import org.darcstarsolutions.bitly.test.configurations.BitlyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import static com.rosaloves.bitlyj.Bitly.shorten;

/**
 * Created by mharris on 6/6/15.
 */

@SpringBootApplication
@EnableConfigurationProperties
public class Application implements CommandLineRunner {

    @Autowired
    private BitlyConfiguration configuration;

    @Autowired
    private Bitly.Provider bitly;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String shortUrl = bitly.call(shorten(configuration.getUrl())).getShortUrl();
        System.out.println("Long url: " + configuration.getUrl());
        System.out.println("Shortened url: " + shortUrl);
    }
}
