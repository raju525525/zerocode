package org.jsmart.zerocode.core.kafka.consume;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Objects;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsumeRequestConfig {
    // Change to "consumerLocalProperties"
    private final ConsumeTestProperties consumeTestProperties;

    @JsonCreator
    public ConsumeRequestConfig(@JsonProperty("consumeTestProperties") ConsumeTestProperties consumeTestProperties) {
        this.consumeTestProperties = consumeTestProperties;
    }

    public ConsumeTestProperties getConsumeTestProperties() {
        return consumeTestProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsumeRequestConfig that = (ConsumeRequestConfig) o;
        return Objects.equals(consumeTestProperties, that.consumeTestProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumeTestProperties);
    }

    @Override
    public String toString() {
        return "ConsumeRequestConfig{" +
                "consumeTestProperties=" + consumeTestProperties +
                '}';
    }
}