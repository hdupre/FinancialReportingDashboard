package com.finrepdashboard.finrepdashboard.controller;

import com.finrepdashboard.finrepdashboard.model.LoadResult;
import com.finrepdashboard.finrepdashboard.service.LoadJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rst")
public class LoadJsonController {

    @Autowired
    private LoadJsonService loadJsonService;

    @GetMapping
    public String test() {return "Hello Fin Rep App";}

    @GetMapping(value = "/loadJson")
    public LoadResult loadAllJson() {

        try {
            loadJsonService.loadAllJson();
            return new LoadResult(LoadResult.STAT_SUCCESS);
        } catch (LoadJsonException e) {
            return new LoadResult(LoadResult.STAT_WARNING);
        } catch (Exception e) {
            return new LoadResult(LoadResult.STAT_FAILURE, e.getMessage())
        }
    }
}
