/**
 * 
 */
package com.example.suman.springbootrulebook.rules;

import com.deliveredtechnologies.rulebook.lang.RuleBuilder;
import com.deliveredtechnologies.rulebook.model.rulechain.cor.CoRRuleBook;
import com.deliveredtechnologies.rulebook.spring.RuleBean;

/**
 * @author samasu5
 *
 */
@RuleBean
public class MilestoneRuleBook extends CoRRuleBook<String> {

	
	  /* (non-Javadoc)
	 * @see com.deliveredtechnologies.rulebook.model.RuleBook#defineRules()
	 */
	@Override
	public void defineRules() {
		
		 addRule(RuleBuilder.create().withResultType(String.class)
			      .when(facts ->
			        facts.getStrVal("productType").equalsIgnoreCase("TLS") &&
			        facts.getStrVal("majorMilestone").equalsIgnoreCase("Acceptance"))
			      .then((facts, result) -> result.setValue("Order Accepted|Order Verified"))
			      .build());
		 
		 addRule(RuleBuilder.create().withResultType(String.class)
			      .when(facts ->
			        facts.getStrVal("productType").equalsIgnoreCase("TLS") &&
			        facts.getStrVal("majorMilestone").equalsIgnoreCase("Network Evaluation"))
			      .then((facts, result) -> result.setValue("Site Survey|Customer Ready Date"))
			      .build());
		 
		 addRule(RuleBuilder.create().withResultType(String.class)
			      .when(facts ->
			        facts.getStrVal("productType").equalsIgnoreCase("TLS") &&
			        facts.getStrVal("majorMilestone").equalsIgnoreCase("Confirmation"))
			      .then((facts, result) -> result.setValue("Order Confirmation"))
			      .build());
		 
		 addRule(RuleBuilder.create().withResultType(String.class)
			      .when(facts ->
			        facts.getStrVal("productType").equalsIgnoreCase("TLS") &&
			        facts.getStrVal("majorMilestone").equalsIgnoreCase("Build"))
			      .then((facts, result) -> result.setValue("Engineering|Customer Ready Details|Construction"))
			      .build());
		 
		 addRule(RuleBuilder.create().withResultType(String.class)
			      .when(facts ->
			        facts.getStrVal("productType").equalsIgnoreCase("TLS") &&
			        facts.getStrVal("majorMilestone").equalsIgnoreCase("Provisioning"))
			      .then((facts, result) -> result.setValue("Design|Provisioning Ready|Dispatch|Test & Turnup"))
			      .build());
		 
		 addRule(RuleBuilder.create().withResultType(String.class)
			      .when(facts ->
			        facts.getStrVal("productType").equalsIgnoreCase("TLS") &&
			        facts.getStrVal("majorMilestone").equalsIgnoreCase("Completion"))
			      .then((facts, result) -> result.setValue("LOA/DEMARC Available|Billing Complete"))
			      .build());
		 
		 addRule(RuleBuilder.create().withResultType(String.class)
			      .when(facts ->
			        facts.getStrVal("productType").equalsIgnoreCase("EVPL") &&
			        facts.getStrVal("majorMilestone").equalsIgnoreCase("Acceptance"))
			      .then((facts, result) -> result.setValue("Order Accepted"))
			      .build());
	}

}
