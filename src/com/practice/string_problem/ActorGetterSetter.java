package com.practice.string_problem;

public class ActorGetterSetter {

    private String ActorBuyer;
    private String ActorSeller;

    public String getActorBuyer() {
        return ActorBuyer;
    }

    public void setActorBuyer(String actorBuyer) {
        ActorBuyer = actorBuyer;
    }

    public String getActorSeller() {
        return ActorSeller;
    }

    public void setActorSeller(String actorSeller) {
        ActorSeller = actorSeller;
    }

    @Override
    public String toString() {
        return "ActorGetterSetter{" +
                "ActorBuyer='" + ActorBuyer + '\'' +
                ", ActorSeller='" + ActorSeller + '\'' +
                '}';
    }
}
