/**
 *
 */
package udea;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author ciroa
 *
 */
public class ColeccionesMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> estudiantesMap = new HashMap<>();
		TreeMap<Integer, String> estudiantesTree = new TreeMap<>();
		LinkedHashMap<Integer, String> estudiantesLinked = new LinkedHashMap<>();

		estudiantesMap.put(3, "Pedro");
		estudiantesMap.put(5, "Pepito");
		estudiantesMap.put(1, "Lina");
		estudiantesMap.put(4, "Esgar");

		Iterator it = estudiantesMap.keySet().iterator();
		while (it.hasNext()) {
			int actualId = (Integer) it.next();
			System.out.println(estudiantesMap.get(actualId));
		}

		estudiantesTree.put(3, "Pedro");
		estudiantesTree.put(5, "Pepito");
		estudiantesTree.put(1, "Lina");
		estudiantesTree.put(4, "Esgar");

		Iterator it2 = estudiantesTree.keySet().iterator();
		while (it2.hasNext()) {
			int actualId = (Integer) it2.next();
			System.out.println(estudiantesTree.get(actualId));
		}

		estudiantesLinked.put(3, "Pedro");
		estudiantesLinked.put(5, "Pepito");
		estudiantesLinked.put(1, "Lina");
		estudiantesLinked.put(4, "Esgar");

		Iterator it3 = estudiantesLinked.keySet().iterator();
		while (it3.hasNext()) {
			int actualId = (Integer) it3.next();
			System.out.println(estudiantesLinked.get(actualId));
		}

	}

}
