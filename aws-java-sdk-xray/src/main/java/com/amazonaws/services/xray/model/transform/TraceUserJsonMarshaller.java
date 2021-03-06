/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.xray.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;

import com.amazonaws.protocol.json.*;

/**
 * TraceUserMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TraceUserJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TraceUser traceUser, StructuredJsonGenerator jsonGenerator) {

        if (traceUser == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (traceUser.getUserName() != null) {
                jsonGenerator.writeFieldName("UserName").writeValue(traceUser.getUserName());
            }

            java.util.List<ServiceId> serviceIdsList = traceUser.getServiceIds();
            if (serviceIdsList != null) {
                jsonGenerator.writeFieldName("ServiceIds");
                jsonGenerator.writeStartArray();
                for (ServiceId serviceIdsListValue : serviceIdsList) {
                    if (serviceIdsListValue != null) {

                        ServiceIdJsonMarshaller.getInstance().marshall(serviceIdsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TraceUserJsonMarshaller instance;

    public static TraceUserJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TraceUserJsonMarshaller();
        return instance;
    }

}
