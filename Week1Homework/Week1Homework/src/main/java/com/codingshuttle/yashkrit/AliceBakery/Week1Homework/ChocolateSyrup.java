package com.codingshuttle.yashkrit.AliceBakery.Week1Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Syrup",havingValue = "Chocolate")
public class ChocolateSyrup implements Syrup{
    @Override
    public String getSyrup() {
        return "ChocolateSyrup";
    }
}
