/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.syncope.common.lib.to.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.syncope.common.lib.types.OIDCSubjectType;

@Schema(allOf = { ClientAppTO.class })
public class OIDCRPTO extends ClientAppTO {

    private static final long serialVersionUID = -6370888503924521351L;

    private String clientId;

    private String clientSecret;

    private boolean signIdToken;

    private OIDCSubjectType subjectType;

    private final List<String> redirectUris = new ArrayList<>();

    private final Set<String> supportedGrantTypes = new HashSet<>();

    private final Set<String> supportedResponseTypes = new HashSet<>();

    private String logoutUri;

    @JacksonXmlProperty(localName = "_class", isAttribute = true)
    @JsonProperty("_class")
    @Schema(name = "_class", required = true, example = "org.apache.syncope.common.lib.to.client.OIDCRPTO")
    @Override
    public String getDiscriminator() {
        return getClass().getName();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(final String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(final String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public List<String> getRedirectUris() {
        return redirectUris;
    }

    public Set<String> getSupportedGrantTypes() {
        return supportedGrantTypes;
    }

    public Set<String> getSupportedResponseTypes() {
        return supportedResponseTypes;
    }

    public boolean isSignIdToken() {
        return signIdToken;
    }

    public void setSignIdToken(final boolean signIdToken) {
        this.signIdToken = signIdToken;
    }

    public OIDCSubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(final OIDCSubjectType subjectType) {
        this.subjectType = subjectType;
    }

    public String getLogoutUri() {
        return logoutUri;
    }

    public void setLogoutUri(final String logoutUri) {
        this.logoutUri = logoutUri;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        OIDCRPTO rhs = (OIDCRPTO) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(this.clientId, rhs.clientId)
                .append(this.clientSecret, rhs.clientSecret)
                .append(this.signIdToken, rhs.signIdToken)
                .append(this.subjectType, rhs.subjectType)
                .append(this.redirectUris, rhs.redirectUris)
                .append(this.supportedGrantTypes, rhs.supportedGrantTypes)
                .append(this.supportedResponseTypes, rhs.supportedResponseTypes)
                .append(this.logoutUri, rhs.logoutUri)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(clientId)
                .append(clientSecret)
                .append(signIdToken)
                .append(subjectType)
                .append(redirectUris)
                .append(supportedGrantTypes)
                .append(supportedResponseTypes)
                .append(logoutUri)
                .toHashCode();
    }
}
