package org.example.cloud.auth.credentials;

import java.util.Objects;

public class CloudAccount {
    private String accessKey;
    private String secretKey;

    public CloudAccount(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloudAccount that = (CloudAccount) o;
        return accessKey.equals(that.accessKey) && secretKey.equals(that.secretKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey, secretKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloudAccount {");

        if (this.accessKey != null) {
            sb.append("access key:").append(this.accessKey);
        }

        if (this.secretKey != null) {
            sb.append("secret key:").append(this.secretKey);
        }

        return sb.append("}").toString();
    }
}
