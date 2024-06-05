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
        }
        return this;
    }

    public static int calculateLEDsToLightUp(int totalLEDs, double percentLevel) {

        double leds = (percentLevel / 100) * totalLEDs;

        var ledsToLightUp = (int) Math.round(leds);
        if (0 < percentLevel) {
            ledsToLightUp = Math.max(ledsToLightUp, 1);
        }

        return ledsToLightUp;

    }

    @Override
    public String toString() {
        return "[" + lights.join(",") + "]";
    }
}
