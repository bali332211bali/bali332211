package com.greenfoxacademy.auctions.services;

import com.greenfoxacademy.auctions.models.Auction;
import com.greenfoxacademy.auctions.models.Bid;

public interface BidService {

    void saveBid(Bid bid);

    void setAuctionForBid(Auction auction, Bid bid);

}
