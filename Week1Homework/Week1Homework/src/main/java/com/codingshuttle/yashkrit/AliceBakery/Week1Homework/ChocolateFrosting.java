package com.codingshuttle.yashkrit.AliceBakery.Week1Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Frost",havingValue = "Chocolate")
public class ChocolateFrosting implements Frosting{
    @Override
    public String getFrosting() {
       return "ChocolateFrosting";
    }
}
