package org.example.app.utils;

import java.util.HashMap;
import java.util.Map;

public class UserValidator {

    public Map<String, String> validateContactData(Map<String, String> data) {

        Map<String, String> errors = new HashMap<>();

        if (data.containsKey("id") & AppValidator.isIdValid(data.get("id")))
            errors.put("id", Constants.WRONG_ID_MSG);

        if (data.containsKey("firstName")) {
            if (data.get("firstName") != null & data.get("firstName").isEmpty())
                errors.put("firstName", Constants.INPUT_REQ_MSG);
        }

        if (data.containsKey("email") & AppValidator.isEmailValid(data.get("email")))
            errors.put("email", Constants.WRONG_EMAIL_MSG);

        return errors;
    }
}
