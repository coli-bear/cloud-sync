package org.example.cloud.client.api;

import org.example.cloud.common.dto.Response;

public interface CloudClient <T extends Response>{
    T get();
}
