package org.example.controller;

import org.example.bl.InfluencerService;
import org.example.controller.model.Influencer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/influencers")
public class InfluencerController {

    @Autowired
    InfluencerService influencerService;

    @GetMapping("")
    public List<Influencer> getAll() {
        return influencerService.getAll();
    }

    @GetMapping("/{influencerId}")
    public Influencer getById(@PathVariable(name = "influencerId") Long influencerId) {
        return influencerService.getById(influencerId);
    }

    @PostMapping("/")
    public Influencer createInfluencer(@RequestBody Influencer influencer) {
        return influencerService.create(influencer);
    }

    @PutMapping("/{influencerId}")
    public Influencer updateInfluencer(@RequestBody Influencer influencer, @PathVariable(name = "influencerId") Long influencerId) {
        influencer.setId(influencerId);
        return influencerService.update(influencer);
    }

    @DeleteMapping("/{influencerId}")
    public ResponseEntity<Object> deleteInfluencer(@PathVariable(name = "influencerId") Long influencerId) {
        influencerService.delete(influencerId);
        return ResponseEntity.noContent().build();
    }
}
