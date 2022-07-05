package com.joaopinho.pocchainofresponsability.processors;

import com.joaopinho.pocchainofresponsability.model.User;
import org.springframework.stereotype.Component;

@Component
public class ShortNameProcessor extends ValidationProcessor {
    public ShortNameProcessor(){
        super();
    }

    @Override
    public boolean isValid(User user) {
        if(user.getName().length() < 3){
            return false;
        } else if (nextProcessor != null){
            return nextProcessor.isValid(user);
        }
        return true;
    }
}
