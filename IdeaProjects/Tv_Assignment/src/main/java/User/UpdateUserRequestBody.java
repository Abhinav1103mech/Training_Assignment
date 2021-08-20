package User;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UpdateUserRequestBody {
    private String name;
    private String job;


}

