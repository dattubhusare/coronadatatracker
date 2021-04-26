package com.dattu.controller;

import com.dattu.models.LocationStat;
import com.dattu.service.CoronaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private CoronaDataService coronaDataService;

    @GetMapping("/")
    public String home(Model model)
    {
        List<LocationStat> allStat=coronaDataService.getAllStat();
        int totalCases=allStat.stream().mapToInt(stat->stat.getLatestCases()).sum();
        int totalLastDayCases=allStat.stream().mapToInt(stat->stat.getPreviousDay()).sum();
        int newTotalCasesInDay=totalCases-totalLastDayCases;
        model.addAttribute("locationStats",allStat);
        model.addAttribute("totalCases",totalCases);
        model.addAttribute("totalLastDay",totalLastDayCases);
        model.addAttribute("newTotalCasesInDay",newTotalCasesInDay);
        return "home";
    }
}
