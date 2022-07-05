package com.joaopinho.pocchainofresponsability.processors;

import com.joaopinho.pocchainofresponsability.model.User;

public abstract class ValidationProcessor {
    public ValidationProcessor nextProcessor;

    public void setNextProcessor(ValidationProcessor validationProcessor){
        this.nextProcessor = validationProcessor;
    }

    public abstract boolean isValid(User user);

}
