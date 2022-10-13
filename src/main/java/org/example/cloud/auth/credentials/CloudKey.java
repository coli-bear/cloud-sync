package org.example.cloud.auth.credentials;

import java.util.Objects;

public class CloudKey {
    private String accessKey;
    private String secureKey;

    public CloudKey(String accessKey, String secureKey) {
        this.accessKey = accessKey;
        this.secureKey = secureKey;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public String getSecureKey() {
        return secureKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloudKey cloudKey = (CloudKey) o;
        return Objects.equals(accessKey, cloudKey.accessKey) && Objects.equals(secureKey, cloudKey.secureKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey, secureKey);
    }

    @Override
    public String toString() {
        return "CloudKey{" +
            "accessKey='" + accessKey + '\'' +
            ", secureKey='" + secureKey + '\'' +
            '}';
    }
}
