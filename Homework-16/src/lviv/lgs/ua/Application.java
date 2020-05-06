package lviv.lgs.ua;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Application {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Class pc = Town.class;

		String simpleName = pc.getSimpleName();
		System.out.println("Name of class  =  " + simpleName);

		System.out.println();

		int modifier = pc.getModifiers();
		String modifierText = Modifier.toString(modifier);

		System.out.println("Class modifier = " + modifierText + " int = " + modifier);
		System.out.println("Is our class private? ---> " + Modifier.isPrivate(modifier));
		System.out.println("Is our class abstract? ---> " + Modifier.isAbstract(modifier));
		System.out.println("Is our class protected? ---> " + Modifier.isProtected(modifier));
		System.out.println("Is our class static? ---> " + Modifier.isStatic(modifier));
		System.out.println("Is our class public? ---> " + Modifier.isPublic(modifier));

		System.out.println();

		Package packageTownClass = pc.getPackage();
		System.out.println("The package of our class ---> " + packageTownClass);

		System.out.println();

		Class superClass = pc.getSuperclass();
		System.out.println("The superclass of the class Town ---> " + superClass);

		System.out.println();

		Class[] interfaces = pc.getInterfaces();

		System.out.print("The interfaces our class implements ---> ");
		for (int i = 0; i < interfaces.length; i++) {
			System.out.print(interfaces[i]);
		}

		System.out.println();

		Constructor<Town>[] townConstructors = pc.getConstructors();
		System.out.println("The constructors of our class: ");
		for (int i = 0; i < townConstructors.length; i++) {
			System.out.println(townConstructors[i]);
		}

		System.out.println("The number of constructors of the University class ---> " + townConstructors.length);

		System.out.println();

		Constructor<Town> constructor1 = townConstructors[0];
		Class<?>[] parameterTypes1 = constructor1.getParameterTypes();
		System.out.print("The parameters of our first constructor ---> ");
		for (int i = 0; i < parameterTypes1.length; i++) {
			System.out.print(parameterTypes1[i] + " ");
		}

		System.out.println();

		Constructor<Town> constructor2 = townConstructors[1];
		Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
		System.out.print("The parameters of our second constructor ---> ");
		for (int i = 0; i < parameterTypes2.length; i++) {
			System.out.print(parameterTypes2[i] + " ");
		}

		System.out.println();

		Constructor<Town> constructor3 = townConstructors[2];
		Class<?>[] parameterTypes3 = constructor3.getParameterTypes();
		System.out.print("The parameters of our third constructor ---> ");
		for (int i = 0; i < parameterTypes3.length; i++) {
			System.out.print(parameterTypes3[i] + " ");
		}

		System.out.println();
		System.out.println();

		Constructor<Town> newConstructor = pc.getConstructor(String.class, int.class, double.class, String.class);
		System.out.println("Our object before editing: " + newConstructor);
		Town newTown = newConstructor.newInstance("Ivano-Frankivsk", 236602, 120.73, "Stanislaviv");
		System.out.println("Our object after editing: " + newTown);

		System.out.println();

		Field[] fields = pc.getFields();
		System.out.println("Public fields of our class: ");
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}

		System.out.println();

		Field[] allFields = pc.getDeclaredFields();
		System.out.println("All the fields of our class: ");
		for (int i = 0; i < allFields.length; i++) {
			System.out.println(allFields[i]);
		}

		System.out.println();

		System.out.println("The methods of our class: ");
		Method[] methods = pc.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}

		System.out.println();

		Field nameField = pc.getField("name");
		nameField.set(newTown, "Lviv");

		Field nameField2 = pc.getField("inhabitants");
		nameField2.set(newTown, 724713);

		Field nameField3 = pc.getField("area");
		nameField3.set(newTown, 192.01);

		Field nameField4 = pc.getField("otherName");
		nameField4.set(newTown, "Lwihorod");

		System.out.println("Class Town after changing ---> " + newTown);

	}
}
