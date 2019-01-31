package com.greenfoxacademy.auction.services;

import com.greenfoxacademy.auction.models.Auction;
import com.greenfoxacademy.auction.models.Bid;
import com.greenfoxacademy.auction.repositories.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Bid> getAllByAuction(Auction auction) {
        return bidRepository.findAllByAuction(auction);
    }
}
