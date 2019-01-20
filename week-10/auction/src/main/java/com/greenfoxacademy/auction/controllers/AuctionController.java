package com.greenfoxacademy.auction.controllers;


import com.greenfoxacademy.auction.models.Auction;
import com.greenfoxacademy.auction.services.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AuctionController {

    private AuctionService auctionService;

    @Autowired
    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    @GetMapping("/")
    public String auctions(@ModelAttribute(value = "auctionNew")Auction auctionNew,
                           Model model) {
        model.addAttribute("auctions", auctionService.getAll());
        return "auctions";
    }

    @GetMapping("/{id}")
    public String auctionById(@PathVariable(value = "id") long id,
                              Model model) {

        model.addAttribute("auctionById", auctionService.getById(id));




        return "auctionById";
    }


}
