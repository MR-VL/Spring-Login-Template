package com.mrvl.loginsystemtemplate.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "Firstname is mandatory")
    private String firstname;

    @NotEmpty(message = "Lastname is mandatory")
    private String lastname;

    @Email(message = "Email is not well formatted")
    @NotEmpty(message = "Email is mandatory")
    private String email;

    @NotEmpty(message = "Password is mandatory")
    @Size(min = 8, message = "Password should be 8 characters long minimum")
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
            message = "Password must include at least one digit, one lowercase letter, one uppercase letter, and one special character (@#$%^&+=)."
    )
    private String password;
}
