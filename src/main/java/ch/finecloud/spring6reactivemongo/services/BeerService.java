package ch.finecloud.spring6reactivemongo.services;

import ch.finecloud.spring6reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

public interface BeerService {
    Mono<BeerDTO> saveBeer(BeerDTO beerDto);

    Mono<BeerDTO> getById(String beerId);
}
