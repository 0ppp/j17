import java.io.*;

abstract class staff
{
	String name;
	String address;
	
	public staff()
	{
	name="";
	address="";	
	}
		
	public staff(String xname,String xaddress)
	{
	name=xname;
	address=xaddress;	
	}
		
	void accept() throws IOException
	{
		 	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name");
			 name=br.readLine();
			System.out.println("Enter Address");
			 address= br.readLine();
	}	
		
		void display() throws IOException
	{
		 
			System.out.println("name: "+name);
			System.out.println("address: "+address);
	}
		
}

class fulltimestaff extends staff
{
	String dept;
	double salary;
	public fulltimestaff()
	{
		super();
		dept="";
		salary=0;
	}
	public fulltimestaff(String xtname,String xtaddress,	String xtdept,	double xtsalary)
	{
		super(xtname,xtaddress);
		dept=xtdept;
		salary=xtsalary;
		
	}
		void accept() throws IOException
	{
		super.accept();
		 	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter dept");
			 dept=br.readLine();
			System.out.println("Enter salary");
			 salary= Double.parseDouble(br.readLine());
	}	
		
		void display() throws IOException
	{
		 super.display();
			System.out.println("dept: "+dept);
			System.out.println("salary: "+salary);
	}
	
	
}

class parttimestaff extends staff
{
	int no_of_hours;
	double rate_per_hour;
	public parttimestaff()
	{
		
	}
	public parttimestaff(String xtname,String xtaddress,	int xtno_of_hours,	double xtrate_per_hour)
	{
		super(xtname,xtaddress);	
			no_of_hours=xtno_of_hours;
				rate_per_hour=xtrate_per_hour;
	}
	
		void accept() throws IOException
	{
		super.accept();
		 	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter no_of_hours");
			 no_of_hours=Integer.parseInt(br.readLine());
			System.out.println("Enter rate_per_hour");
			 rate_per_hour= Double.parseDouble(br.readLine());
	}	
		
		void display() throws IOException
	{
		 super.display();
			System.out.println("no_of_hours: "+no_of_hours);
			System.out.println("rate_per_hour: "+rate_per_hour);
	}
}


class s17_1
{
	
	public static void main(String []args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

			
			System.out.println("Enter n");
			int n=Integer.parseInt(br.readLine());
			int ptr1=0; int ptr2=0;
			fulltimestaff obj1[]= new fulltimestaff[n];
			parttimestaff obj2[]= new parttimestaff[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("1. Full time ");
				System.out.println("2. Part time ");
			int ch=Integer.parseInt(br.readLine());
				switch(ch)
				{
					
					case 1: 
							obj1[ptr1]= new fulltimestaff();
					    	obj1[ptr1].accept(); 
					    		ptr1++;
					     	break;
					case 2:
							obj2[ptr2]= new parttimestaff();
					    	obj2[ptr2].accept(); 
					    		ptr2++;
					     	break;
					
				}
			
		}
		System.out.println("Accepted Successfully....");
		System.out.println("Now Displaying ...");
		System.out.println("_____________");
		
		System.out.println("==============> Full time");
		
		for(int i=0;i<ptr1;i++)
		{  System.out.println("_____________");
			obj1[i].display();
			System.out.println("_____________");
		}
		
		System.out.println("===============> Part tim");
			
		for(int i=0;i<ptr2;i++)
		{
		System.out.println("_____________");
		obj2[i].display();
		System.out.println("_____________");	
		}
			
	
		
	}
	
	
}