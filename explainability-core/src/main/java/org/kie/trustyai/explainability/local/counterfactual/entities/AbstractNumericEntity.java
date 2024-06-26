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
package org.kie.trustyai.explainability.local.counterfactual.entities;

import org.kie.trustyai.explainability.model.Feature;
import org.kie.trustyai.explainability.model.FeatureDistribution;
import org.kie.trustyai.explainability.model.FeatureFactory;
import org.kie.trustyai.explainability.model.Value;
import org.kie.trustyai.explainability.utils.DataUtils;

/**
 * Common class for numerical counterfactual entities
 */
public abstract class AbstractNumericEntity<T extends Number> extends AbstractAlgebraicEntity<T> {

    protected Double stdDev;

    protected AbstractNumericEntity() {
        super();
    }

    protected AbstractNumericEntity(T originalValue, String featureName, T minimum, T maximum,
            FeatureDistribution featureDistribution, boolean constrained) {
        super(originalValue, featureName, minimum, maximum, constrained);
        this.range = maximum.doubleValue() - minimum.doubleValue();

        if (featureDistribution != null) {
            final double[] samples = featureDistribution.getAllSamples().stream().mapToDouble(Value::asNumber).toArray();
            final double mean = DataUtils.getMean(samples);
            this.stdDev = DataUtils.getStdDev(samples, mean);
        }
    }

    /**
     * Calculates the distance between the current planning value and the reference value
     * for this feature.
     * If the feature distribution is specified, this will return a scaled distance, otherwise
     * it returns an unscaled distance.
     *
     * @return Numerical distance
     */
    @Override
    public double distance() {
        double distance = Math.abs(this.proposedValue.doubleValue() - originalValue.doubleValue());
        if (this.stdDev != null) {
            return distance / (this.stdDev * this.stdDev);
        } else {
            return distance;
        }
    }

    @Override
    public double similarity() {
        if (isConstrained()) {
            return 1.0;
        } else {
            return 1.0 - Math.abs(this.proposedValue.doubleValue() - originalValue.doubleValue()) / this.range;
        }
    }

    /**
     * Returns the {@link AbstractNumericEntity} as a {@link Feature}
     *
     * @return {@link Feature}
     */
    @Override
    public Feature asFeature() {
        return FeatureFactory.newNumericalFeature(featureName, this.proposedValue);
    }
}
