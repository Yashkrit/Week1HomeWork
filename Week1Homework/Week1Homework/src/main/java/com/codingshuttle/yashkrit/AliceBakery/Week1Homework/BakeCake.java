package com.codingshuttle.yashkrit.AliceBakery.Week1Homework;

import org.springframework.stereotype.Component;

@Component
public class BakeCake {

    final private Frosting frosting;
    final private Syrup syrup;

    BakeCake(Frosting frosting,Syrup syrup){
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public  void Baking(){
        System.out.println("Cake with "+frosting.getFrosting()+" Frosting and "+syrup.getSyrup()+" Syrup ready");
    }
}
