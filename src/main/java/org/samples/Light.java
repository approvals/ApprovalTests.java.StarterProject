package org.samples;

public class Light {
    private boolean on = false;

    @Override
    public String toString() {
        return on ? "*" : "-";
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
