package com.codingshuttle.yashkrit.AliceBakery.Week1Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Frost",havingValue = "Strawberry")
public class StrawberryForsting implements Frosting{
    @Override
    public String getFrosting() {
        return "StrawberryFrosting";
    }
}
