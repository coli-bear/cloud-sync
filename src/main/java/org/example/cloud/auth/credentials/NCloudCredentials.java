package org.example.cloud.auth.credentials;

public class NCloudCredentials extends BaseCloudCredentials
        implements CloudCredentials {

    public NCloudCredentials(CloudAccount account) {
        super(account);
    }

    @Override
    public Object makeSignature() {
        return null;
    }
}
