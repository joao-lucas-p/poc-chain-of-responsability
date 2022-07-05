package com.joaopinho.pocchainofresponsability.services;

import com.joaopinho.pocchainofresponsability.model.User;
import com.joaopinho.pocchainofresponsability.processors.EmptyNameProcessor;
import com.joaopinho.pocchainofresponsability.processors.NumberNameProcessor;
import com.joaopinho.pocchainofresponsability.processors.ShortNameProcessor;
import com.joaopinho.pocchainofresponsability.processors.ValidationProcessor;
import org.springframework.stereotype.Service;

@Service
public class ValidateNameService {
    protected static ValidationProcessor nameLenght = new ShortNameProcessor();
    protected static ValidationProcessor nameEmpty = new EmptyNameProcessor();
    protected static ValidationProcessor nameHasNumber = new NumberNameProcessor();
    protected static ValidationProcessor validationChain;

    static {
        nameEmpty.setNextProcessor(nameLenght);
        nameLenght.setNextProcessor(nameHasNumber);
        validationChain = nameEmpty;
    }

    public Boolean check(User user){

        return validationChain.isValid(user);
    }
}
