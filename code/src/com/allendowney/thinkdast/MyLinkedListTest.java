/**
 * 
 */

import java.util.ArrayList;

import org.junit.Before;


/**
 * @author downey
 *
 */
public class MyLinkedListTest extends MyArrayListTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ArrayList list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		MyLinkedList mylist = new MyLinkedList<Integer>();
		mylist.addAll(list);
	}
}
