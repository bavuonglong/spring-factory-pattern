package com.codeko.springfactorypattern.dto;

import com.codeko.springfactorypattern.constant.BuyerType;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(BuyerType.Constants.BUYER_BUY_FOR_THEMSELVES)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BuyerBuyForThemselves implements Buyer {
    @Override
    public String buy() {
        return "Buy for themselves";
    }
}
