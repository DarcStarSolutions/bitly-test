package org.darcstarsolutions.bitly.test.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by mharris on 6/6/15.
 */

@ConfigurationProperties(prefix = "bitly")
public class BitlyConfiguration {

    private String login;
    private String apiKey;
    private String url;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
