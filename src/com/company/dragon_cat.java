package com.company;

public class dragon_cat extends Cat{

    private boolean isWing;

    public boolean getWing() {
        return isWing;
    }

    @Override
    public int getPow() {
        return super.getPow();
    }

    public void setWing(boolean wing) {
        isWing = wing;
    }

    public dragon_cat(String name, int pow, String sound, boolean is_tale, boolean isWing) {
        super(name, pow, sound, is_tale);
        this.isWing = isWing;
    }
}
