package com.joaopinho.pocchainofresponsability.processors;

import com.joaopinho.pocchainofresponsability.model.User;
import org.springframework.stereotype.Component;

@Component
public class EmptyNameProcessor extends ValidationProcessor {
    public EmptyNameProcessor(){
        super();
    }

    @Override
    public boolean isValid(User user) {
        if(user.getName().isEmpty()){
            return false;
        } else if (nextProcessor != null){
            return nextProcessor.isValid(user);
        }
        return true;
    }
}
