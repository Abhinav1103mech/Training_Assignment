package User;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PatchUserResponse {
    private String name;
    private String job;
}
