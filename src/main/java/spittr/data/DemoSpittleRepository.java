package spittr.data;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class DemoSpittleRepository implements SpittleRepository {

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(new Spittle("Message:"+i, new Date()));
        }
        return list;
    }

    @Override
    public Spittle findOne(long id) {
        return new Spittle("DemoMessage",new Date());
    }
}
