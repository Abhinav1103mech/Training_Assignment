package User;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateLoginSuccesful {
    private String email;
    private String password;
}
