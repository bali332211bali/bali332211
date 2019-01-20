package com.greenfoxacademy.auction.services;

import com.greenfoxacademy.auction.models.Auction;
import com.greenfoxacademy.auction.models.Bid;
import com.greenfoxacademy.auction.repositories.AuctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class AuctionServiceImpl implements AuctionService {

    private AuctionRepository auctionRepository;

    @Autowired
    public AuctionServiceImpl(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    @Override
    public void saveAuction(Auction auction) {
        auctionRepository.save(auction);
    }

    @Override
    public Auction getById(long id) {
        return auctionRepository.findById(id);
    }

    @Override
    public List<Auction> getAll() {
        return auctionRepository.findAll();
    }

    @Override
    public int getHighestBid(Auction auction) {
        List<Integer> bidamounts = new ArrayList<>();

        if(auction.getBids().size() >= 1) {
            auction.getBids().forEach(s-> bidamounts.add(s.getAmount()));
            return bidamounts.stream().sorted().collect(Collectors.toList()).get(bidamounts.size() - 1);
        }
        return 0;
    }

    @Override
    public void addBidToBidsForAuction(Bid bid, Auction auction) {
        List<Bid> bids = auction.getBids();
        bids.add(bid);
        auction.setBids(bids);
    }
}
