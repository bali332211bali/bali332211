package com.greenfoxacademy.auction.services;

import com.greenfoxacademy.auction.models.Auction;
import com.greenfoxacademy.auction.models.Bid;

import java.util.List;

public interface BidService {

    void saveBid(Bid bid);

    void setAuctionForBid(Auction auction, Bid bid);

    List<Bid> getAllByAuction(Auction auction);

}
