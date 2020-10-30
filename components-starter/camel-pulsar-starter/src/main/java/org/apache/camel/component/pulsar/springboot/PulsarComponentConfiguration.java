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
package org.apache.camel.component.pulsar.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.pulsar.PulsarComponent;
import org.apache.camel.component.pulsar.PulsarConfiguration;
import org.apache.camel.component.pulsar.PulsarMessageReceiptFactory;
import org.apache.camel.component.pulsar.utils.AutoConfiguration;
import org.apache.camel.component.pulsar.utils.consumers.SubscriptionInitialPosition;
import org.apache.camel.component.pulsar.utils.consumers.SubscriptionType;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.pulsar.client.api.BatcherBuilder;
import org.apache.pulsar.client.api.CompressionType;
import org.apache.pulsar.client.api.MessageRouter;
import org.apache.pulsar.client.api.MessageRoutingMode;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.RegexSubscriptionMode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * Send and receive messages from/to Apache Pulsar messaging system.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.pulsar")
public class PulsarComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the pulsar component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Allows to pre-configure the Pulsar component with common options that the
     * endpoints will reuse. The option is a
     * org.apache.camel.component.pulsar.PulsarConfiguration type.
     */
    private PulsarConfiguration configuration;
    /**
     * Group the consumer acknowledgments for the specified time in milliseconds
     * - defaults to 100
     */
    private Long ackGroupTimeMillis = 100L;
    /**
     * Timeout for unacknowledged messages in milliseconds - defaults to 10000
     */
    private Long ackTimeoutMillis = 10000L;
    /**
     * Whether to allow manual message acknowledgements. If this option is
     * enabled, then messages are not acknowledged automatically after
     * successful route completion. Instead, an instance of PulsarMessageReceipt
     * is stored as a header on the org.apache.camel.Exchange. Messages can then
     * be acknowledged using PulsarMessageReceipt at any time before the
     * ackTimeout occurs.
     */
    private Boolean allowManualAcknowledgement = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Name of the consumer when subscription is EXCLUSIVE
     */
    private String consumerName = "sole-consumer";
    /**
     * Prefix to add to consumer names when a SHARED or FAILOVER subscription is
     * used
     */
    private String consumerNamePrefix = "cons";
    /**
     * Size of the consumer queue - defaults to 10
     */
    private Integer consumerQueueSize = 10;
    /**
     * Name of the topic where the messages which fail maxRedeliverCount times
     * will be sent. Note: if not set, default topic name will be
     * topicName-subscriptionName-DLQ
     */
    private String deadLetterTopic;
    /**
     * Maximum number of times that a message will be redelivered before being
     * sent to the dead letter queue. If this value is not set, no Dead Letter
     * Policy will be created
     */
    private Integer maxRedeliverCount;
    /**
     * Set the negative acknowledgement delay
     */
    private Long negativeAckRedeliveryDelayMicros = 60000000L;
    /**
     * Number of consumers - defaults to 1
     */
    private Integer numberOfConsumers = 1;
    /**
     * Enable compacted topic reading.
     */
    private Boolean readCompacted = false;
    /**
     * Control the initial position in the topic of a newly created
     * subscription. Default is latest message.
     */
    private SubscriptionInitialPosition subscriptionInitialPosition = SubscriptionInitialPosition.LATEST;
    /**
     * Name of the subscription to use
     */
    private String subscriptionName = "subs";
    /**
     * Determines to which topics this consumer should be subscribed to -
     * Persistent, Non-Persistent, or both. Only used with pattern
     * subscriptions.
     */
    private RegexSubscriptionMode subscriptionTopicsMode = RegexSubscriptionMode.PersistentOnly;
    /**
     * Type of the subscription EXCLUSIVESHAREDFAILOVERKEY_SHARED, defaults to
     * EXCLUSIVE
     */
    private SubscriptionType subscriptionType = SubscriptionType.EXCLUSIVE;
    /**
     * Whether the topic is a pattern (regular expression) that allows the
     * consumer to subscribe to all matching topics in the namespace
     */
    private Boolean topicsPattern = false;
    /**
     * Provide a factory to create an alternate implementation of
     * PulsarMessageReceipt. The option is a
     * org.apache.camel.component.pulsar.PulsarMessageReceiptFactory type.
     */
    private PulsarMessageReceiptFactory pulsarMessageReceiptFactory;
    /**
     * Control batching method used by the producer. The option is a
     * org.apache.pulsar.client.api.BatcherBuilder type.
     */
    private BatcherBuilder batcherBuilder;
    /**
     * Control whether automatic batching of messages is enabled for the
     * producer.
     */
    private Boolean batchingEnabled = true;
    /**
     * The maximum size to batch messages.
     */
    private Integer batchingMaxMessages = 1000;
    /**
     * The maximum time period within which the messages sent will be batched if
     * batchingEnabled is true.
     */
    private Long batchingMaxPublishDelayMicros = 1000L;
    /**
     * Whether to block the producing thread if pending messages queue is full
     * or to throw a ProducerQueueIsFullError
     */
    private Boolean blockIfQueueFull = false;
    /**
     * Compression type to use
     */
    private CompressionType compressionType = CompressionType.NONE;
    /**
     * The first message published will have a sequence Id of initialSequenceId
     * 1.
     */
    private Long initialSequenceId = -1L;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Size of the pending massages queue. When the queue is full, by default,
     * any further sends will fail unless blockIfQueueFull=true
     */
    private Integer maxPendingMessages = 1000;
    /**
     * The maximum number of pending messages for partitioned topics. The
     * maxPendingMessages value will be reduced if (number of partitions
     * maxPendingMessages) exceeds this value. Partitioned topics have a pending
     * message queue for each partition.
     */
    private Integer maxPendingMessagesAcrossPartitions = 50000;
    /**
     * Custom Message Router to use. The option is a
     * org.apache.pulsar.client.api.MessageRouter type.
     */
    private MessageRouter messageRouter;
    /**
     * Message Routing Mode to use
     */
    private MessageRoutingMode messageRoutingMode = MessageRoutingMode.RoundRobinPartition;
    /**
     * Name of the producer. If unset, lets Pulsar select a unique identifier.
     */
    private String producerName;
    /**
     * Send timeout in milliseconds
     */
    private Integer sendTimeoutMs = 30000;
    /**
     * The pulsar auto configuration. The option is a
     * org.apache.camel.component.pulsar.utils.AutoConfiguration type.
     */
    private AutoConfiguration autoConfiguration;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    @Deprecated
    private Boolean basicPropertyBinding = false;
    /**
     * The pulsar client. The option is a
     * org.apache.pulsar.client.api.PulsarClient type.
     */
    private PulsarClient pulsarClient;

    public PulsarConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(PulsarConfiguration configuration) {
        this.configuration = configuration;
    }

    public Long getAckGroupTimeMillis() {
        return ackGroupTimeMillis;
    }

    public void setAckGroupTimeMillis(Long ackGroupTimeMillis) {
        this.ackGroupTimeMillis = ackGroupTimeMillis;
    }

    public Long getAckTimeoutMillis() {
        return ackTimeoutMillis;
    }

    public void setAckTimeoutMillis(Long ackTimeoutMillis) {
        this.ackTimeoutMillis = ackTimeoutMillis;
    }

    public Boolean getAllowManualAcknowledgement() {
        return allowManualAcknowledgement;
    }

    public void setAllowManualAcknowledgement(Boolean allowManualAcknowledgement) {
        this.allowManualAcknowledgement = allowManualAcknowledgement;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumerNamePrefix() {
        return consumerNamePrefix;
    }

    public void setConsumerNamePrefix(String consumerNamePrefix) {
        this.consumerNamePrefix = consumerNamePrefix;
    }

    public Integer getConsumerQueueSize() {
        return consumerQueueSize;
    }

    public void setConsumerQueueSize(Integer consumerQueueSize) {
        this.consumerQueueSize = consumerQueueSize;
    }

    public String getDeadLetterTopic() {
        return deadLetterTopic;
    }

    public void setDeadLetterTopic(String deadLetterTopic) {
        this.deadLetterTopic = deadLetterTopic;
    }

    public Integer getMaxRedeliverCount() {
        return maxRedeliverCount;
    }

    public void setMaxRedeliverCount(Integer maxRedeliverCount) {
        this.maxRedeliverCount = maxRedeliverCount;
    }

    public Long getNegativeAckRedeliveryDelayMicros() {
        return negativeAckRedeliveryDelayMicros;
    }

    public void setNegativeAckRedeliveryDelayMicros(
            Long negativeAckRedeliveryDelayMicros) {
        this.negativeAckRedeliveryDelayMicros = negativeAckRedeliveryDelayMicros;
    }

    public Integer getNumberOfConsumers() {
        return numberOfConsumers;
    }

    public void setNumberOfConsumers(Integer numberOfConsumers) {
        this.numberOfConsumers = numberOfConsumers;
    }

    public Boolean getReadCompacted() {
        return readCompacted;
    }

    public void setReadCompacted(Boolean readCompacted) {
        this.readCompacted = readCompacted;
    }

    public SubscriptionInitialPosition getSubscriptionInitialPosition() {
        return subscriptionInitialPosition;
    }

    public void setSubscriptionInitialPosition(
            SubscriptionInitialPosition subscriptionInitialPosition) {
        this.subscriptionInitialPosition = subscriptionInitialPosition;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public RegexSubscriptionMode getSubscriptionTopicsMode() {
        return subscriptionTopicsMode;
    }

    public void setSubscriptionTopicsMode(
            RegexSubscriptionMode subscriptionTopicsMode) {
        this.subscriptionTopicsMode = subscriptionTopicsMode;
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public Boolean getTopicsPattern() {
        return topicsPattern;
    }

    public void setTopicsPattern(Boolean topicsPattern) {
        this.topicsPattern = topicsPattern;
    }

    public PulsarMessageReceiptFactory getPulsarMessageReceiptFactory() {
        return pulsarMessageReceiptFactory;
    }

    public void setPulsarMessageReceiptFactory(
            PulsarMessageReceiptFactory pulsarMessageReceiptFactory) {
        this.pulsarMessageReceiptFactory = pulsarMessageReceiptFactory;
    }

    public BatcherBuilder getBatcherBuilder() {
        return batcherBuilder;
    }

    public void setBatcherBuilder(BatcherBuilder batcherBuilder) {
        this.batcherBuilder = batcherBuilder;
    }

    public Boolean getBatchingEnabled() {
        return batchingEnabled;
    }

    public void setBatchingEnabled(Boolean batchingEnabled) {
        this.batchingEnabled = batchingEnabled;
    }

    public Integer getBatchingMaxMessages() {
        return batchingMaxMessages;
    }

    public void setBatchingMaxMessages(Integer batchingMaxMessages) {
        this.batchingMaxMessages = batchingMaxMessages;
    }

    public Long getBatchingMaxPublishDelayMicros() {
        return batchingMaxPublishDelayMicros;
    }

    public void setBatchingMaxPublishDelayMicros(
            Long batchingMaxPublishDelayMicros) {
        this.batchingMaxPublishDelayMicros = batchingMaxPublishDelayMicros;
    }

    public Boolean getBlockIfQueueFull() {
        return blockIfQueueFull;
    }

    public void setBlockIfQueueFull(Boolean blockIfQueueFull) {
        this.blockIfQueueFull = blockIfQueueFull;
    }

    public CompressionType getCompressionType() {
        return compressionType;
    }

    public void setCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType;
    }

    public Long getInitialSequenceId() {
        return initialSequenceId;
    }

    public void setInitialSequenceId(Long initialSequenceId) {
        this.initialSequenceId = initialSequenceId;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Integer getMaxPendingMessages() {
        return maxPendingMessages;
    }

    public void setMaxPendingMessages(Integer maxPendingMessages) {
        this.maxPendingMessages = maxPendingMessages;
    }

    public Integer getMaxPendingMessagesAcrossPartitions() {
        return maxPendingMessagesAcrossPartitions;
    }

    public void setMaxPendingMessagesAcrossPartitions(
            Integer maxPendingMessagesAcrossPartitions) {
        this.maxPendingMessagesAcrossPartitions = maxPendingMessagesAcrossPartitions;
    }

    public MessageRouter getMessageRouter() {
        return messageRouter;
    }

    public void setMessageRouter(MessageRouter messageRouter) {
        this.messageRouter = messageRouter;
    }

    public MessageRoutingMode getMessageRoutingMode() {
        return messageRoutingMode;
    }

    public void setMessageRoutingMode(MessageRoutingMode messageRoutingMode) {
        this.messageRoutingMode = messageRoutingMode;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public Integer getSendTimeoutMs() {
        return sendTimeoutMs;
    }

    public void setSendTimeoutMs(Integer sendTimeoutMs) {
        this.sendTimeoutMs = sendTimeoutMs;
    }

    public AutoConfiguration getAutoConfiguration() {
        return autoConfiguration;
    }

    public void setAutoConfiguration(AutoConfiguration autoConfiguration) {
        this.autoConfiguration = autoConfiguration;
    }

    @Deprecated
    @DeprecatedConfigurationProperty
    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    @Deprecated
    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public PulsarClient getPulsarClient() {
        return pulsarClient;
    }

    public void setPulsarClient(PulsarClient pulsarClient) {
        this.pulsarClient = pulsarClient;
    }
}