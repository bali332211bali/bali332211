package com.greenfoxacademy.auction.controllers;

import com.greenfoxacademy.auction.models.Auction;
import com.greenfoxacademy.auction.models.Bid;
import com.greenfoxacademy.auction.services.AuctionService;
import com.greenfoxacademy.auction.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class BidController {

    private BidService bidService;
    private AuctionService auctionService;

    @Autowired
    public BidController(BidService bidService, AuctionService auctionService) {
        this.bidService = bidService;
        this.auctionService = auctionService;
    }

    @ModelAttribute(value = "belowHighestBid")
    public boolean belowHighestBid() {
        return false;
    }

    @PostMapping("/{id}")
    public String auctionById(@ModelAttribute(value = "bidNew") Bid bidNew,
                              RedirectAttributes redirectAttributes,
                              @PathVariable(value = "id") long id,
                              HttpSession session,
                              Model model) {

        Auction auctionById = auctionService.getById(id);
        redirectAttributes.addAttribute("auctionId", id);

        if (bidNew.getAmount() < auctionService.getHighestBid(auctionById)) {
            redirectAttributes.addFlashAttribute("belowHighestBid", true);
            session.setAttribute("bidBelowHighestBid", bidNew);
            return "redirect:/{auctionId}";
        }

        if (auctionById.getExpiryDate().compareTo(new Date()) < 0) {
            return "redirect:/{auctionId}";
        }

        bidService.setAuctionForBid(auctionById, bidNew);
        bidService.saveBid(bidNew);
//        auctionService.addBidToBidsForAuction(bidNew, auctionById);
        auctionService.saveAuction(auctionById);
        return "redirect:/{auctionId}";
    }
}
