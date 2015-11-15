package edu.iut.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.iut.app.ApplicationSession;



// Exercice 2 
public class IUTException {
	public IUTException() {
		super();
		// Logger une erreur avec le message empty en utilisant le singleton session, ie le logger dÃ©fini dans la session */
		ApplicationSession SessionExcept = ApplicationSession.instance();
		SessionExcept.instance().getExceptionLogger().severe("empty");
		
	}
	public IUTException(IUTException e) {
		// Logger une erreur avec le message contenu dans 'e'  en utilisant le singleton session, ie le logger dÃ©fini dans la session */
		ApplicationSession SessionExcept = ApplicationSession.instance();
		SessionExcept.instance().getExceptionLogger().severe(e.toString());
	}
	public IUTException(String message) {
		// Logger une erreur avec le message contenu dans 'message'  en utilisant le singleton session, ie le logger dÃ©fini dans la session */
		ApplicationSession SessionExcept = ApplicationSession.instance();
		SessionExcept.instance().getExceptionLogger().severe(message);
	}
	
}
