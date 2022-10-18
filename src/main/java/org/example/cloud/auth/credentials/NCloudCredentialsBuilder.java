package org.example.cloud.auth.credentials;

public class NCloudCredentialsBuilder<T> implements CloudCredentialsBuilder<NCloudCredentials> {

    @Override
    public NCloudCredentials credentials(CloudAccount account) {
        return new NCloudCredentials(account);
    }
}
