/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class GetComplianceDetailsByConfigRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the AWS Config rule for which you want compliance information.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> complianceTypes;
    /**
     * <p>
     * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a limit
     * greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the AWS Config rule for which you want compliance information.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule for which you want compliance information.
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule for which you want compliance information.
     * </p>
     * 
     * @return The name of the AWS Config rule for which you want compliance information.
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule for which you want compliance information.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule for which you want compliance information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceDetailsByConfigRuleRequest withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * </p>
     * 
     * @return Filters the results by compliance.</p>
     *         <p>
     *         The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and
     *         <code>NOT_APPLICABLE</code>.
     * @see ComplianceType
     */

    public java.util.List<String> getComplianceTypes() {
        if (complianceTypes == null) {
            complianceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return complianceTypes;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * </p>
     * 
     * @param complianceTypes
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * @see ComplianceType
     */

    public void setComplianceTypes(java.util.Collection<String> complianceTypes) {
        if (complianceTypes == null) {
            this.complianceTypes = null;
            return;
        }

        this.complianceTypes = new com.amazonaws.internal.SdkInternalList<String>(complianceTypes);
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceTypes(java.util.Collection)} or {@link #withComplianceTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param complianceTypes
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public GetComplianceDetailsByConfigRuleRequest withComplianceTypes(String... complianceTypes) {
        if (this.complianceTypes == null) {
            setComplianceTypes(new com.amazonaws.internal.SdkInternalList<String>(complianceTypes.length));
        }
        for (String ele : complianceTypes) {
            this.complianceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * </p>
     * 
     * @param complianceTypes
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public GetComplianceDetailsByConfigRuleRequest withComplianceTypes(java.util.Collection<String> complianceTypes) {
        setComplianceTypes(complianceTypes);
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * </p>
     * 
     * @param complianceTypes
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public GetComplianceDetailsByConfigRuleRequest withComplianceTypes(ComplianceType... complianceTypes) {
        com.amazonaws.internal.SdkInternalList<String> complianceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(complianceTypes.length);
        for (ComplianceType value : complianceTypes) {
            complianceTypesCopy.add(value.toString());
        }
        if (getComplianceTypes() == null) {
            setComplianceTypes(complianceTypesCopy);
        } else {
            getComplianceTypes().addAll(complianceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a limit
     * greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a
     *        limit greater than 100. If you specify 0, AWS Config uses the default.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a limit
     * greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @return The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a
     *         limit greater than 100. If you specify 0, AWS Config uses the default.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a limit
     * greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a
     *        limit greater than 100. If you specify 0, AWS Config uses the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceDetailsByConfigRuleRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceDetailsByConfigRuleRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: " + getConfigRuleName() + ",");
        if (getComplianceTypes() != null)
            sb.append("ComplianceTypes: " + getComplianceTypes() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComplianceDetailsByConfigRuleRequest == false)
            return false;
        GetComplianceDetailsByConfigRuleRequest other = (GetComplianceDetailsByConfigRuleRequest) obj;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getComplianceTypes() == null ^ this.getComplianceTypes() == null)
            return false;
        if (other.getComplianceTypes() != null && other.getComplianceTypes().equals(this.getComplianceTypes()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getComplianceTypes() == null) ? 0 : getComplianceTypes().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetComplianceDetailsByConfigRuleRequest clone() {
        return (GetComplianceDetailsByConfigRuleRequest) super.clone();
    }
}
