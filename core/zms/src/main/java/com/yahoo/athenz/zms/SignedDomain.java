//
// This file generated by rdl 1.4.8. Do not modify!
//

package com.yahoo.athenz.zms;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// SignedDomain - A domain object signed with server's private key
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class SignedDomain {
    public DomainData domain;
    public String signature;
    public String keyId;

    public SignedDomain setDomain(DomainData domain) {
        this.domain = domain;
        return this;
    }
    public DomainData getDomain() {
        return domain;
    }
    public SignedDomain setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return signature;
    }
    public SignedDomain setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return keyId;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != SignedDomain.class) {
                return false;
            }
            SignedDomain a = (SignedDomain) another;
            if (domain == null ? a.domain != null : !domain.equals(a.domain)) {
                return false;
            }
            if (signature == null ? a.signature != null : !signature.equals(a.signature)) {
                return false;
            }
            if (keyId == null ? a.keyId != null : !keyId.equals(a.keyId)) {
                return false;
            }
        }
        return true;
    }
}