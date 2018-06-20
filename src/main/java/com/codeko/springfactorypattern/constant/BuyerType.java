package com.codeko.springfactorypattern.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BuyerType {
    BUYER_BUY_FOR_THEMSELVES(Constants.BUYER_BUY_FOR_THEMSELVES),
    BUYER_BUY_FOR_ANOTHER(Constants.BUYER_BUY_FOR_ANOTHER);

    String value;

    public static class Constants {
        public static final String BUYER_BUY_FOR_THEMSELVES = "buyer_buy_for_themselves";
        public static final String BUYER_BUY_FOR_ANOTHER = "buyer_buy_for_another";
    }
}
