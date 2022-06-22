package org.wimprovit.service;

import io.quarkus.redis.client.RedisClient;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
@ApplicationScoped
public class AlticciService {

    @Inject
    RedisClient redisClient;
    public Integer alticci(Integer num){
        var cachedResponse = redisClient.get(String.valueOf(num));
        if( cachedResponse == null){
            var alticci = getAlticciNumber(num);
            redisClient.setnx(String.valueOf(num), String.valueOf(alticci));
            return alticci;
        } else {
            return Integer.parseInt(cachedResponse.toString());
        }
    }
    private Integer getAlticciNumber(Integer num) {
        if ( num == 0 ) {
            return 0;
        }

        if ( num == 1 || num == 2) {
            return 1;
        }

        return alticci(num - 3) + (num - 2);
    }
}
