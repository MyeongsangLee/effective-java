package me.whiteship.chapter01.item07.optional;

import java.util.Optional;

public class Channel {

    private int numOfSubscribers;

    public Optional<MemberShip> defaultMemberShip() {
        if (this.numOfSubscribers < 2000) {
            return Optional.empty();
        } else {
            return Optional.of(new MemberShip());
        }
    }

    public static void main(String[] args) {
        String str = "str";
        Optional<String> optVal = Optional.ofNullable("str");

        System.out.println(optVal.get());
        System.out.println(optVal.orElse(""));
        System.out.println(optVal.orElseGet(()-> "sdl;kfsl;d"));
        System.out.println(optVal.orElseThrow(NullPointerException::new));


    }

}
