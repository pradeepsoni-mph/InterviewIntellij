package RTTI;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy
{
	Toy() {}
	Toy(int i) {}
}
class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots
{
	FancyToy()
	{
		super(1);
	}
}

public class ToyTest
{
	static void printInfo(Class cc)
	{
		System.out.println("Class Name:" + cc.getName() +
			"is interface ? [" + cc.isInterface() + "]");

		
		System.out.println("Simple name: " + cc.getSimpleName());
		System.out.println("Canonical name;" + cc.getCanonicalName());
	}
	
	public static void main(String args[])
	{
		Class c = null;
		try
		{
			c = Class.forName("FancyToy");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Can't find fancyToy");
			System.exit(1);
		}
		
		printInfo(c);
		for(Class face : c.getInterfaces())
			printInfo(face);
		Class up = c.getSuperclass();
		Object obj = null;
		try
		{
			obj = up.newInstance();
		}
		catch(InstantiationException e)
		{
			System.out.println("Cannot instantiate");
			System.exit(1);
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}
/**************************OUTPUT**********************************
Class Name:FancyToyis interface ? [false]
Simple name: FancyToy
Canonical name;FancyToy
Class Name:HasBatteriesis interface ? [true]
Simple name: HasBatteries
Canonical name;HasBatteries
Class Name:Waterproofis interface ? [true]
Simple name: Waterproof
Canonical name;Waterproof
Class Name:Shootsis interface ? [true]
Simple name: Shoots
Canonical name;Shoots
Class Name:Toyis interface ? [false]
Simple name: Toy
Canonical name;Toy
********************************************************************/