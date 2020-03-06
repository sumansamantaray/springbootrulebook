/**
 * 
 */
package com.example.suman.springbootrulebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.suman.springbootrulebook.service.MilestoneRuleEngineService;

/**
 * @author samasu5
 *
 */
@RestController
public class RuleBookController {
	
	@Autowired
	MilestoneRuleEngineService milestoneRuleEngineService;
	
	@RequestMapping("/runRule")
    public String excuteMilestoneRuleEngine(@RequestParam(value = "productType") String productType,
			@RequestParam(value = "majorMilestoneName") String milestoneName) {
		String minorMilestones = milestoneRuleEngineService.runMilestoneRuleEngine(productType, milestoneName);
        return minorMilestones;
    }

}
