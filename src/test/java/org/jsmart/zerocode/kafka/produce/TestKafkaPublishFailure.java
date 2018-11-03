package org.jsmart.zerocode.kafka.produce;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("hosts_servers/kafka_test_bad_server.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class TestKafkaPublishFailure {

    @Ignore("Sometimes - 2018-10-06 23:33:15,673 [main] WARN org.apache.kafka.common.utils.AppInfoParser - Error registering AppInfo mbean\n" +
            "javax.management.InstanceAlreadyExistsException: kafka.producer:type=app-info,id=zerocode-producer\n")
    @Test
    @JsonTestCase("kafka/produce/test_kafka_publish_failed.json")
    public void testPublish() throws Exception {
    }

}