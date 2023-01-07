package com.aerospike.demo.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
//@ConfigurationProperties(prefix = "aerospike")
public class AerospikeConfigurationPropertiesCache {
    private String host;
    private int port;
}
