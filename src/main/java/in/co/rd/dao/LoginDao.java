package in.co.rd.dao;

import java.util.List;

import in.co.rd.beans.Credentials;

public interface LoginDao {
	
	public List<Credentials> fetchCredentials(Credentials credentials );

}
