package org.example.cloud.auth;

import org.example.cloud.auth.credentials.CloudAccount;
import org.example.cloud.auth.factory.CloudCredentialFactory;
import org.example.cloud.client.api.CloudClient;
import org.example.cloud.client.api.CloudClientFactory;
import org.example.cloud.client.api.instance.dto.Instance;
import org.example.cloud.common.enums.ServiceType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CloudCredentialFactoryTest {

    private String accessKey = "ABC";
    private String secretKey = "DEF";
    @Test
    void createNCloudCredential() {
        CloudAccount account = new CloudAccount(this.accessKey, this.secretKey);

        CloudClient<Instance> instanceClient = CloudClientFactory
                .ncloud()
                .credentials(account)
                .makeSignature()
                .endpoint()
                .zone()
                .serviceType(ServiceType.VPC)
                .instance()
                .get();
    }

}