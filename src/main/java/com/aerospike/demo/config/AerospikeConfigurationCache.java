package com.aerospike.demo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.aerospike.convert.AerospikeCustomConversions;
import org.springframework.data.aerospike.convert.AerospikeTypeAliasAccessor;
import org.springframework.data.aerospike.convert.MappingAerospikeConverter;
import org.springframework.data.aerospike.mapping.AerospikeMappingContext;
import org.springframework.data.mapping.model.SimpleTypeHolder;

@Configuration
@EnableConfigurationProperties(AerospikeConfigurationPropertiesCache.class)
@Import(value = {MappingAerospikeConverter.class, AerospikeMappingContext.class, AerospikeTypeAliasAccessor.class
        , AerospikeCustomConversions.class, SimpleTypeHolder.class})
public class AerospikeConfigurationCache {
}
