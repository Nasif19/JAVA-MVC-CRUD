package pg.Models;

import java.math.BigInteger;

public class User {
	private BigInteger id;
	private String name;
	private String email;
	private String password;
	private String status;
	private int is_delete;
	
	public BigInteger getUserId()
	{
		return id;
	}
	public void setUserId(BigInteger id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public int getIsDelete()
	{
		return is_delete;
	}
	public void setIsDelete(int is_delete)
	{
		this.is_delete = is_delete;
	}
	
	@Override
	public String toString()
	{
		return "User[id="+id+",name="+name+",email="+email+",password="+password+", status="+status+"]";
	}
}
