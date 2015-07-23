import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;

public class Registration {

	@Produces
	@FlowDefinition
	public Flow defineRegistrationFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
		flowBuilder.id("", "registration");
		flowBuilder.returnNode("exitRegistration").fromOutcome("/index.xhtml");
		
		return flowBuilder.getFlow();
	}
	
}
