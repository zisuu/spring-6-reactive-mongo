package ch.finecloud.spring6reactivemongo.mappers;

import ch.finecloud.spring6reactivemongo.domain.Customer;
import ch.finecloud.spring6reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
