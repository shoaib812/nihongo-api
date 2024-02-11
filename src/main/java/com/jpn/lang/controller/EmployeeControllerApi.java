package com.jpn.lang.controller;

import com.jpn.lang.model.request.EmployeePostRequest;
import com.jpn.lang.model.response.EmployeeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public interface EmployeeControllerApi {
    @PostMapping
    EmployeeResponse addEmployee(@RequestBody EmployeePostRequest employeePostRequest);

    @GetMapping
    ArrayList<EmployeeResponse> getEmployees(@RequestParam(value = "id", required = false) Long id);
}