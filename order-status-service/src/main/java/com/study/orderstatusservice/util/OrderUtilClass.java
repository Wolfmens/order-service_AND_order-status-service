package com.study.orderstatusservice.util;

import java.util.List;
import java.util.Random;

public class OrderUtilClass {

    private static final Random random = new Random();

    public static String getRandomStatusFromList(List<String> statuses) {
        return statuses.get(random.nextInt(statuses.size()));
    }

}
