package com.greenfoxacademy.auction.repositories;

import com.greenfoxacademy.auction.models.Auction;
import com.greenfoxacademy.auction.models.Bid;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BidRepository extends CrudRepository<Bid, Long> {

    List<Bid> findAllByAuction(Auction auction);

}
