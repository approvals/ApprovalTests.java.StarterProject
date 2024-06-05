package org.samples;

import org.lambda.query.Queryable;

public class LedRing {
    private Queryable<Light> lights = new Queryable<Light>(Light.class);

    public LedRing() {
        for (int i = 0; i < 16; i++) {
            lights.add(new Light());
        }

    }

    public LedRing setLightLevel(int percentage) {
        int totalLEDs = 16;

        int ledsToLightUp = calculateLEDsToLightUp(totalLEDs, percentage);

        for (int i = 0; i < lights.size(); i++) {
            lights.get(i).setOn(i < ledsToLightUp);
//            lights.get(i).setOn(threshold < percentage);
        }
        return this;
    }

    public static int calculateLEDsToLightUp(int totalLEDs, double percentLevel) {
        double leds = (percentLevel / 100) * totalLEDs;
        return (int) Math.round(leds);
    }

    @Override
    public String toString() {
        return "[" + lights.join(",") + "]";
    }
}
