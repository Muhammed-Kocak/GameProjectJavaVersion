package Business.Concrete;

import Business.Abstract.GamerValidationService;
import Entities.Concrete.Gamer;

public class eStateManager implements GamerValidationService	 {

	@Override
	public boolean validate(Gamer gamer) {
        if(gamer.getFirstName().toLowerCase() == "Muhammed".toLowerCase() &&
                gamer.getId()== 1 &&
                gamer.getBirthYear()==2021 &&
                gamer.getNationalityNumber() =="1234567890" &&
                gamer.getLastName().toLowerCase() == "KOÇAK".toLowerCase())
        {return true;}
        
        return false;
    }
}
