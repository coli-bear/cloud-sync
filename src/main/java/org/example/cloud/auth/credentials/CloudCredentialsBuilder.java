package org.example.cloud.auth.credentials;

public interface CloudCredentialsBuilder <T extends CloudCredentials> {
    T credentials(CloudAccount account);
}
