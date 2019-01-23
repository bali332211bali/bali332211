package com.greenfoxacademy.auction.controllers;


import com.greenfoxacademy.auction.models.Auction;
import com.greenfoxacademy.auction.models.Bid;
import com.greenfoxacademy.auction.services.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

@Controller
public class AuctionController {

    private AuctionService auctionService;

    @Autowired
    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    @ModelAttribute(value = "auctionAvailable")
    public boolean auctionAvailable() {
        return true;
    }

    @GetMapping("/")
    public String auctions(@ModelAttribute(value = "auctionNew") Auction auctionNew,
                           Model model) {
        model.addAttribute("auctions", auctionService.getAll());
        return "auctions";
    }

    @GetMapping("/{id}")
    public String auctionById(@PathVariable(value = "id") long id,
                              Model model,
                              @ModelAttribute(value = "bidNew") Bid bidNew,
                              HttpSession session) {

        Auction auctionById = auctionService.getById(id);

        model.addAttribute("auctionById", auctionById);
        model.addAttribute("highestBidAmount", auctionService.getHighestBid(auctionById));

        if (auctionById.getExpiryDate().compareTo(new Date()) < 0) {
            model.addAttribute("auctionAvailable", false);
        } else {
            model.addAttribute("auctionEnds", auctionById.getExpiryDate());
        }

        if (session.getAttribute("bidBelowHighestBid") != null) {
            Bid bidBelowHighestBid = (Bid) session.getAttribute("bidBelowHighestBid");
            bidNew.setName(bidBelowHighestBid.getName());
            bidNew.setAmount(bidBelowHighestBid.getAmount());
            session.removeAttribute("bidBelowHighestBid");
        }

        return "auctionById";
    }

    @PostMapping("/auctionNew")
    public String auctionNew(@ModelAttribute(value = "auctionNew") Auction auctionNew) {

        Instant instant = Instant.now();
        instant = instant.plusSeconds(10);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        zonedDateTime = zonedDateTime.plusMinutes(1);

        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
//    c.add(Calendar.YEAR, 1);
//    c.add(Calendar.MONTH, 1);
//    c.add(Calendar.DATE, 1);
//    c.add(Calendar.HOUR, 1);
//        c.add(Calendar.MINUTE, 1);
        c.add(Calendar.SECOND, 10);
        Date currentDatePlusOne = c.getTime();

        auctionNew.setExpiryDate(Date.from(zonedDateTime.toInstant()));
        auctionService.saveAuction(auctionNew);
        return "redirect:/";
    }

}
