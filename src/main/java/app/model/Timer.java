package app.model;
import lombok.Getter;
import org.springframework.stereotype.Component;


@Getter
@Component
public class Timer {

    private Long nanoTime = System.nanoTime();


}
