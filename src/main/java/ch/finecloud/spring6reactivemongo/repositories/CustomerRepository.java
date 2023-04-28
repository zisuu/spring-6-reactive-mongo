package ch.finecloud.spring6reactivemongo.repositories;

import ch.finecloud.spring6reactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {

}
