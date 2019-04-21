/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.price;

import java.util.Calendar;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Publish Billing Period Command value object class.
 * <p>
 * Cluster: <b>Price</b>. Command ID 0x09 is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Price cluster.
 * <p>
 * The PublishBillingPeriod command is generated in response to receiving a
 * GetBillingPeriod(s) command or when an update to the Billing schedule is available from the
 * commodity supplier. Nested and overlapping PublishBillingPeriod commands are not
 * allowed. In the case of overlapping billing periods, the period with the newer
 * IssuerEventID takes priority over all nested and overlapping periods. All existing
 * periods that overlap, even partially, should be removed. Note however that there may be
 * separate billing schedules for consumption delivered and received.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-04-14T08:41:54Z")
public class PublishBillingPeriodCommand extends ZclCommand {
    /**
     * The cluster ID to which this command belongs.
     */
    public static int CLUSTER_ID = 0x0700;

    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x09;

    /**
     * Provider ID command message field.
     * <p>
     * An unsigned 32-bit field containing a unique identifier for the commodity provider.
     * This field allows differentiation in deregulated markets where multiple commodity
     * providers may be available.
     */
    private Integer providerId;

    /**
     * Issuer Event ID command message field.
     * <p>
     * Unique identifier generated by the commodity provider. When new information is
     * provided that replaces older information for the same time period, this field allows
     * devices to determine which information is newer. The value contained in this field is a
     * unique number managed by upstream servers or a UTC based time stamp (UTCTime data type)
     * identifying when the Publish command was issued. Thus, newer information will have a
     * value in the Issuer Event ID field that is larger than older information.
     */
    private Integer issuerEventId;

    /**
     * Billing Period Start Time command message field.
     * <p>
     * A UTCTime field to denote the time at which the billing period starts. A start time of
     * 0x00000000 is a special time denoting “now”. A start date/time of 0xFFFFFFFF shall
     * cause an existing PublishBillingPeriod command with the same Provider ID and Issuer
     * Event ID to be cancelled (note that, in markets where permanently active price
     * information is required for billing purposes, it is recommended that a
     * replacement/superseding PublishBillingPeriod command is used in place of this
     * cancellation mechanism).
     */
    private Calendar billingPeriodStartTime;

    /**
     * Billing Period Duration command message field.
     * <p>
     * An unsigned 24-bit field to denote the billing period duration. The duration units are
     * defined by the Billing Period Duration Type field. Billing periods are always
     * repeating, i.e. after BillingPeriodDuration has elapsed since a
     * BillingPeriodStartTime, a new billing period will start with the same duration.
     */
    private Integer billingPeriodDuration;

    /**
     * Billing Period Duration Type command message field.
     * <p>
     * An 8-bit bitmap where the least significant nibble is an enumerated sub-field
     * indicating the time base used for the duration, and the most significant nibble is an
     * enumerated sub-field providing duration control.
     */
    private Integer billingPeriodDurationType;

    /**
     * Tariff Type command message field.
     * <p>
     * An 8-bit bitmap identifying the type of tariff published in this command. The least
     * significant nibble represents an enumeration of the tariff type (Generation Meters
     * shall use the ‘Received’ Tariff). The most significant nibble is reserved.
     */
    private Integer tariffType;

    /**
     * Default constructor.
     */
    public PublishBillingPeriodCommand() {
        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    /**
     * Gets Provider ID.
     * <p>
     * An unsigned 32-bit field containing a unique identifier for the commodity provider.
     * This field allows differentiation in deregulated markets where multiple commodity
     * providers may be available.
     *
     * @return the Provider ID
     */
    public Integer getProviderId() {
        return providerId;
    }

    /**
     * Sets Provider ID.
     * <p>
     * An unsigned 32-bit field containing a unique identifier for the commodity provider.
     * This field allows differentiation in deregulated markets where multiple commodity
     * providers may be available.
     *
     * @param providerId the Provider ID
     */
    public void setProviderId(final Integer providerId) {
        this.providerId = providerId;
    }

    /**
     * Gets Issuer Event ID.
     * <p>
     * Unique identifier generated by the commodity provider. When new information is
     * provided that replaces older information for the same time period, this field allows
     * devices to determine which information is newer. The value contained in this field is a
     * unique number managed by upstream servers or a UTC based time stamp (UTCTime data type)
     * identifying when the Publish command was issued. Thus, newer information will have a
     * value in the Issuer Event ID field that is larger than older information.
     *
     * @return the Issuer Event ID
     */
    public Integer getIssuerEventId() {
        return issuerEventId;
    }

    /**
     * Sets Issuer Event ID.
     * <p>
     * Unique identifier generated by the commodity provider. When new information is
     * provided that replaces older information for the same time period, this field allows
     * devices to determine which information is newer. The value contained in this field is a
     * unique number managed by upstream servers or a UTC based time stamp (UTCTime data type)
     * identifying when the Publish command was issued. Thus, newer information will have a
     * value in the Issuer Event ID field that is larger than older information.
     *
     * @param issuerEventId the Issuer Event ID
     */
    public void setIssuerEventId(final Integer issuerEventId) {
        this.issuerEventId = issuerEventId;
    }

    /**
     * Gets Billing Period Start Time.
     * <p>
     * A UTCTime field to denote the time at which the billing period starts. A start time of
     * 0x00000000 is a special time denoting “now”. A start date/time of 0xFFFFFFFF shall
     * cause an existing PublishBillingPeriod command with the same Provider ID and Issuer
     * Event ID to be cancelled (note that, in markets where permanently active price
     * information is required for billing purposes, it is recommended that a
     * replacement/superseding PublishBillingPeriod command is used in place of this
     * cancellation mechanism).
     *
     * @return the Billing Period Start Time
     */
    public Calendar getBillingPeriodStartTime() {
        return billingPeriodStartTime;
    }

    /**
     * Sets Billing Period Start Time.
     * <p>
     * A UTCTime field to denote the time at which the billing period starts. A start time of
     * 0x00000000 is a special time denoting “now”. A start date/time of 0xFFFFFFFF shall
     * cause an existing PublishBillingPeriod command with the same Provider ID and Issuer
     * Event ID to be cancelled (note that, in markets where permanently active price
     * information is required for billing purposes, it is recommended that a
     * replacement/superseding PublishBillingPeriod command is used in place of this
     * cancellation mechanism).
     *
     * @param billingPeriodStartTime the Billing Period Start Time
     */
    public void setBillingPeriodStartTime(final Calendar billingPeriodStartTime) {
        this.billingPeriodStartTime = billingPeriodStartTime;
    }

    /**
     * Gets Billing Period Duration.
     * <p>
     * An unsigned 24-bit field to denote the billing period duration. The duration units are
     * defined by the Billing Period Duration Type field. Billing periods are always
     * repeating, i.e. after BillingPeriodDuration has elapsed since a
     * BillingPeriodStartTime, a new billing period will start with the same duration.
     *
     * @return the Billing Period Duration
     */
    public Integer getBillingPeriodDuration() {
        return billingPeriodDuration;
    }

    /**
     * Sets Billing Period Duration.
     * <p>
     * An unsigned 24-bit field to denote the billing period duration. The duration units are
     * defined by the Billing Period Duration Type field. Billing periods are always
     * repeating, i.e. after BillingPeriodDuration has elapsed since a
     * BillingPeriodStartTime, a new billing period will start with the same duration.
     *
     * @param billingPeriodDuration the Billing Period Duration
     */
    public void setBillingPeriodDuration(final Integer billingPeriodDuration) {
        this.billingPeriodDuration = billingPeriodDuration;
    }

    /**
     * Gets Billing Period Duration Type.
     * <p>
     * An 8-bit bitmap where the least significant nibble is an enumerated sub-field
     * indicating the time base used for the duration, and the most significant nibble is an
     * enumerated sub-field providing duration control.
     *
     * @return the Billing Period Duration Type
     */
    public Integer getBillingPeriodDurationType() {
        return billingPeriodDurationType;
    }

    /**
     * Sets Billing Period Duration Type.
     * <p>
     * An 8-bit bitmap where the least significant nibble is an enumerated sub-field
     * indicating the time base used for the duration, and the most significant nibble is an
     * enumerated sub-field providing duration control.
     *
     * @param billingPeriodDurationType the Billing Period Duration Type
     */
    public void setBillingPeriodDurationType(final Integer billingPeriodDurationType) {
        this.billingPeriodDurationType = billingPeriodDurationType;
    }

    /**
     * Gets Tariff Type.
     * <p>
     * An 8-bit bitmap identifying the type of tariff published in this command. The least
     * significant nibble represents an enumeration of the tariff type (Generation Meters
     * shall use the ‘Received’ Tariff). The most significant nibble is reserved.
     *
     * @return the Tariff Type
     */
    public Integer getTariffType() {
        return tariffType;
    }

    /**
     * Sets Tariff Type.
     * <p>
     * An 8-bit bitmap identifying the type of tariff published in this command. The least
     * significant nibble represents an enumeration of the tariff type (Generation Meters
     * shall use the ‘Received’ Tariff). The most significant nibble is reserved.
     *
     * @param tariffType the Tariff Type
     */
    public void setTariffType(final Integer tariffType) {
        this.tariffType = tariffType;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(providerId, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(issuerEventId, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(billingPeriodStartTime, ZclDataType.UTCTIME);
        serializer.serialize(billingPeriodDuration, ZclDataType.UNSIGNED_24_BIT_INTEGER);
        serializer.serialize(billingPeriodDurationType, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(tariffType, ZclDataType.BITMAP_8_BIT);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        providerId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        issuerEventId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        billingPeriodStartTime = (Calendar) deserializer.deserialize(ZclDataType.UTCTIME);
        billingPeriodDuration = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_24_BIT_INTEGER);
        billingPeriodDurationType = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        tariffType = (Integer) deserializer.deserialize(ZclDataType.BITMAP_8_BIT);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(251);
        builder.append("PublishBillingPeriodCommand [");
        builder.append(super.toString());
        builder.append(", providerId=");
        builder.append(providerId);
        builder.append(", issuerEventId=");
        builder.append(issuerEventId);
        builder.append(", billingPeriodStartTime=");
        builder.append(billingPeriodStartTime);
        builder.append(", billingPeriodDuration=");
        builder.append(billingPeriodDuration);
        builder.append(", billingPeriodDurationType=");
        builder.append(billingPeriodDurationType);
        builder.append(", tariffType=");
        builder.append(tariffType);
        builder.append(']');
        return builder.toString();
    }

}
