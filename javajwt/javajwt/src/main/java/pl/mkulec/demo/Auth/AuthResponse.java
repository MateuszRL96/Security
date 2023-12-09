package pl.mkulec.demo.Auth;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthResponse {

    private String email;
    private String accessToken;


    public AuthResponse(String email, String accessToken) {
        this.email = email;
        this.accessToken = accessToken;
    }
}
