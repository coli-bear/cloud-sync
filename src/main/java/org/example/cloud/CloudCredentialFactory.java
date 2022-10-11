package org.example.cloud;

import org.example.cloud.CloudCredential;

public class CloudCredentialFactory<T> implements CloudCredential<T> {

    private CloudCredential<T> cloudCredential;

    public CloudCredentialFactory(CloudCredential<T> cloudCredential) {
        this.cloudCredential = cloudCredential;
    }

    @Override
    public T getCredential() {
        return cloudCredential.getCredential();
    }
}
