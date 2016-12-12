package tn.enis.validator;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("prodValidate")
public class ProdValidate  implements Validator{
	private static final Pattern PATTERN_INTEGER = Pattern.compile("[0-9]+");
	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value) {
		if(value.toString().equals("")){
			FacesMessage msg = new FacesMessage("merci d'ecrire la quantite en stock du produit ! ") ; 
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg); 
		}
		if( ! PATTERN_INTEGER.matcher(value.toString()).matches()){
			FacesMessage msg = new FacesMessage("la qauntite doit etre  alphanumeric  ! ") ; 
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg); 
		}
		
		
	}

}
