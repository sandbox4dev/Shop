package com.floramaster.web.DAO;

import com.floramaster.web.exceptions.SequenceException;
import com.floramaster.web.model.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by VFrancishko on 12.12.2016.
 */
@Repository
public class SequenceDAO {
    @Autowired private MongoOperations mongoOperations;

    public Long getNextSequenceId(String key){
        Query query = new Query(Criteria.where("id").is(key));

        Update update = new Update();
        update.inc("sequence",1);

        FindAndModifyOptions options = new FindAndModifyOptions();
        options.returnNew(true);

        Sequence sequence = mongoOperations.findAndModify(query,update,options,Sequence.class);

        if(sequence == null) throw new SequenceException("Unable to get sequence for key "+key);

        return sequence.getSequence();
    }
}
