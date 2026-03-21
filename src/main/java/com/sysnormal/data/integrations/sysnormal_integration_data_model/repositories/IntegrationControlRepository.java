package com.sysnormal.data.integrations.sysnormal_integration_data_model.repositories;

import com.sysnormal.data.base_data_model.repositories.BaseRepository;
import com.sysnormal.data.integrations.sysnormal_integration_data_model.entities.IntegrationControl;
import com.sysnormal.data.integrations.sysnormal_integration_data_model.entities.IntegrationControlId;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegrationControlRepository extends BaseRepository<IntegrationControl, IntegrationControlId> {



}