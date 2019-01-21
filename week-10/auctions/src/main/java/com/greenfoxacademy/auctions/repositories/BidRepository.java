package com.greenfoxacademy.auctions.repositories;

import com.greenfoxacademy.auctions.models.Bid;
import org.springframework.data.repository.CrudRepository;

public interface BidRepository extends CrudRepository<Bid, Long> {

}
