package org.example.cloud.auth.credentials;

public class BaseCredential implements CloudCredential {
    private CloudKey cloudKey;
    public BaseCredential(CloudKey cloudKey) {
        this.cloudKey = cloudKey;
    }

    public CloudKey getCloudKey() {
        return cloudKey;
    }
}
