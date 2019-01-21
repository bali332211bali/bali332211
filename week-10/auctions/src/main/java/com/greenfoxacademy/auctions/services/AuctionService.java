package com.greenfoxacademy.auctions.services;

import com.greenfoxacademy.auctions.models.Auction;
import com.greenfoxacademy.auctions.models.Bid;

import java.util.List;

public interface AuctionService {

    void saveAuction(Auction auction);

    Auction getById(long id);

    List<Auction> getAll();

    int getHighestBid(Auction auction);

    void addBidToBidsForAuction(Bid bid, Auction auction);

}
