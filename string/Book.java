package string;

import java.util.Objects;

public class Book implements comparable
{
	String bname;
	int id;
	
	Book (String bname,int id)
	{
		this.bname=bname;
		this.id=id;
	}
	
	public String toString()
	{
		return "Book Name: "+bname+" Boook ID: "+id;
	}
	public boolean equals(Object o)
	{
		Book b1=(Book )o;
		return this.bname.equals(b1.bname)&&this.id==id;
	}
	public int hashcode()
	{
		return Objects.hash(bname,id);
	}
	public int compareTo(Object o)
	{
		Book b1=(Book)o;
		if(this.id==b1.id)
		{
			return 0;
		}
		//return this.bname.compareTo(b1.bname);
		else if(this.id>b1.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
