package org.example.cloud.client.api;

import org.example.cloud.auth.credentials.*;

public class CloudClientFactory {
    public static CloudCredentialsBuilder<NCloudCredentials> ncloud() {
        return new NCloudCredentialsBuilder<NCloudCredentials>();
    }

//    public static CloudCredentialsBuilder<AWSCredentials> aws() {
//        return new AWSCredentialsBuilder<AWSCredentials>();
//    }


}
