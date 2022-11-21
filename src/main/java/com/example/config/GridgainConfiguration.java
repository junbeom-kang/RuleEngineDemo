/*
package com.example.config;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.DeploymentMode;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi;
import org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;


@Configuration
public class GridgainConfiguration {
  @Bean(name = "igniteInstance")
  public Ignite igniteInstance(Ignite ignite) {
    IgniteConfiguration cfg = new IgniteConfiguration();

    // The node will be started as a client node.
    cfg.setClientMode(true);

    // Classes of custom Java logic will be transferred over the wire from this app.
    cfg.setPeerClassLoadingEnabled(true);
    cfg.setDeploymentMode(DeploymentMode.CONTINUOUS);
    cfg.setClientMode(true);
    // Setting up an IP Finder to ensure the client can locate the servers.
    TcpDiscoveryMulticastIpFinder ipFinder = new TcpDiscoveryMulticastIpFinder();
    ipFinder.setAddresses(Collections.singletonList("127.0.0.1:47500..47509"));
    cfg.setDiscoverySpi(new TcpDiscoverySpi().setIpFinder(ipFinder));
    // Starting the node
    return Ignition.start(cfg);
  }

*/
/*  @Bean
  public IgniteConfigurer configurer() {
    return igniteConfiguration -> {
      igniteConfiguration.setClientMode(true);
    };
  }*//*


}
*/
