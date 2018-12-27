package com.greenfoxacademy.springstart.services;


import com.greenfoxacademy.springstart.models.Url;
import com.greenfoxacademy.springstart.repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlService {

    private UrlRepository urlRepository;


    @Autowired
    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public void addUrl(Url urlNew) {
        urlRepository.save(urlNew);
    }

    public void setSecretCode(Url urlNew) {
        String secretCode = "";
        for (int i = 0; i < 4; i++) {
            secretCode += (int) (Math.random() * 10);
        }
        urlNew.setSecretCode(secretCode);
    }

    public List<Url> getAllUrls() {
        return urlRepository.findAll();
    }


    public void deleteAll() {
        urlRepository.deleteAll();
    }

    public boolean ifUrlAllowed(Url url) {
        for (Url urlCurrent : urlRepository.findAll()) {
            if(urlCurrent.getAlias().equals(url.getAlias())) {
                return false;
            }
        }
        return true;
    }

    public Url findByAlias(String alias) {
       return urlRepository.findByAlias(alias);
    }

    public void addHitCount(Url url) {
        url.setHitCount(url.getHitCount() + 1);
    }


    public void setUser(Object newUserUrl) {

    }
}
