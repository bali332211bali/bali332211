package com.greenfoxacademy.auctions.services;

import com.greenfoxacademy.auctions.models.Auction;
import com.greenfoxacademy.auctions.models.Bid;
import com.greenfoxacademy.auctions.repositories.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidServiceImpl implements BidService {

    private BidRepository bidRepository;

    @Autowired
    public BidServiceImpl(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    @Override
    public void saveBid(Bid bid) {
        bidRepository.save(bid);
    }

    @Override
    public void setAuctionForBid(Auction auction, Bid bid) {
        bid.setAuction(auction);
    }
}
