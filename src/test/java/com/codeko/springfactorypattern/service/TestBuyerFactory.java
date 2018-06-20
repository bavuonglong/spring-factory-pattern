package com.codeko.springfactorypattern.service;

import com.codeko.springfactorypattern.dto.Buyer;
import com.codeko.springfactorypattern.factory.BuyerFactoryImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBuyerFactory {

    @Autowired
    BuyerFactoryImpl buyerFactory;

    @Test
    public void testBuyerFactory() {
        Buyer buyerBuyForThemselves = buyerFactory.createBuyer(true);
        Assert.assertEquals("Buy for themselves", buyerBuyForThemselves.buy());


        Buyer buyerBuyForAnother = buyerFactory.createBuyer(false);
        Assert.assertEquals("Buy for another", buyerBuyForAnother.buy());


        Buyer anotherBuyerBuyForThemselves = buyerFactory.createBuyer(true);
        Assert.assertNotEquals(buyerBuyForThemselves, anotherBuyerBuyForThemselves);
    }
}
