package org.example.cloud.auth;

import org.example.cloud.auth.credentials.CloudCredential;
import org.example.cloud.auth.credentials.CloudKey;
import org.example.cloud.auth.credentials.NCloudCredential;
import org.example.cloud.auth.factory.CloudCredentialFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CloudCredentialFactoryTest {

    private String accessKey = "ABC";
    private String secureKey = "DEF";
    @Test
    void createNCloudCredential() {
        CloudCredentialFactory cloudCredentialFactory = new CloudCredentialFactory(new CloudKey(accessKey, secureKey));
        CloudCredential cloudCredential = cloudCredentialFactory.ncloudCredential();

        if (cloudCredential instanceof NCloudCredential) {
            NCloudCredential nc = (NCloudCredential) cloudCredential;
            CloudKey cloudKey = nc.getCloudKey();
            assertAll("cloud key",
                () -> assertEquals(cloudKey.getAccessKey(),  accessKey),
                () -> assertEquals(cloudKey.getSecureKey(),  secureKey)
            );
        } else {
        }
    }

    @Test
    void cloudCredentialKeyIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new CloudCredentialFactory(null), "cloud key must be not null");
    }
}