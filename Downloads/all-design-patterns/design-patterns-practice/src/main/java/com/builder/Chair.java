package com.builder;

public class Chair {

    private String type;
    private int legs;
    private int arms;

    public String getType() {
        return type;
    }

    public int getLegs() {
        return legs;
    }

    public int getArms() {
        return arms;
    }

    private void setType(String type) {
        this.type = type;
    }

    private void setLegs(int legs) {
        this.legs = legs;
    }

    private void setArms(int arms) {
        this.arms = arms;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "type='" + type + '\'' +
                ", legs=" + legs +
                ", arms=" + arms +
                '}';
    }

    public ChairBuilder getBuilder(){
        return new ChairBuilder();
    }

    public class ChairBuilder{

        private String type;
        private int legs;
        private int arms;
        private Chair chair;

        public ChairBuilder withChairType(String type){
            this.type = type;
            return this;
        }

        public ChairBuilder withLegs(int legs){
            this.legs = legs;
            return this;
        }


        public ChairBuilder withArms(int arms){
            this.arms = arms;
            return this;
        }

        public Chair getChair(){
            return this.chair;
        }

        public Chair build(){
            chair = new Chair();
            chair.setArms(arms);
            chair.setLegs(legs);
            chair.setType(type);
            return chair;
        }

    }
}


