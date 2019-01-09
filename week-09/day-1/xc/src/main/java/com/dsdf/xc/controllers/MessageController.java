package com.dsdf.xc.controllers;

import com.dsdf.xc.models.User;
import com.dsdf.xc.models.Message;
import com.dsdf.xc.services.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/messages")
public class MessageController {

  private MessageServiceImpl messageServiceImpl;

  @Autowired
  public MessageController(MessageServiceImpl messageServiceImpl) {
    this.messageServiceImpl = messageServiceImpl;
  }

  @GetMapping("")
  public String messages(HttpSession session,
                   Model model,
                   @ModelAttribute(value = "messageNew") Message messageNew,
                   @RequestParam(value = "searchString", required = false) String search) {
//                     @RequestParam(value = "page", required = false) Integer pageNumber) {

    if(session.getAttribute("userCurrent") == null) {
      return "redirect:/messages/register";
    }

    User userCurrent = (User) session.getAttribute("userCurrent");
    model.addAttribute("userCurrentUsername", userCurrent.getUsername());
    model.addAttribute("userCurrentId", userCurrent.getId());
    model.addAttribute("messages", messageServiceImpl.getAllByUserAndNameContaining(userCurrent, search));

//        model.addAttribute("messages", messageServiceImpl.getAllByUserAndNameContainingOnPage(userCurrent, search, pageNumber));
//        model.addAttribute("pages", messageServiceImpl.getPagesByUser(userCurrent));

    if (session.getAttribute("messageTaken") != null) {
      Message messageTaken = (Message) session.getAttribute("messageTaken");
      messageNew.setName(messageTaken.getName());
      messageNew.setText(messageTaken.getText());
      session.removeAttribute("messageTaken");
    }

    User messageUser = (User) session.getAttribute("userCurrent");
    messageNew.setName(messageUser.getUsername());

    return "messages";
  }

  @PostMapping("")
  public String xs(@ModelAttribute("messageNew") Message messageNew,
                   RedirectAttributes redirectAttributes,
                   HttpSession session) {

//    if (!messageServiceImpl.isMessageNameAllowed(messageNew.getName())) {
//      redirectAttributes.addFlashAttribute("messageNameTaken", true);
//      session.setAttribute("messageTaken", messageNew);
//      return "redirect:/messages";
//    }
    messageServiceImpl.setUser(messageNew, (User) session.getAttribute("userCurrent"));
    messageServiceImpl.addMessage(messageNew);
    redirectAttributes.addFlashAttribute("messageNameTaken", false);
    redirectAttributes.addFlashAttribute("messageNewName", messageNew.getName());
    redirectAttributes.addFlashAttribute("messageNewText", messageNew.getText());
    return "redirect:/messages";
  }

  @GetMapping("/deleteAll")
  public String deleteAll() {
    messageServiceImpl.deleteAll();
    return "redirect:/messages";
  }

  @GetMapping("/delete")
  public String delete(@RequestParam(value = "id") long messageId) {
    messageServiceImpl.deleteById(messageId);
    return "redirect:/messages";
  }

  @GetMapping("/{id}/edit")
  public String edit(@PathVariable(value = "id") long id, Model model) {
    model.addAttribute("messageEdit", messageServiceImpl.getById(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@ModelAttribute(value = "messageEdit") Message messageDone, HttpSession session) {
    messageServiceImpl.setUser(messageDone, (User) session.getAttribute("userCurrent"));
    messageServiceImpl.addMessage(messageDone);
    return "redirect:/messages";
  }


}
