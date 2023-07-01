package com.assignment.TwoFactorVerification.service;

import com.assignment.TwoFactorVerification.credential.UserRegisteredDTO;
import com.assignment.TwoFactorVerification.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

//import com.tsv.implementation.dto.UserRegisteredDTO;
//import com.tsv.implementation.model.User;


public interface DefaultUserService extends UserDetailsService{

    void save(UserRegisteredDTO userRegisteredDTO);

    String genrateOTPAndSendOnMobile(User user);




}