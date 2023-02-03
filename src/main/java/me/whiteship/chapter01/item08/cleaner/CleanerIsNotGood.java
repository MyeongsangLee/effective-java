package me.whiteship.chapter01.item08.cleaner;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class CleanerIsNotGood {

    public static void main(String[] args) throws InterruptedException {
        Cleaner cleaner = Cleaner.create();

        List<Object> resourceToCleanUP = new ArrayList<>();
        BigObject bigObject = new BigObject(resourceToCleanUP);
        cleaner.register(bigObject, new BigObject.ResourceCleaner(resourceToCleanUP));  //static
        //cleaner.register(bigObject, bigObject.new ResourceCleaner(resourceToCleanUP));

        bigObject = null;
        System.gc();
        Thread.sleep(3000L);
    }
}
