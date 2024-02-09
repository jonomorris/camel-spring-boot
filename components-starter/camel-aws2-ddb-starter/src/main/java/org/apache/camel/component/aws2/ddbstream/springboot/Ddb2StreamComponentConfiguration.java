/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.aws2.ddbstream.springboot;

import org.apache.camel.component.aws2.ddbstream.Ddb2StreamComponent;
import org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration;
import org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration.StreamIteratorType;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import software.amazon.awssdk.core.Protocol;
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient;

/**
 * Receive messages from AWS DynamoDB Stream.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.aws2-ddbstream")
public class Ddb2StreamComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws2-ddbstream component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions (if possible) occurred while the Camel consumer
     * is trying to pickup incoming messages, or the likes, will now be
     * processed as a message and handled by the routing Error Handler.
     * Important: This is only possible if the 3rd party component allows Camel
     * to be alerted if an exception was thrown. Some components handle this
     * internally only, and therefore bridgeErrorHandler is not possible. In
     * other situations we may improve the Camel component to hook into the 3rd
     * party component and make this possible for future releases. By default
     * the consumer will use the org.apache.camel.spi.ExceptionHandler to deal
     * with exceptions, that will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * The component configuration. The option is a
     * org.apache.camel.component.aws2.ddbstream.Ddb2StreamConfiguration type.
     */
    private Ddb2StreamConfiguration configuration;
    /**
     * Maximum number of records that will be fetched in each poll
     */
    private Integer maxResultsPerRequest;
    /**
     * Set the need for overidding the endpoint. This option needs to be used in
     * combination with uriEndpointOverride option
     */
    private Boolean overrideEndpoint = false;
    /**
     * The region in which DDBStreams client needs to work
     */
    private String region;
    /**
     * Defines where in the DynamoDB stream to start getting records. Note that
     * using FROM_START can cause a significant delay before the stream has
     * caught up to real-time.
     */
    private StreamIteratorType streamIteratorType = StreamIteratorType.FROM_LATEST;
    /**
     * Set the overriding uri endpoint. This option needs to be used in
     * combination with overrideEndpoint option
     */
    private String uriEndpointOverride;
    /**
     * Amazon DynamoDB client to use for all requests for this endpoint. The
     * option is a
     * software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient
     * type.
     */
    private DynamoDbStreamsClient amazonDynamoDbStreamsClient;
    /**
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;
    /**
     * Used for enabling or disabling all consumer based health checks from this
     * component
     */
    private Boolean healthCheckConsumerEnabled = true;
    /**
     * Used for enabling or disabling all producer based health checks from this
     * component. Notice: Camel has by default disabled all producer based
     * health-checks. You can turn on producer checks globally by setting
     * camel.health.producersEnabled=true.
     */
    private Boolean healthCheckProducerEnabled = true;
    /**
     * To define a proxy host when instantiating the DDBStreams client
     */
    private String proxyHost;
    /**
     * To define a proxy port when instantiating the DDBStreams client
     */
    private Integer proxyPort;
    /**
     * To define a proxy protocol when instantiating the DDBStreams client
     */
    private Protocol proxyProtocol = Protocol.HTTPS;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * If using a profile credentials provider this parameter will set the
     * profile name.
     */
    private String profileCredentialsName;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * Amazon AWS Session Token used when the user needs to assume a IAM role
     */
    private String sessionToken;
    /**
     * If we want to trust all certificates in case of overriding the endpoint
     */
    private Boolean trustAllCertificates = false;
    /**
     * Set whether the DynamoDB Streams client should expect to load credentials
     * through a default credentials provider or to expect static credentials to
     * be passed in.
     */
    private Boolean useDefaultCredentialsProvider = false;
    /**
     * Set whether the Cloudtrail client should expect to load credentials
     * through a profile credentials provider.
     */
    private Boolean useProfileCredentialsProvider = false;
    /**
     * Set whether the DDB Streams client should expect to use Session
     * Credentials. This is useful in situation in which the user needs to
     * assume a IAM role for doing operations in DDB.
     */
    private Boolean useSessionCredentials = false;

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Ddb2StreamConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Ddb2StreamConfiguration configuration) {
        this.configuration = configuration;
    }

    public Integer getMaxResultsPerRequest() {
        return maxResultsPerRequest;
    }

    public void setMaxResultsPerRequest(Integer maxResultsPerRequest) {
        this.maxResultsPerRequest = maxResultsPerRequest;
    }

    public Boolean getOverrideEndpoint() {
        return overrideEndpoint;
    }

    public void setOverrideEndpoint(Boolean overrideEndpoint) {
        this.overrideEndpoint = overrideEndpoint;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public StreamIteratorType getStreamIteratorType() {
        return streamIteratorType;
    }

    public void setStreamIteratorType(StreamIteratorType streamIteratorType) {
        this.streamIteratorType = streamIteratorType;
    }

    public String getUriEndpointOverride() {
        return uriEndpointOverride;
    }

    public void setUriEndpointOverride(String uriEndpointOverride) {
        this.uriEndpointOverride = uriEndpointOverride;
    }

    public DynamoDbStreamsClient getAmazonDynamoDbStreamsClient() {
        return amazonDynamoDbStreamsClient;
    }

    public void setAmazonDynamoDbStreamsClient(
            DynamoDbStreamsClient amazonDynamoDbStreamsClient) {
        this.amazonDynamoDbStreamsClient = amazonDynamoDbStreamsClient;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public Boolean getHealthCheckConsumerEnabled() {
        return healthCheckConsumerEnabled;
    }

    public void setHealthCheckConsumerEnabled(Boolean healthCheckConsumerEnabled) {
        this.healthCheckConsumerEnabled = healthCheckConsumerEnabled;
    }

    public Boolean getHealthCheckProducerEnabled() {
        return healthCheckProducerEnabled;
    }

    public void setHealthCheckProducerEnabled(Boolean healthCheckProducerEnabled) {
        this.healthCheckProducerEnabled = healthCheckProducerEnabled;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Protocol getProxyProtocol() {
        return proxyProtocol;
    }

    public void setProxyProtocol(Protocol proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getProfileCredentialsName() {
        return profileCredentialsName;
    }

    public void setProfileCredentialsName(String profileCredentialsName) {
        this.profileCredentialsName = profileCredentialsName;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public Boolean getTrustAllCertificates() {
        return trustAllCertificates;
    }

    public void setTrustAllCertificates(Boolean trustAllCertificates) {
        this.trustAllCertificates = trustAllCertificates;
    }

    public Boolean getUseDefaultCredentialsProvider() {
        return useDefaultCredentialsProvider;
    }

    public void setUseDefaultCredentialsProvider(
            Boolean useDefaultCredentialsProvider) {
        this.useDefaultCredentialsProvider = useDefaultCredentialsProvider;
    }

    public Boolean getUseProfileCredentialsProvider() {
        return useProfileCredentialsProvider;
    }

    public void setUseProfileCredentialsProvider(
            Boolean useProfileCredentialsProvider) {
        this.useProfileCredentialsProvider = useProfileCredentialsProvider;
    }

    public Boolean getUseSessionCredentials() {
        return useSessionCredentials;
    }

    public void setUseSessionCredentials(Boolean useSessionCredentials) {
        this.useSessionCredentials = useSessionCredentials;
    }
}