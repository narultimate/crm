package io.github.jhipster.application.repository.search;

import io.github.jhipster.application.domain.ProductOrder;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the ProductOrder entity.
 */
public interface ProductOrderSearchRepository extends ElasticsearchRepository<ProductOrder, Long> {
}
