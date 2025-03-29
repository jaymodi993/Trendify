package com.trendify.service;

import com.trendify.response.SignupRequest;

public interface AuthService {
    String createUser(SignupRequest req);

    void sentLoginOtp(String email);
}
