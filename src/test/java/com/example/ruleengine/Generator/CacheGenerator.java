/*
package com.example.ruleengine.Generator;

import com.example.ruleengine.customer.CustomerProfile;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.DeploymentMode;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi;
import org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder;

import java.util.Collections;

public class CacheGenerator {
  private static final String Customer_Profile = "CustomerProfile";

  public static void main(String[] args) throws Exception {
    try (Ignite ignite = CreateClientNode()) {
      CacheConfiguration<Long, CustomerProfile> CustomerProfile = new CacheConfiguration<>(Customer_Profile);

      CustomerProfile.setCacheMode(CacheMode.PARTITIONED); // Default.
      CustomerProfile.setBackups(1);
      CustomerProfile.setIndexedTypes(Long.class, CustomerProfile.class);

      try {
        ignite.getOrCreateCache(Customer_Profile);

      }
      finally {
                ignite.destroyCache(Customer_Profile);

      }
    }
  }




  public static Ignite CreateClientNode(){
    IgniteConfiguration cfg = new IgniteConfiguration();

    // The node will be started as a client node.
    cfg.setClientMode(true);

    // Classes of custom Java logic will be transferred over the wire from this app.
    cfg.setPeerClassLoadingEnabled(true);
    cfg.setDeploymentMode(DeploymentMode.CONTINUOUS);
    // Setting up an IP Finder to ensure the client can locate the servers.
    TcpDiscoveryMulticastIpFinder ipFinder = new TcpDiscoveryMulticastIpFinder();
    ipFinder.setAddresses(Collections.singletonList("127.0.0.1:47500..47509"));
    cfg.setDiscoverySpi(new TcpDiscoverySpi().setIpFinder(ipFinder));

    // Starting the node
    return Ignition.start(cfg);
  }

}
*/
