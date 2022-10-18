package org.example.cloud.auth.credentials;

public class BaseCloudCredentials {
    private CloudAccount account;

    public BaseCloudCredentials(CloudAccount account) {
        this.account = account;
    }

    public CloudAccount getAccount() {
        return account;
    }

    public void setAccount(CloudAccount account) {
        this.account = account;
    }
}
