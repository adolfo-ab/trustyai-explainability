/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.trustyai.explainability.model.domain;

import java.util.Set;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

@Entity
public class NumericalFeatureDomain extends FeatureDomain<Double> {

    protected final double lowerBound;
    protected final double upperBound;

    protected NumericalFeatureDomain(double lowerBound, double upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public NumericalFeatureDomain() {
        this.lowerBound = Double.MIN_VALUE;
        this.upperBound = Double.MAX_VALUE;
    }

    /**
     * Create a {@link FeatureDomain} for a continuous feature
     *
     * @param lowerBound The start point of the search space
     * @param upperBound The end point of the search space
     * @return A {@link FeatureDomain}
     */
    public static FeatureDomain create(double lowerBound, double upperBound) {
        return new NumericalFeatureDomain(lowerBound, upperBound);
    }

    @Override
    @Transient
    public boolean isEmpty() {
        return false;
    }

    @Override
    @Access(AccessType.FIELD)
    public Double getLowerBound() {
        return this.lowerBound;
    }

    @Override
    @Access(AccessType.FIELD)
    public Double getUpperBound() {
        return this.upperBound;
    }

    @Override
    @Transient
    public Set<Double> getCategories() {
        return null;
    }
}
