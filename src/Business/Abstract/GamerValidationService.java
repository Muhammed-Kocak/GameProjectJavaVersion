package Business.Abstract;

import Entities.Concrete.Gamer;

public interface GamerValidationService {
	
	boolean validate(Gamer gamer);
}
