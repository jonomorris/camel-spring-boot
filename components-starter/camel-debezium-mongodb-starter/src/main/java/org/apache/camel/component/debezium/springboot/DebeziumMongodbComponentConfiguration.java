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
package org.apache.camel.component.debezium.springboot;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Capture changes from a MongoDB database.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.debezium-mongodb")
public class DebeziumMongodbComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the debezium-mongodb component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Additional properties for debezium components in case they can't be set
     * directly on the camel configurations (e.g: setting Kafka Connect
     * properties needed by Debezium engine, for example setting
     * KafkaOffsetBackingStore), the properties have to be prefixed with
     * additionalProperties.. E.g:
     * additionalProperties.transactional.id=12345&additionalProperties.schema.registry.url=http://localhost:8811/avro
     */
    private Map<String, Object> additionalProperties;
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
     * Allow pre-configured Configurations to be set. The option is a
     * org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration type.
     */
    private MongoDbConnectorEmbeddedDebeziumConfiguration configuration;
    /**
     * The Converter class that should be used to serialize and deserialize key
     * data for offsets. The default is JSON converter.
     */
    private String internalKeyConverter = "org.apache.kafka.connect.json.JsonConverter";
    /**
     * The Converter class that should be used to serialize and deserialize
     * value data for offsets. The default is JSON converter.
     */
    private String internalValueConverter = "org.apache.kafka.connect.json.JsonConverter";
    /**
     * The name of the Java class of the commit policy. It defines when offsets
     * commit has to be triggered based on the number of events processed and
     * the time elapsed since the last commit. This class must implement the
     * interface 'OffsetCommitPolicy'. The default is a periodic commit policy
     * based upon time intervals.
     */
    private String offsetCommitPolicy = "io.debezium.embedded.spi.OffsetCommitPolicy.PeriodicCommitOffsetPolicy";
    /**
     * Maximum number of milliseconds to wait for records to flush and partition
     * offset data to be committed to offset storage before cancelling the
     * process and restoring the offset data to be committed in a future
     * attempt. The default is 5 seconds. The option is a long type.
     */
    private Long offsetCommitTimeoutMs = 5000L;
    /**
     * Interval at which to try committing offsets. The default is 1 minute. The
     * option is a long type.
     */
    private Long offsetFlushIntervalMs = 60000L;
    /**
     * The name of the Java class that is responsible for persistence of
     * connector offsets.
     */
    private String offsetStorage = "org.apache.kafka.connect.storage.FileOffsetBackingStore";
    /**
     * Path to file where offsets are to be stored. Required when offset.storage
     * is set to the FileOffsetBackingStore.
     */
    private String offsetStorageFileName;
    /**
     * The number of partitions used when creating the offset storage topic.
     * Required when offset.storage is set to the 'KafkaOffsetBackingStore'.
     */
    private Integer offsetStoragePartitions;
    /**
     * Replication factor used when creating the offset storage topic. Required
     * when offset.storage is set to the KafkaOffsetBackingStore
     */
    private Integer offsetStorageReplicationFactor;
    /**
     * The name of the Kafka topic where offsets are to be stored. Required when
     * offset.storage is set to the KafkaOffsetBackingStore.
     */
    private String offsetStorageTopic;
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
     * The method used to capture changes from MongoDB server. Options include:
     * 'oplog' to capture changes from the oplog; 'change_streams' to capture
     * changes via MongoDB Change Streams, update events do not contain full
     * documents; 'change_streams_update_full' (the default) to capture changes
     * via MongoDB Change Streams, update events contain full documents
     */
    private String captureMode = "change_streams_update_full";
    /**
     * A comma-separated list of regular expressions that match the collection
     * names for which changes are to be excluded
     */
    private String collectionExcludeList;
    /**
     * A comma-separated list of regular expressions that match the collection
     * names for which changes are to be captured
     */
    private String collectionIncludeList;
    /**
     * The initial delay when trying to reconnect to a primary after a
     * connection cannot be made or when no primary is available, given in
     * milliseconds. Defaults to 1 second (1,000 ms). The option is a long type.
     */
    private Long connectBackoffInitialDelayMs = 1000L;
    /**
     * The maximum delay when trying to reconnect to a primary after a
     * connection cannot be made or when no primary is available, given in
     * milliseconds. Defaults to 120 second (120,000 ms). The option is a long
     * type.
     */
    private Long connectBackoffMaxDelayMs = 120000L;
    /**
     * Maximum number of failed connection attempts to a replica set primary
     * before an exception occurs and task is aborted. Defaults to 16, which
     * with the defaults for 'connect.backoff.initial.delay.ms' and
     * 'connect.backoff.max.delay.ms' results in just over 20 minutes of
     * attempts before failing.
     */
    private Integer connectMaxAttempts = 16;
    /**
     * Optional list of custom converters that would be used instead of default
     * ones. The converters are defined using '.type' config option and
     * configured using options '.'
     */
    private String converters;
    /**
     * The maximum processing time in milliseconds to wait for the oplog cursor
     * to process a single poll request. The option is a int type.
     */
    private Integer cursorMaxAwaitTimeMs;
    /**
     * A comma-separated list of regular expressions that match the database
     * names for which changes are to be excluded
     */
    private String databaseExcludeList;
    /**
     * The path to the file that will be used to record the database history
     */
    private String databaseHistoryFileFilename;
    /**
     * A comma-separated list of regular expressions that match the database
     * names for which changes are to be captured
     */
    private String databaseIncludeList;
    /**
     * Specify how failures during processing of events (i.e. when encountering
     * a corrupted event) should be handled, including:'fail' (the default) an
     * exception indicating the problematic event and its position is raised,
     * causing the connector to be stopped; 'warn' the problematic event and its
     * position will be logged and the event will be skipped;'ignore' the
     * problematic event will be skipped.
     */
    private String eventProcessingFailureHandlingMode = "fail";
    /**
     * A comma-separated list of the fully-qualified names of fields that should
     * be excluded from change event message values
     */
    private String fieldExcludeList;
    /**
     * A comma-separated list of the fully-qualified replacements of fields that
     * should be used to rename fields in change event message values.
     * Fully-qualified replacements for fields are of the form
     * databaseName.collectionName.fieldName.nestedFieldName:newNestedFieldName,
     * where databaseName and collectionName may contain the wildcard () which
     * matches any characters, the colon character (:) is used to determine
     * rename mapping of field.
     */
    private String fieldRenames;
    /**
     * Length of an interval in milli-seconds in in which the connector
     * periodically sends heartbeat messages to a heartbeat topic. Use 0 to
     * disable heartbeat messages. Disabled by default. The option is a int
     * type.
     */
    private Integer heartbeatIntervalMs = 0;
    /**
     * The prefix that is used to name heartbeat topics.Defaults to
     * __debezium-heartbeat.
     */
    private String heartbeatTopicsPrefix = "__debezium-heartbeat";
    /**
     * Maximum size of each batch of source records. Defaults to 2048.
     */
    private Integer maxBatchSize = 2048;
    /**
     * Maximum size of the queue for change events read from the database log
     * but not yet recorded or forwarded. Defaults to 8192, and should always be
     * larger than the maximum batch size.
     */
    private Integer maxQueueSize = 8192;
    /**
     * Maximum size of the queue in bytes for change events read from the
     * database log but not yet recorded or forwarded. Defaults to 0. Mean the
     * feature is not enabled
     */
    private Long maxQueueSizeInBytes = 0L;
    /**
     * Database containing user credentials.
     */
    private String mongodbAuthsource = "admin";
    /**
     * The connection timeout, given in milliseconds. Defaults to 10 seconds
     * (10,000 ms). The option is a int type.
     */
    private Integer mongodbConnectTimeoutMs = 10000;
    /**
     * The hostname and port pairs (in the form 'host' or 'host:port') of the
     * MongoDB server(s) in the replica set.
     */
    private String mongodbHosts;
    /**
     * Specifies whether the addresses in 'hosts' are seeds that should be used
     * to discover all members of the cluster or replica set ('true'), or
     * whether the address(es) in 'hosts' should be used as is ('false'). The
     * default is 'true'.
     */
    private Boolean mongodbMembersAutoDiscover = true;
    /**
     * Unique name that identifies the MongoDB replica set or cluster and all
     * recorded offsets, and that is used as a prefix for all schemas and
     * topics. Each distinct MongoDB installation should have a separate
     * namespace and monitored by at most one Debezium connector.
     */
    private String mongodbName;
    /**
     * Password to be used when connecting to MongoDB, if necessary.
     */
    private String mongodbPassword;
    /**
     * Interval for looking for new, removed, or changed replica sets, given in
     * milliseconds. Defaults to 30 seconds (30,000 ms). The option is a long
     * type.
     */
    private Long mongodbPollIntervalMs = 30000L;
    /**
     * The server selection timeout, given in milliseconds. Defaults to 10
     * seconds (10,000 ms). The option is a int type.
     */
    private Integer mongodbServerSelectionTimeoutMs = 30000;
    /**
     * The socket timeout, given in milliseconds. Defaults to 0 ms. The option
     * is a int type.
     */
    private Integer mongodbSocketTimeoutMs = 0;
    /**
     * Should connector use SSL to connect to MongoDB instances
     */
    private Boolean mongodbSslEnabled = false;
    /**
     * Whether invalid host names are allowed when using SSL. If true the
     * connection will not prevent man-in-the-middle attacks
     */
    private Boolean mongodbSslInvalidHostnameAllowed = false;
    /**
     * Database user for connecting to MongoDB, if necessary.
     */
    private String mongodbUser;
    /**
     * Time to wait for new change events to appear after receiving no events,
     * given in milliseconds. Defaults to 500 ms. The option is a long type.
     */
    private Long pollIntervalMs = 500L;
    /**
     * Enables transaction metadata extraction together with event counting
     */
    private Boolean provideTransactionMetadata = false;
    /**
     * The maximum number of records that should be loaded into memory while
     * streaming. A value of 0 uses the default JDBC fetch size.
     */
    private Integer queryFetchSize = 0;
    /**
     * Time to wait before restarting connector after retriable exception
     * occurs. Defaults to 10000ms. The option is a long type.
     */
    private Long retriableRestartConnectorWaitMs = 10000L;
    /**
     * Whether field names will be sanitized to Avro naming conventions
     */
    private Boolean sanitizeFieldNames = false;
    /**
     * Specify how schema names should be adjusted for compatibility with the
     * message converter used by the connector, including:'avro' replaces the
     * characters that cannot be used in the Avro type name with underscore
     * (default)'none' does not apply any adjustment
     */
    private String schemaNameAdjustmentMode = "avro";
    /**
     * The name of the data collection that is used to send signals/commands to
     * Debezium. Signaling is disabled when not set.
     */
    private String signalDataCollection;
    /**
     * The comma-separated list of operations to skip during streaming, defined
     * as: 'c' for inserts/create; 'u' for updates; 'd' for deletes, 't' for
     * truncates, and 'none' to indicate nothing skipped. By default, no
     * operations will be skipped.
     */
    private String skippedOperations;
    /**
     * This property contains a comma-separated list of ., for which the initial
     * snapshot may be a subset of data present in the data source. The subset
     * would be defined by mongodb filter query specified as value for property
     * snapshot.collection.filter.override..
     */
    private String snapshotCollectionFilterOverrides;
    /**
     * A delay period before a snapshot will begin, given in milliseconds.
     * Defaults to 0 ms. The option is a long type.
     */
    private Long snapshotDelayMs = 0L;
    /**
     * The maximum number of records that should be loaded into memory while
     * performing a snapshot
     */
    private Integer snapshotFetchSize;
    /**
     * this setting must be set to specify a list of tables/collections whose
     * snapshot must be taken on creating or restarting the connector.
     */
    private String snapshotIncludeCollectionList;
    /**
     * The maximum number of threads used to perform the snapshot. Defaults to
     * 1.
     */
    private Integer snapshotMaxThreads = 1;
    /**
     * The criteria for running a snapshot upon startup of the connector.
     * Options include: 'initial' (the default) to specify the connector should
     * always perform an initial sync when required; 'never' to specify the
     * connector should never perform an initial sync
     */
    private String snapshotMode = "initial";
    /**
     * A version of the format of the publicly visible source part in the
     * message
     */
    private String sourceStructVersion = "v2";
    /**
     * Whether delete operations should be represented by a delete event and a
     * subsquenttombstone event (true) or only by a delete event (false).
     * Emitting the tombstone event (the default behavior) allows Kafka to
     * completely delete all events pertaining to the given key once the source
     * record got deleted.
     */
    private Boolean tombstonesOnDelete = false;
    /**
     * The name of the transaction metadata topic. The placeholder
     * ${database.server.name} can be used for referring to the connector's
     * logical name; defaults to ${database.server.name}.transaction.
     */
    private String transactionTopic = "${database.server.name}.transaction";

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public MongoDbConnectorEmbeddedDebeziumConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            MongoDbConnectorEmbeddedDebeziumConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getInternalKeyConverter() {
        return internalKeyConverter;
    }

    public void setInternalKeyConverter(String internalKeyConverter) {
        this.internalKeyConverter = internalKeyConverter;
    }

    public String getInternalValueConverter() {
        return internalValueConverter;
    }

    public void setInternalValueConverter(String internalValueConverter) {
        this.internalValueConverter = internalValueConverter;
    }

    public String getOffsetCommitPolicy() {
        return offsetCommitPolicy;
    }

    public void setOffsetCommitPolicy(String offsetCommitPolicy) {
        this.offsetCommitPolicy = offsetCommitPolicy;
    }

    public Long getOffsetCommitTimeoutMs() {
        return offsetCommitTimeoutMs;
    }

    public void setOffsetCommitTimeoutMs(Long offsetCommitTimeoutMs) {
        this.offsetCommitTimeoutMs = offsetCommitTimeoutMs;
    }

    public Long getOffsetFlushIntervalMs() {
        return offsetFlushIntervalMs;
    }

    public void setOffsetFlushIntervalMs(Long offsetFlushIntervalMs) {
        this.offsetFlushIntervalMs = offsetFlushIntervalMs;
    }

    public String getOffsetStorage() {
        return offsetStorage;
    }

    public void setOffsetStorage(String offsetStorage) {
        this.offsetStorage = offsetStorage;
    }

    public String getOffsetStorageFileName() {
        return offsetStorageFileName;
    }

    public void setOffsetStorageFileName(String offsetStorageFileName) {
        this.offsetStorageFileName = offsetStorageFileName;
    }

    public Integer getOffsetStoragePartitions() {
        return offsetStoragePartitions;
    }

    public void setOffsetStoragePartitions(Integer offsetStoragePartitions) {
        this.offsetStoragePartitions = offsetStoragePartitions;
    }

    public Integer getOffsetStorageReplicationFactor() {
        return offsetStorageReplicationFactor;
    }

    public void setOffsetStorageReplicationFactor(
            Integer offsetStorageReplicationFactor) {
        this.offsetStorageReplicationFactor = offsetStorageReplicationFactor;
    }

    public String getOffsetStorageTopic() {
        return offsetStorageTopic;
    }

    public void setOffsetStorageTopic(String offsetStorageTopic) {
        this.offsetStorageTopic = offsetStorageTopic;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public String getCaptureMode() {
        return captureMode;
    }

    public void setCaptureMode(String captureMode) {
        this.captureMode = captureMode;
    }

    public String getCollectionExcludeList() {
        return collectionExcludeList;
    }

    public void setCollectionExcludeList(String collectionExcludeList) {
        this.collectionExcludeList = collectionExcludeList;
    }

    public String getCollectionIncludeList() {
        return collectionIncludeList;
    }

    public void setCollectionIncludeList(String collectionIncludeList) {
        this.collectionIncludeList = collectionIncludeList;
    }

    public Long getConnectBackoffInitialDelayMs() {
        return connectBackoffInitialDelayMs;
    }

    public void setConnectBackoffInitialDelayMs(
            Long connectBackoffInitialDelayMs) {
        this.connectBackoffInitialDelayMs = connectBackoffInitialDelayMs;
    }

    public Long getConnectBackoffMaxDelayMs() {
        return connectBackoffMaxDelayMs;
    }

    public void setConnectBackoffMaxDelayMs(Long connectBackoffMaxDelayMs) {
        this.connectBackoffMaxDelayMs = connectBackoffMaxDelayMs;
    }

    public Integer getConnectMaxAttempts() {
        return connectMaxAttempts;
    }

    public void setConnectMaxAttempts(Integer connectMaxAttempts) {
        this.connectMaxAttempts = connectMaxAttempts;
    }

    public String getConverters() {
        return converters;
    }

    public void setConverters(String converters) {
        this.converters = converters;
    }

    public Integer getCursorMaxAwaitTimeMs() {
        return cursorMaxAwaitTimeMs;
    }

    public void setCursorMaxAwaitTimeMs(Integer cursorMaxAwaitTimeMs) {
        this.cursorMaxAwaitTimeMs = cursorMaxAwaitTimeMs;
    }

    public String getDatabaseExcludeList() {
        return databaseExcludeList;
    }

    public void setDatabaseExcludeList(String databaseExcludeList) {
        this.databaseExcludeList = databaseExcludeList;
    }

    public String getDatabaseHistoryFileFilename() {
        return databaseHistoryFileFilename;
    }

    public void setDatabaseHistoryFileFilename(
            String databaseHistoryFileFilename) {
        this.databaseHistoryFileFilename = databaseHistoryFileFilename;
    }

    public String getDatabaseIncludeList() {
        return databaseIncludeList;
    }

    public void setDatabaseIncludeList(String databaseIncludeList) {
        this.databaseIncludeList = databaseIncludeList;
    }

    public String getEventProcessingFailureHandlingMode() {
        return eventProcessingFailureHandlingMode;
    }

    public void setEventProcessingFailureHandlingMode(
            String eventProcessingFailureHandlingMode) {
        this.eventProcessingFailureHandlingMode = eventProcessingFailureHandlingMode;
    }

    public String getFieldExcludeList() {
        return fieldExcludeList;
    }

    public void setFieldExcludeList(String fieldExcludeList) {
        this.fieldExcludeList = fieldExcludeList;
    }

    public String getFieldRenames() {
        return fieldRenames;
    }

    public void setFieldRenames(String fieldRenames) {
        this.fieldRenames = fieldRenames;
    }

    public Integer getHeartbeatIntervalMs() {
        return heartbeatIntervalMs;
    }

    public void setHeartbeatIntervalMs(Integer heartbeatIntervalMs) {
        this.heartbeatIntervalMs = heartbeatIntervalMs;
    }

    public String getHeartbeatTopicsPrefix() {
        return heartbeatTopicsPrefix;
    }

    public void setHeartbeatTopicsPrefix(String heartbeatTopicsPrefix) {
        this.heartbeatTopicsPrefix = heartbeatTopicsPrefix;
    }

    public Integer getMaxBatchSize() {
        return maxBatchSize;
    }

    public void setMaxBatchSize(Integer maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
    }

    public Integer getMaxQueueSize() {
        return maxQueueSize;
    }

    public void setMaxQueueSize(Integer maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
    }

    public Long getMaxQueueSizeInBytes() {
        return maxQueueSizeInBytes;
    }

    public void setMaxQueueSizeInBytes(Long maxQueueSizeInBytes) {
        this.maxQueueSizeInBytes = maxQueueSizeInBytes;
    }

    public String getMongodbAuthsource() {
        return mongodbAuthsource;
    }

    public void setMongodbAuthsource(String mongodbAuthsource) {
        this.mongodbAuthsource = mongodbAuthsource;
    }

    public Integer getMongodbConnectTimeoutMs() {
        return mongodbConnectTimeoutMs;
    }

    public void setMongodbConnectTimeoutMs(Integer mongodbConnectTimeoutMs) {
        this.mongodbConnectTimeoutMs = mongodbConnectTimeoutMs;
    }

    public String getMongodbHosts() {
        return mongodbHosts;
    }

    public void setMongodbHosts(String mongodbHosts) {
        this.mongodbHosts = mongodbHosts;
    }

    public Boolean getMongodbMembersAutoDiscover() {
        return mongodbMembersAutoDiscover;
    }

    public void setMongodbMembersAutoDiscover(Boolean mongodbMembersAutoDiscover) {
        this.mongodbMembersAutoDiscover = mongodbMembersAutoDiscover;
    }

    public String getMongodbName() {
        return mongodbName;
    }

    public void setMongodbName(String mongodbName) {
        this.mongodbName = mongodbName;
    }

    public String getMongodbPassword() {
        return mongodbPassword;
    }

    public void setMongodbPassword(String mongodbPassword) {
        this.mongodbPassword = mongodbPassword;
    }

    public Long getMongodbPollIntervalMs() {
        return mongodbPollIntervalMs;
    }

    public void setMongodbPollIntervalMs(Long mongodbPollIntervalMs) {
        this.mongodbPollIntervalMs = mongodbPollIntervalMs;
    }

    public Integer getMongodbServerSelectionTimeoutMs() {
        return mongodbServerSelectionTimeoutMs;
    }

    public void setMongodbServerSelectionTimeoutMs(
            Integer mongodbServerSelectionTimeoutMs) {
        this.mongodbServerSelectionTimeoutMs = mongodbServerSelectionTimeoutMs;
    }

    public Integer getMongodbSocketTimeoutMs() {
        return mongodbSocketTimeoutMs;
    }

    public void setMongodbSocketTimeoutMs(Integer mongodbSocketTimeoutMs) {
        this.mongodbSocketTimeoutMs = mongodbSocketTimeoutMs;
    }

    public Boolean getMongodbSslEnabled() {
        return mongodbSslEnabled;
    }

    public void setMongodbSslEnabled(Boolean mongodbSslEnabled) {
        this.mongodbSslEnabled = mongodbSslEnabled;
    }

    public Boolean getMongodbSslInvalidHostnameAllowed() {
        return mongodbSslInvalidHostnameAllowed;
    }

    public void setMongodbSslInvalidHostnameAllowed(
            Boolean mongodbSslInvalidHostnameAllowed) {
        this.mongodbSslInvalidHostnameAllowed = mongodbSslInvalidHostnameAllowed;
    }

    public String getMongodbUser() {
        return mongodbUser;
    }

    public void setMongodbUser(String mongodbUser) {
        this.mongodbUser = mongodbUser;
    }

    public Long getPollIntervalMs() {
        return pollIntervalMs;
    }

    public void setPollIntervalMs(Long pollIntervalMs) {
        this.pollIntervalMs = pollIntervalMs;
    }

    public Boolean getProvideTransactionMetadata() {
        return provideTransactionMetadata;
    }

    public void setProvideTransactionMetadata(Boolean provideTransactionMetadata) {
        this.provideTransactionMetadata = provideTransactionMetadata;
    }

    public Integer getQueryFetchSize() {
        return queryFetchSize;
    }

    public void setQueryFetchSize(Integer queryFetchSize) {
        this.queryFetchSize = queryFetchSize;
    }

    public Long getRetriableRestartConnectorWaitMs() {
        return retriableRestartConnectorWaitMs;
    }

    public void setRetriableRestartConnectorWaitMs(
            Long retriableRestartConnectorWaitMs) {
        this.retriableRestartConnectorWaitMs = retriableRestartConnectorWaitMs;
    }

    public Boolean getSanitizeFieldNames() {
        return sanitizeFieldNames;
    }

    public void setSanitizeFieldNames(Boolean sanitizeFieldNames) {
        this.sanitizeFieldNames = sanitizeFieldNames;
    }

    public String getSchemaNameAdjustmentMode() {
        return schemaNameAdjustmentMode;
    }

    public void setSchemaNameAdjustmentMode(String schemaNameAdjustmentMode) {
        this.schemaNameAdjustmentMode = schemaNameAdjustmentMode;
    }

    public String getSignalDataCollection() {
        return signalDataCollection;
    }

    public void setSignalDataCollection(String signalDataCollection) {
        this.signalDataCollection = signalDataCollection;
    }

    public String getSkippedOperations() {
        return skippedOperations;
    }

    public void setSkippedOperations(String skippedOperations) {
        this.skippedOperations = skippedOperations;
    }

    public String getSnapshotCollectionFilterOverrides() {
        return snapshotCollectionFilterOverrides;
    }

    public void setSnapshotCollectionFilterOverrides(
            String snapshotCollectionFilterOverrides) {
        this.snapshotCollectionFilterOverrides = snapshotCollectionFilterOverrides;
    }

    public Long getSnapshotDelayMs() {
        return snapshotDelayMs;
    }

    public void setSnapshotDelayMs(Long snapshotDelayMs) {
        this.snapshotDelayMs = snapshotDelayMs;
    }

    public Integer getSnapshotFetchSize() {
        return snapshotFetchSize;
    }

    public void setSnapshotFetchSize(Integer snapshotFetchSize) {
        this.snapshotFetchSize = snapshotFetchSize;
    }

    public String getSnapshotIncludeCollectionList() {
        return snapshotIncludeCollectionList;
    }

    public void setSnapshotIncludeCollectionList(
            String snapshotIncludeCollectionList) {
        this.snapshotIncludeCollectionList = snapshotIncludeCollectionList;
    }

    public Integer getSnapshotMaxThreads() {
        return snapshotMaxThreads;
    }

    public void setSnapshotMaxThreads(Integer snapshotMaxThreads) {
        this.snapshotMaxThreads = snapshotMaxThreads;
    }

    public String getSnapshotMode() {
        return snapshotMode;
    }

    public void setSnapshotMode(String snapshotMode) {
        this.snapshotMode = snapshotMode;
    }

    public String getSourceStructVersion() {
        return sourceStructVersion;
    }

    public void setSourceStructVersion(String sourceStructVersion) {
        this.sourceStructVersion = sourceStructVersion;
    }

    public Boolean getTombstonesOnDelete() {
        return tombstonesOnDelete;
    }

    public void setTombstonesOnDelete(Boolean tombstonesOnDelete) {
        this.tombstonesOnDelete = tombstonesOnDelete;
    }

    public String getTransactionTopic() {
        return transactionTopic;
    }

    public void setTransactionTopic(String transactionTopic) {
        this.transactionTopic = transactionTopic;
    }
}