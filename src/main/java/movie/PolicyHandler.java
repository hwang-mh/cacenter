package movie;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.data.jpa.domain.QAbstractAuditable;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler {
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverMovieReserved_Katalk(@Payload MovieReserved movieReserved){

        if(movieReserved.isMe()){
            System.out.println("##### listener Katalk : " + movieReserved.toJson());
        }
    }

}
