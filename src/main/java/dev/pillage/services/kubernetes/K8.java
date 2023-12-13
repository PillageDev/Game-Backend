package dev.pillage.services.kubernetes;

import dev.pillage.beans.Node;
import dev.pillage.beans.Server;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeSelector;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodSpec;
import io.kubernetes.client.util.Config;
import lombok.experimental.UtilityClass;

import java.io.IOException;

@UtilityClass
public class K8 {
    private static final ApiClient CLIENT;

    static {
        try {
            CLIENT = Config.defaultClient();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    private static final CoreV1Api API = new CoreV1Api(CLIENT);

    public static CoreV1Api api() {
        return API;
    }

    public static ApiClient client() {
        return CLIENT;
    }

    public static Node createNode() {
        V1Node node = new V1Node();

    }

    public static Server createServer() {
        V1Pod pod = new V1Pod();
        V1PodSpec spec = new V1PodSpec();
    }
}
