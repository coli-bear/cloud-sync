package org.example.cloud.client.api.instance;

import org.example.cloud.auth.credentials.AwsCredential;
import org.example.cloud.client.api.instance.dto.Instance;

public class AwsInstanceClient implements InstanceClient{
    private AwsCredential awsCredential;

    @Override
    public Instance get() {
        return null;
    }

    @Override
    public Instance getInstance() {
        return null;
    }
}
