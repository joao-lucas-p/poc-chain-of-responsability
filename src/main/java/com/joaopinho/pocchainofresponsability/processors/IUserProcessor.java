package com.joaopinho.pocchainofresponsability.processors;

import com.joaopinho.pocchainofresponsability.model.User;

public interface IUserProcessor {
    boolean isValid(User user);
}
