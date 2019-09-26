package com.ics.demo;

import com.ics.demo.oop.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class DemoApplication {

    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
//
//        Birds bird = new Birds("Chicken", TypeOfEye.COMPOUND, TypeOfBeak.BLUNT);
//        Mammal mammal = new Mammal("Human", TypeOfEye.SIMPLE, 2,9);
//        Mammal mammal1 = new Mammal("Whale",TypeOfEye.SIMPLE,9);
//        Fish fish = new Fish("Tilapia",TypeOfEye.SIMPLE,4);
//
//        System.out.println(bird.toString());
//        bird.move();
//        System.out.println(mammal.toString());
//        mammal.move();
//        System.out.println(mammal1.toString());
//        mammal.move();
//        System.out.println(fish.toString());
//        fish.move();
//    }

    }
}
