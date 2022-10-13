package org.example.cloud.client.api.instance;

import org.example.cloud.client.api.CloudClient;
import org.example.cloud.client.api.instance.dto.Instance;

public interface InstanceClient extends CloudClient<Instance> {
    Instance getInstance();
}
