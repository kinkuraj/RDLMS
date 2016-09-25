package in.co.rd.validations;

import in.co.rd.beans.DomainObject;
import in.co.rd.beans.ValidationIssues;

public interface Validate {
	
	public Validate createValidation();
	
	public ValidationIssues validateEntity(DomainObject domainObject);

}
