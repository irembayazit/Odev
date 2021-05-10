package Abstract;

import Entities.Campaign;

public interface ICampaignService {
	void Save(Campaign Campaign);
	void Update(Campaign Campaign);
	void Delete(Campaign Campaign);
}
