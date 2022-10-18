package org.example.cloud.auth.credentials;

public class AWSCredentialsBuilder<T> implements CloudCredentialsBuilder<AWSCredentials> {
    @Override
    public AWSCredentials getCredentials() {
        return null;
    }

    @Override
    public AWSCredentials credentials(CloudAccount account) {
        return null;
    }
}
