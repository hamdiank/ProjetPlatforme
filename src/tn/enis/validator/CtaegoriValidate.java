package tn.enis.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("ctaegoriValidate")
public class CtaegoriValidate implements Validator{

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value) {
		if(value.toString().equals("")){
			FacesMessage msg = new FacesMessage("You have to write Something !") ; 
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
			
		}
		
	}

}
