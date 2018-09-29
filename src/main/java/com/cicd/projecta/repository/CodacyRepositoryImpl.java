/**
 * 
 */
package com.cicd.projecta.repository;

import com.cicd.projecta.config.IntegrationConfig;

/**
 * @author jw1121
 *
 */
public class CodacyRepositoryImpl implements SourceQuality {

	private RestTemplateBuilder restTemplateBuilder;
	private IntegrationConfig integrationConfig;
	private static HttpEntity entity;
	
	@Autowired
	  PivotalTrackerRepositoryImpl(IntegrationConfig integrationConfig, RestTemplateBuilder restTemplateBuilder) {
	    this.integrationConfig = integrationConfig;
	    this.restTemplateBuilder = restTemplateBuilder;

	    init();
	  }
	
	private void init() {
		HttpHeaders headers = new HttpHeaders();
	    headers.set("api_token", integrationConfig.getCodacy().getKey());
	    entity = new HttpEntity(headers);
	}
	
	@Override
	public void authenticate() {
		// TODO Auto-generated method stub

	}

	public void getIssues() {
		// TODO get /2.0/commit/{commitUuid}/issueBreakdown 
	}
}
