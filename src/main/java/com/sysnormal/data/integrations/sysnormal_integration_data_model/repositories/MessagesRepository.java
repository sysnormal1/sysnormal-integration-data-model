package com.sysnormal.data.integrations.sysnormal_integration_data_model.repositories;

import com.sysnormal.data.base_data_model.repositories.BaseRepository;
import com.sysnormal.data.integrations.sysnormal_integration_data_model.entities.Message;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends BaseRepository<Message, Long> {

}