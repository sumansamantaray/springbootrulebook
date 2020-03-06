/**
 * 
 */
package com.example.suman.springbootrulebook.service;

import org.springframework.stereotype.Component;

import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.Result;
import com.deliveredtechnologies.rulebook.lang.RuleBookBuilder;
import com.deliveredtechnologies.rulebook.model.RuleBook;
import com.example.suman.springbootrulebook.rules.MilestoneRuleBook;

/**
 * @author samasu5
 *
 */
@Component
public class MilestoneRuleEngineService {

	  public String runMilestoneRuleEngine(String productType, String majorMilestoneName) {
		  RuleBook<String> milestoneRuleBook = RuleBookBuilder.create(MilestoneRuleBook.class).withResultType(String.class)
				  .withDefaultResult("")
			      .build();
		  
		  NameValueReferableMap<String> facts = new FactMap<>();
		    facts.setValue("productType", productType);
		    facts.setValue("majorMilestone", majorMilestoneName);
		    milestoneRuleBook.run(facts);
		    
		    if (milestoneRuleBook.getResult().isPresent()) {
		        Result<String> result = (Result<String>) milestoneRuleBook.getResult().get();
		        System.out.println("********* "+result.getValue());
		        return result.getValue();
		    }
		  
		  return null;
	  }
}
