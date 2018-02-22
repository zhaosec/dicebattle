import java.io.*;

public class account {
	private String UserID;
	private String UserPW;
	
	protected void setUserID(String ID)
	{ 
		UserID = ID; 
	}
	protected String getUserID()
	{ 
		return UserID;
	}
	protected void SetUserPWD(String PWD)
	{ 
		UserPW = PWD;
	} 
	protected String getUserPWD()
	{ 
		return UserPW;
	}
}
