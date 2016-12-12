package tn.enis.validator;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("cinValidator")
public class CinValidator implements Validator{
	private static final Pattern PATTERN_INTEGER = Pattern.compile("[0-9]+");
	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value)  {
		if(value.toString().equals("")){
			FacesMessage msg = new FacesMessage("merci d'ecrire le Cin du client ! ") ; 
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg); 
		}
		if(value.toString().length()!=8){
			FacesMessage msg = new FacesMessage("la taille du cin doit etre  8  ! ") ; 
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg); 
		}
		if( ! PATTERN_INTEGER.matcher(value.toString()).matches()){
			FacesMessage msg = new FacesMessage("la cin doit etre  alphanumeric  ! ") ; 
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg); 
		}
		
		
		
	}

}
