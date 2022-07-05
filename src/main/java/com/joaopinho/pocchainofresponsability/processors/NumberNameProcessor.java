package com.joaopinho.pocchainofresponsability.processors;

import com.joaopinho.pocchainofresponsability.model.User;

public class NumberNameProcessor extends ValidationProcessor {
    public NumberNameProcessor(){
        super();
    }

    @Override
    public boolean isValid(User user) {
        if(user.getName().matches(".*\\d.*")){
            return false;
        } else if (nextProcessor != null){
            return nextProcessor.isValid(user);
        }
        return true;
    }
}
