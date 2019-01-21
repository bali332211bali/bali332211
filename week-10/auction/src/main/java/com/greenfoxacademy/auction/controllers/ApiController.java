package com.greenfoxacademy.auction.controllers;

import com.greenfoxacademy.auction.models.Auction;
import com.greenfoxacademy.auction.services.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    private AuctionService auctionService;

    @Autowired
    public ApiController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    @GetMapping("/api/items")
    public List<Auction> auctions() {
        return auctionService.getAll();
    }

}
