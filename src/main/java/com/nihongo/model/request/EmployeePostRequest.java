package com.nihongo.model.request;

import lombok.Getter;
import lombok.Setter;

public class EmployeePostRequest {

    @Setter
    @Getter
    private String username;

    @Setter
    @Getter
    private String email;

    @Setter
    @Getter
    private String dob;

    @Setter
    @Getter
    private String address;

}
