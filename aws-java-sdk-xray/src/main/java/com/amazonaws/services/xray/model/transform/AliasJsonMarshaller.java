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
 * AliasMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AliasJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Alias alias, StructuredJsonGenerator jsonGenerator) {

        if (alias == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (alias.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(alias.getName());
            }

            java.util.List<String> namesList = alias.getNames();
            if (namesList != null) {
                jsonGenerator.writeFieldName("Names");
                jsonGenerator.writeStartArray();
                for (String namesListValue : namesList) {
                    if (namesListValue != null) {
                        jsonGenerator.writeValue(namesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (alias.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(alias.getType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AliasJsonMarshaller instance;

    public static AliasJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AliasJsonMarshaller();
        return instance;
    }

}
