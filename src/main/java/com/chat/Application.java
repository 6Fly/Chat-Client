package com.chat;

import com.chat.config.ServiceDiscovery;

/**
 * @author L
 */
public class Application {
    public static void main(String[] args) {
        ServiceDiscovery serviceDiscovery = new ServiceDiscovery("127.0.0.1:2181");
        String discover = serviceDiscovery.discover();
        System.out.println(discover);
    }
}
