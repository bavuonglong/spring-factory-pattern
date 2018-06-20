package com.codeko.springfactorypattern.factory;

import com.codeko.springfactorypattern.dto.Buyer;

public interface BuyerFactory {
    Buyer createBuyer(String typeOfBuyer);
}
