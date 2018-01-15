package p30;

public class MyLinkedList<T> {

	public class Element<T> {
		public T data;
		public Element next;

		public Element(T data) {
			super();
			this.data = data;
		}
	}

	private Element<T> first;

	public MyLinkedList() {
		first = null;
	}

	public void add(T obj) {
		Element<T> element = new Element(obj);
		element.next = first;
		first = element;
	}

	public boolean find(T obj) {
		Element curr = first;
		while (curr != null) {
			if (curr.data.equals(obj)) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		Element curr = first;
		while (curr != null) {
			if (curr != first) {
				result.append(", ");
			}
			result.append(curr.data);
			curr = curr.next;
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String[] data = new String[] { "Straight", "Bent", "Equals", "Well", "Storm" };
		MyLinkedList<String> lst = new MyLinkedList<>();
		for (String str : data) {
			lst.add(str);
		}

		System.out.println(lst.toString());
		System.out.println(lst.find("Equals"));
	}
}
