package FileHandling;

public class Finalizemethod {

	public static void main(String[] args) {
		/*garbage collector calls the finalize fun in the class to free the external resources like 
		 * printing work and other database work and it will call by the garbage collector by itself 
		 * after calling finalize gc freed the memory of the object 
		 * if there is no finalize fun in class then gc calls the finalize of super Object class
		 * because object class is the super class of all the classes and there is a finalize fun 
		 * described in object class
		 * 
		 *   finalize fun is only call by gc
		 *   if your class inherited some other class then gc will call the finalize of the child class
		 *   only if you want to call the finalize of super than you have to call it explicitly by mentioning it 
		 *   in the finalize of the childe class
		 *   ex ->
		 *   finalize()
		 *   {
		 *      super finalize();
		 *   }*/

	}

}
