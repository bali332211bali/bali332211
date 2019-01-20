package com.greenfoxacademy.auction.services;

import com.greenfoxacademy.auction.models.Bid;
import com.greenfoxacademy.auction.repositories.BidRepository;
import org.springframework.stereotype.Service;

@Service
public class BidServiceImpl implements BidService {

    private BidRepository bidRepository;

    public BidServiceImpl(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    @Override
    public void saveBid(Bid bid) {
        bidRepository.save(bid);
    }
}
