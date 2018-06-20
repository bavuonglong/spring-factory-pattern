package com.codeko.springfactorypattern.factory;

import com.codeko.springfactorypattern.constant.BuyerType;
import com.codeko.springfactorypattern.dto.Buyer;
import org.springframework.stereotype.Service;

@Service
public class BuyerFactoryImpl {

    private BuyerFactory buyerFactory;

    public BuyerFactoryImpl(BuyerFactory buyerFactory) {
        this.buyerFactory = buyerFactory;
    }

    public Buyer createBuyer(boolean isBuyingForThemselves) {
        if (isBuyingForThemselves) {
            return buyerFactory.createBuyer(BuyerType.BUYER_BUY_FOR_THEMSELVES.getValue());
        } else {
            return buyerFactory.createBuyer(BuyerType.BUYER_BUY_FOR_ANOTHER.getValue());
        }
    }
}
