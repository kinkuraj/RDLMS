package in.co.rd.biz;

import in.co.rd.beans.Credentials;
import in.co.rd.beans.Result;

public interface LoginService {
	
	public Result login(Credentials credentials);
	
	public Result logout(Credentials credentials);

}
