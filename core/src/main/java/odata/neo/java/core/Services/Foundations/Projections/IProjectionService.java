package odata.neo.java.core.Services.Foundations.Projections;

import java.util.Arrays;
import java.util.function.Predicate;

import odata.neo.java.core.Models.ProjectedTokens.ProjectedToken;
import odata.neo.java.core.Models.ProjectedTokens.Exceptions.FailedProjectedTokenServiceException;
import odata.neo.java.core.Models.ProjectedTokens.Exceptions.InvalidProjectedTokenRawValueException;
import odata.neo.java.core.Models.ProjectedTokens.Exceptions.NullProjectedTokenException;

public abstract class IProjectionService {

    public abstract ProjectedToken[] projectTokens(ProjectedToken[] projectedTokens) throws FailedProjectedTokenServiceException;

    public void validateProjectedTokens(ProjectedToken[] projectedTokens) throws NullProjectedTokenException, InvalidProjectedTokenRawValueException {

        Predicate<ProjectedToken> hasRawValueNullOrEmpty = token -> token.getRawValue() == null || token.getRawValue().isEmpty();
       
        if (projectedTokens == null) {

            throw new NullProjectedTokenException("Projected token is null");
        
        } else if (Arrays.asList(projectedTokens).contains(null)) {

            throw new NullProjectedTokenException("Projected token is null");

        } else if (Arrays.stream(projectedTokens).anyMatch(hasRawValueNullOrEmpty)) {
            throw new InvalidProjectedTokenRawValueException("Invalid projected token raw value error occurred, please fix the error and try again.");

        }
    }

}    