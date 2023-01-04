package me.whiteship.chapter01.item03.staticfactory;

public class MetaElvis<T> {
    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();
    private MetaElvis(){}

    public static <E> MetaElvis<E> getInstance() {
        return (MetaElvis<E>) INSTANCE;
    }

    public void say(T t) {
        System.out.println("say : " + t);
    }

    public void leaveTheBuilding() {
        System.out.println("whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
        System.out.println(elvis1.equals(elvis2));
//        System.out.println(elvis1 == elvis2);

        elvis1.say("hello");
        elvis2.say(33);
    }
}
