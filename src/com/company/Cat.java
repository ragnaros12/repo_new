package com.company;

public class Cat {

    private String name;

    protected int pow;

    private String sound;

    private boolean is_tale;

    public Cat(String name, int pow, String sound, boolean is_tale){
        this.name = name;
        this.pow = pow;
        this.sound = sound;
        this.is_tale = is_tale;
    }

    public int getPow() {
        return pow;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean isIs_tale() {
        return is_tale;
    }

    public void setIs_tale(boolean is_tale) {
        this.is_tale = is_tale;
    }

    public void say(){
        System.out.println(sound);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
