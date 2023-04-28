package ch.finecloud.spring6reactivemongo.mappers;

import ch.finecloud.spring6reactivemongo.domain.Beer;
import ch.finecloud.spring6reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
