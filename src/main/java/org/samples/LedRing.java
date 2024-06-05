package org.samples;

import org.apache.commons.lang3.StringUtils;
import org.lambda.query.Queryable;

public class LedRing {
    private Queryable<Light> lights = new Queryable<Light>(Light.class);

    public LedRing() {
        for (int i = 0; i < 16; i++) {
            lights.add(new Light());
        }

    }

    public void setLightLevel(int percentage) {

    }

    @Override
    public String toString() {
        return "["+lights.join(",")+"]";
    }
}
