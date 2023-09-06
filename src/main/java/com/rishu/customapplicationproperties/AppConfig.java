package com.rishu.customapplicationproperties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app.config")
public record AppConfig(String header, String intro, List<UserAccount> users) {
}
