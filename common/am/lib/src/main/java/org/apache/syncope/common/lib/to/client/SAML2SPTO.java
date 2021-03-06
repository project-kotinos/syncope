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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.syncope.common.lib.XmlSecAlgorithms;
import org.apache.syncope.common.lib.types.SAML2SPNameId;

import java.util.ArrayList;
import java.util.List;

@Schema(allOf = { ClientAppTO.class })
public class SAML2SPTO extends ClientAppTO {

    private static final long serialVersionUID = -6370888503924521351L;

    private String entityId;

    private String metadataLocation;

    private String metadataSignatureLocation;

    private boolean signAssertions;

    private boolean signResponses;

    private boolean encryptionOptional;

    private boolean encryptAssertions;

    private String requiredAuthenticationContextClass;

    private SAML2SPNameId requiredNameIdFormat;

    private Integer skewAllowance;

    private String nameIdQualifier;

    private String assertionAudiences;

    private String serviceProviderNameIdQualifier;

    private List<XmlSecAlgorithms> signingSignatureAlgorithms = new ArrayList<>();

    private List<XmlSecAlgorithms> signingSignatureReferenceDigestMethods = new ArrayList<>();

    private List<XmlSecAlgorithms> encryptionDataAlgorithms = new ArrayList<>();

    private List<XmlSecAlgorithms> encryptionKeyAlgorithms = new ArrayList<>();
    
    private List<XmlSecAlgorithms> signingSignatureBlackListedAlgorithms = new ArrayList<>();

    private List<XmlSecAlgorithms> encryptionBlackListedAlgorithms = new ArrayList<>();

    @JacksonXmlProperty(localName = "_class", isAttribute = true)
    @JsonProperty("_class")
    @Schema(name = "_class", required = true, example = "org.apache.syncope.common.lib.to.client.SAML2SPTO")
    @Override
    public String getDiscriminator() {
        return getClass().getName();
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(final String entityId) {
        this.entityId = entityId;
    }

    public String getMetadataLocation() {
        return metadataLocation;
    }

    public void setMetadataLocation(final String metadataLocation) {
        this.metadataLocation = metadataLocation;
    }

    public String getMetadataSignatureLocation() {
        return metadataSignatureLocation;
    }

    public void setMetadataSignatureLocation(final String metadataSignatureLocation) {
        this.metadataSignatureLocation = metadataSignatureLocation;
    }

    public boolean isSignAssertions() {
        return signAssertions;
    }

    public void setSignAssertions(final boolean signAssertions) {
        this.signAssertions = signAssertions;
    }

    public boolean isSignResponses() {
        return signResponses;
    }

    public void setSignResponses(final boolean signResponses) {
        this.signResponses = signResponses;
    }

    public boolean isEncryptionOptional() {
        return encryptionOptional;
    }

    public void setEncryptionOptional(final boolean encryptionOptional) {
        this.encryptionOptional = encryptionOptional;
    }

    public boolean isEncryptAssertions() {
        return encryptAssertions;
    }

    public void setEncryptAssertions(final boolean encryptAssertions) {
        this.encryptAssertions = encryptAssertions;
    }

    public String getRequiredAuthenticationContextClass() {
        return requiredAuthenticationContextClass;
    }

    public void setRequiredAuthenticationContextClass(final String requiredAuthenticationContextClass) {
        this.requiredAuthenticationContextClass = requiredAuthenticationContextClass;
    }

    public SAML2SPNameId getRequiredNameIdFormat() {
        return requiredNameIdFormat;
    }

    public void setRequiredNameIdFormat(final SAML2SPNameId requiredNameIdFormat) {
        this.requiredNameIdFormat = requiredNameIdFormat;
    }

    public Integer getSkewAllowance() {
        return skewAllowance;
    }

    public void setSkewAllowance(final Integer skewAllowance) {
        this.skewAllowance = skewAllowance;
    }

    public String getNameIdQualifier() {
        return nameIdQualifier;
    }

    public void setNameIdQualifier(final String nameIdQualifier) {
        this.nameIdQualifier = nameIdQualifier;
    }

    public String getAssertionAudiences() {
        return assertionAudiences;
    }

    public void setAssertionAudiences(final String assertionAudiences) {
        this.assertionAudiences = assertionAudiences;
    }

    public String getServiceProviderNameIdQualifier() {
        return serviceProviderNameIdQualifier;
    }

    public void setServiceProviderNameIdQualifier(final String serviceProviderNameIdQualifier) {
        this.serviceProviderNameIdQualifier = serviceProviderNameIdQualifier;
    }

    public List<XmlSecAlgorithms> getSigningSignatureAlgorithms() {
        return signingSignatureAlgorithms;
    }

    public List<XmlSecAlgorithms> getSigningSignatureReferenceDigestMethods() {
        return signingSignatureReferenceDigestMethods;
    }

    public List<XmlSecAlgorithms> getEncryptionDataAlgorithms() {
        return encryptionDataAlgorithms;
    }

    public List<XmlSecAlgorithms> getEncryptionKeyAlgorithms() {
        return encryptionKeyAlgorithms;
    }

    public void setSigningSignatureAlgorithms(final List<XmlSecAlgorithms> signingSignatureAlgorithms) {
        this.signingSignatureAlgorithms = signingSignatureAlgorithms;
    }

    public void setSigningSignatureReferenceDigestMethods(final List<XmlSecAlgorithms> algs) {
        this.signingSignatureReferenceDigestMethods = algs;
    }

    public void setEncryptionDataAlgorithms(final List<XmlSecAlgorithms> encryptionDataAlgorithms) {
        this.encryptionDataAlgorithms = encryptionDataAlgorithms;
    }

    public void setEncryptionKeyAlgorithms(final List<XmlSecAlgorithms> encryptionKeyAlgorithms) {
        this.encryptionKeyAlgorithms = encryptionKeyAlgorithms;
    }

    public List<XmlSecAlgorithms> getSigningSignatureBlackListedAlgorithms() {
        return signingSignatureBlackListedAlgorithms;
    }

    public void setSigningSignatureBlackListedAlgorithms(final List<XmlSecAlgorithms> algs) {
        this.signingSignatureBlackListedAlgorithms = algs;
    }

    public List<XmlSecAlgorithms> getEncryptionBlackListedAlgorithms() {
        return encryptionBlackListedAlgorithms;
    }

    public void setEncryptionBlackListedAlgorithms(final List<XmlSecAlgorithms> algs) {
        this.encryptionBlackListedAlgorithms = algs;
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
        SAML2SPTO rhs = (SAML2SPTO) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(this.entityId, rhs.entityId)
                .append(this.metadataLocation, rhs.metadataLocation)
                .append(this.metadataSignatureLocation, rhs.metadataSignatureLocation)
                .append(this.signAssertions, rhs.signAssertions)
                .append(this.signResponses, rhs.signResponses)
                .append(this.encryptionOptional, rhs.encryptionOptional)
                .append(this.encryptAssertions, rhs.encryptAssertions)
                .append(this.requiredAuthenticationContextClass, rhs.requiredAuthenticationContextClass)
                .append(this.requiredNameIdFormat, rhs.requiredNameIdFormat)
                .append(this.skewAllowance, rhs.skewAllowance)
                .append(this.nameIdQualifier, rhs.nameIdQualifier)
                .append(this.assertionAudiences, rhs.assertionAudiences)
                .append(this.serviceProviderNameIdQualifier, rhs.serviceProviderNameIdQualifier)
                .append(this.signingSignatureAlgorithms, rhs.signingSignatureAlgorithms)
                .append(this.signingSignatureReferenceDigestMethods, rhs.signingSignatureReferenceDigestMethods)
                .append(this.encryptionDataAlgorithms, rhs.encryptionDataAlgorithms)
                .append(this.encryptionKeyAlgorithms, rhs.encryptionKeyAlgorithms)
                .append(this.encryptionBlackListedAlgorithms, rhs.encryptionBlackListedAlgorithms)
                .append(this.signingSignatureBlackListedAlgorithms, rhs.signingSignatureBlackListedAlgorithms)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(entityId)
                .append(metadataLocation)
                .append(metadataSignatureLocation)
                .append(signAssertions)
                .append(signResponses)
                .append(encryptionOptional)
                .append(encryptAssertions)
                .append(requiredAuthenticationContextClass)
                .append(requiredNameIdFormat)
                .append(skewAllowance)
                .append(nameIdQualifier)
                .append(assertionAudiences)
                .append(serviceProviderNameIdQualifier)
                .append(signingSignatureAlgorithms)
                .append(signingSignatureReferenceDigestMethods)
                .append(encryptionDataAlgorithms)
                .append(encryptionKeyAlgorithms)
                .append(signingSignatureBlackListedAlgorithms)
                .append(encryptionBlackListedAlgorithms)
                .toHashCode();
    }
}
