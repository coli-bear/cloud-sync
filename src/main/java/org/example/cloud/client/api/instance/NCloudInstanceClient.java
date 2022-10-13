package org.example.cloud.client.api.instance;

import org.example.cloud.auth.credentials.NCloudCredential;
import org.example.cloud.client.api.instance.dto.Instance;

public class NCloudInstanceClient implements InstanceClient {

    private NCloudCredential credential;

    public NCloudInstanceClient(NCloudCredential credential) {
        this.credential = credential;
    }

    @Override
    public Instance get() {
        return null;
    }

    @Override
    public Instance getInstance() {
        return null;
    }
}
