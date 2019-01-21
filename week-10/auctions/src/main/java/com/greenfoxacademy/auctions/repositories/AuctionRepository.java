package com.greenfoxacademy.auctions.repositories;

import com.greenfoxacademy.auctions.models.Auction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuctionRepository extends CrudRepository<Auction, Long> {

    List<Auction> findAll();
    
    Auction findById(long id);

}
