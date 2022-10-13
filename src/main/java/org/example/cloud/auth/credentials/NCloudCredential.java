package org.example.cloud.auth.credentials;

import java.net.http.HttpHeaders;
import java.util.Date;

public class NCloudCredential extends BaseCredential {

    private HttpHeaders httpHeaders;
    private String signature;
    private Date createDate;

    public NCloudCredential(CloudKey cloudKey) {
        super(cloudKey);
        this.createDate = new Date();
    }
}
