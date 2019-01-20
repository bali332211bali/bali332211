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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
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

    @ModelAttribute(value = "belowHighestBid")
    public boolean belowHighestBid() {
        return false;
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
                              RedirectAttributes redirectAttributes,
                              HttpSession session) {

        Auction auctionById = auctionService.getById(id);

        model.addAttribute("auctionById", auctionById);
        model.addAttribute("highestBidAmount", auctionService.getHighestBid(auctionById));

        if (auctionById.getExpiryDate().compareTo(new Date()) > 0) {
            model.addAttribute("auctionAvailable", false);
        }

        if (session.getAttribute("bidBelowHighestBid") != null) {
            Bid bidBelowHighestBid = (Bid) session.getAttribute("bidBelowHighestBid");

            bidNew.setAmount(bidBelowHighestBid.getAmount());
            bidNew.setName(bidBelowHighestBid.getName());

            redirectAttributes.addAttribute("id", id);
            return "redirect:/{id}";
        }

        return "auctionById";
    }

    @PostMapping("/auctionNew")
    public String auctionNew(@ModelAttribute(value = "auctionNew") Auction auctionNew) {

        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
//    c.add(Calendar.YEAR, 1);
//    c.add(Calendar.MONTH, 1);
//    c.add(Calendar.DATE, 1);
//    c.add(Calendar.HOUR, 1);
        c.add(Calendar.MINUTE, 1);
        c.add(Calendar.SECOND, 1);
        Date currentDatePlusOne = c.getTime();

        auctionNew.setExpiryDate(currentDatePlusOne);
        auctionService.saveAuction(auctionNew);
        return "redirect:/";
    }

}
