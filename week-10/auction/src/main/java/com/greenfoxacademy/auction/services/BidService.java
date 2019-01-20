package com.greenfoxacademy.auction.services;

import com.greenfoxacademy.auction.models.Auction;
import com.greenfoxacademy.auction.models.Bid;

public interface BidService {

    void saveBid(Bid bid);

    void setAuctionForBid(Auction auction, Bid bid);


}
