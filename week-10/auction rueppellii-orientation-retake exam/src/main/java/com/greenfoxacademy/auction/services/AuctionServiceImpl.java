package com.greenfoxacademy.auction.services;

import com.greenfoxacademy.auction.models.Auction;
import com.greenfoxacademy.auction.models.Bid;
import com.greenfoxacademy.auction.repositories.AuctionRepository;
import com.greenfoxacademy.auction.repositories.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuctionServiceImpl implements AuctionService {

    private AuctionRepository auctionRepository;
    private BidRepository bidRepository;

    @Autowired
    public AuctionServiceImpl(AuctionRepository auctionRepository, BidRepository bidRepository) {
        this.auctionRepository = auctionRepository;
        this.bidRepository = bidRepository;
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

        List<Bid> bidsOfAuction = bidRepository.findAllByAuction(auction);

        if(bidsOfAuction.size() >= 1) {
            bidsOfAuction.forEach(s-> bidamounts.add(s.getAmount()));
            return bidamounts.stream().sorted().collect(Collectors.toList()).get(bidamounts.size() - 1);
        }
        return 0;
    }

//    @Override
//    public void addBidToBidsForAuction(Bid bid, Auction auction) {
//        List<Bid> bids = bidRepository.findAllByAuction(auction);
//        bids.add(bid);
//        auction.setBids(bids);
//    }
}
