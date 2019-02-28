/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.metering;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Configure Notification Scheme value object class.
 * <p>
 * Cluster: <b>Metering</b>. Command is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Metering cluster.
 * <p>
 * FIXME: The ConfigureNotificationScheme is sent to the mirror once the mirror has been
 * created. The command deals with the operational configuration of the Mirror and the device
 * that reports to the mirror. No default schemes are allowed to be overwritten.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-02-09T15:23:12Z")
public class ConfigureNotificationScheme extends ZclCommand {
    /**
     * Issuer Event ID command message field.
     * <p>
     * Unique identifier generated by the device being mirrored. When new information is
     * provided that replaces older information, this field allows devices to determine
     * which information is newer. It is recommended that the value contained in this field is a
     * UTC based time stamp (UTCTime data type) identifying when the command was issued. Thus,
     * newer information will have a value in the Issuer Event ID field that is larger than older
     * information.
     */
    private Integer issuerEventId;

    /**
     * Notification Scheme command message field.
     * <p>
     * An unsigned 8-bit integer that allows for the pre-loading of the Notification Flags bit
     * mapping to ZCL or Smart Energy Standard commands.
     */
    private Integer notificationScheme;

    /**
     * Notification Flag Order command message field.
     * <p>
     * A 32-bit bitmap, consisting of 8 nibbles which define the Notification Flag attributes
     * (and order) to be returned in a MirrorReportAttributeResponse command.
     */
    private Integer notificationFlagOrder;

    /**
     * Default constructor.
     */
    public ConfigureNotificationScheme() {
        genericCommand = false;
        clusterId = 0x0702;
        commandId = 9;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    /**
     * Gets Issuer Event ID.
     * <p>
     * Unique identifier generated by the device being mirrored. When new information is
     * provided that replaces older information, this field allows devices to determine
     * which information is newer. It is recommended that the value contained in this field is a
     * UTC based time stamp (UTCTime data type) identifying when the command was issued. Thus,
     * newer information will have a value in the Issuer Event ID field that is larger than older
     * information.
     *
     * @return the Issuer Event ID
     */
    public Integer getIssuerEventId() {
        return issuerEventId;
    }

    /**
     * Sets Issuer Event ID.
     * <p>
     * Unique identifier generated by the device being mirrored. When new information is
     * provided that replaces older information, this field allows devices to determine
     * which information is newer. It is recommended that the value contained in this field is a
     * UTC based time stamp (UTCTime data type) identifying when the command was issued. Thus,
     * newer information will have a value in the Issuer Event ID field that is larger than older
     * information.
     *
     * @param issuerEventId the Issuer Event ID
     */
    public void setIssuerEventId(final Integer issuerEventId) {
        this.issuerEventId = issuerEventId;
    }

    /**
     * Gets Notification Scheme.
     * <p>
     * An unsigned 8-bit integer that allows for the pre-loading of the Notification Flags bit
     * mapping to ZCL or Smart Energy Standard commands.
     *
     * @return the Notification Scheme
     */
    public Integer getNotificationScheme() {
        return notificationScheme;
    }

    /**
     * Sets Notification Scheme.
     * <p>
     * An unsigned 8-bit integer that allows for the pre-loading of the Notification Flags bit
     * mapping to ZCL or Smart Energy Standard commands.
     *
     * @param notificationScheme the Notification Scheme
     */
    public void setNotificationScheme(final Integer notificationScheme) {
        this.notificationScheme = notificationScheme;
    }

    /**
     * Gets Notification Flag Order.
     * <p>
     * A 32-bit bitmap, consisting of 8 nibbles which define the Notification Flag attributes
     * (and order) to be returned in a MirrorReportAttributeResponse command.
     *
     * @return the Notification Flag Order
     */
    public Integer getNotificationFlagOrder() {
        return notificationFlagOrder;
    }

    /**
     * Sets Notification Flag Order.
     * <p>
     * A 32-bit bitmap, consisting of 8 nibbles which define the Notification Flag attributes
     * (and order) to be returned in a MirrorReportAttributeResponse command.
     *
     * @param notificationFlagOrder the Notification Flag Order
     */
    public void setNotificationFlagOrder(final Integer notificationFlagOrder) {
        this.notificationFlagOrder = notificationFlagOrder;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(issuerEventId, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(notificationScheme, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(notificationFlagOrder, ZclDataType.BITMAP_32_BIT);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        issuerEventId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        notificationScheme = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        notificationFlagOrder = (Integer) deserializer.deserialize(ZclDataType.BITMAP_32_BIT);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(142);
        builder.append("ConfigureNotificationScheme [");
        builder.append(super.toString());
        builder.append(", issuerEventId=");
        builder.append(issuerEventId);
        builder.append(", notificationScheme=");
        builder.append(notificationScheme);
        builder.append(", notificationFlagOrder=");
        builder.append(notificationFlagOrder);
        builder.append(']');
        return builder.toString();
    }

}