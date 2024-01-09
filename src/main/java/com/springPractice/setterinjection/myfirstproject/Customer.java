package com.springPractice.setterinjection.myfirstproject;

/* maven is a build tool or powerful project management tool which is used to avoid or overcome difficulties
 
 in  building projects with jar-setting or configuartions,build and deploying projects,project strudture maintance
 
 maven is based on project object model(it is an xml file which contains information and configuartions
 
 details about building project)
 
 
What is Build Tool
 
A build tool takes care of everything for building a process. It does following:

Generates source code (if auto-generated code is used)

Generates documentation from source code

Compiles source code

Packages compiled code into JAR of ZIP file

Installs the packaged code in local repository, server repository, or central repository
 
*/


/* dependency injection means wiring or connecting objects by following a specific pattern 

to avoid tightly coupling.

if tightly coupling exists between objects then object dependency exists then performance reduces,

maintainbility of application is reduced.

Ex: mobile class accepts one company sim only at run time

so we dependency injection is usen.it is 2 ways 

1.by setter injection(by methods)

2.by contructor injection(by constructor)
 
*/
public class Customer {
	
	//if class variables or attributes are private then they can't accessed at other classes.
	
	private String name;
	private String contact;
	private String address;

	//shortcut source->generate setter,getter
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName()
	{
		return name;
	}

	
	
}
