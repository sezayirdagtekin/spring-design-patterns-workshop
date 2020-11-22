package com.sezayir.demo.singleton;

public class Foo {

	private static Foo instance;

	private Foo() {

	}

	/*
	  
	  Now, below Singleton class is thread safe. Making Singleton thread safe is
	  especially required in multi-threaded application environment 
	 
	  	Foo f1=Foo.getInstace();
		Foo f2 = Foo.getInstace();
		System.out.println(f1.hashCode()==f2.hashCode());
		
	 */

	// make thread safe
	public static Foo getInstace() {
		// Double check locking pattern
		if (null == instance) { // Check for the first time
			synchronized (Foo.class) { // Check for the second time.
				if (null == instance) { // if there is no instance available... create new one
					instance = new Foo();
				}
			}

		}
		return instance;
	}

}
