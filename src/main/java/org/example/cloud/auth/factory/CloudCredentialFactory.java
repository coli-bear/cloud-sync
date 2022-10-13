package org.example.cloud.auth.factory;

import org.example.cloud.auth.credentials.AwsCredential;
import org.example.cloud.auth.credentials.CloudKey;
import org.example.cloud.auth.credentials.NCloudCredential;

public class CloudCredentialFactory {

    private CloudKey cloudKey;

    public CloudCredentialFactory(CloudKey cloudKey) {
        if (cloudKey == null) {
            throw new IllegalArgumentException("cloud key must be not null");
        }
        this.cloudKey = cloudKey;
    }

    public NCloudCredential ncloudCredential() {
        return new NCloudCredential(cloudKey);
    }

    public AwsCredential awsCredential() {
        return new AwsCredential(cloudKey);
    }
}
