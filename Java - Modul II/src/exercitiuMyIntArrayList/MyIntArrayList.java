package exercitiuMyIntArrayList;

public class MyIntArrayList {
	
	private int[] elements;
	private int size;
	
	public MyIntArrayList(){
		this(10);
		this.size = 0;
	}
	
	MyIntArrayList(MyIntArrayList c){
		elements = c.elements;
	}
	
	public MyIntArrayList(int initialCapacity) {
		this.elements = new int[initialCapacity];
		this.size = 0;
	}
	
	// intern methods
	private int[] resizeArray (int[] elements) {
		int[] resizedArray = new int[elements.length * 2];
		
		for (int i = 0; i < elements.length; ++i) {
			resizedArray[i] = elements[i];
		}
		return resizedArray;
	}
	
	private int[] resizeArray (int[] elements, int minCapacity) {
		int[] resizedArray = new int[minCapacity];
		
		for (int i = 0; i < elements.length; ++i) {
			resizedArray[i] = elements[i];
		}
		return resizedArray;
	}
	
	//public methods
	public int size() {
		return this.size;
	}
	
	public int get (int index) {
		if (index >= 0 && index < size) {
			return this.elements[index];
		}
		return -1;
	}
	
	public boolean add(int e) {
		if (elements[size] == elements.length - 1) {
			resizeArray(elements);
		}
		
		this.elements[size] = e;
		++size;
		return true;
	}
	
	public void add(int index, int element) {
		if (elements[size] == elements.length - 1) {
			resizeArray(elements);
		}
		int k = size;
		if (index >= 0 && index < elements.length) {
			for (int i = size; i >= index; --i) {
				int aux = elements[k];
				this.elements[i + 1] = aux;
				--k;
			}
			this.elements[index] = element;
			++size;
		} else {
			System.out.println("IndexOutOfBoundsException");
		}
		
	}
	
	public boolean contains(int e) {
		for (int i = 0; i <= size; ++i) {
			if(elements[i] == e) {
				return true;
			}
		}
		return false;
	}
	
	public int indexOf(int e) {
		for (int i = 0; i <= size; ++i) {
			if (elements[i] == e) {
				return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(int e) {
		int saveIndex = 0;
		for (int i = 0; i <= size; ++i) {
			if (elements[i] == e) {
				saveIndex = i;
			}
		}
		if (saveIndex != 0) {
			return saveIndex;
		}
		return -1;
	}
	
	public int removeElementAtIndex(int index) {
		if (index > 0 && index <= size) {
			for (int i = index; i < size; ++i) {
				elements[i] = elements[i+1];
			}
			--size;
			return 1;
		}
		return -1;
	}
	
	public void clear() {
		for (int i = 0 ; i < size; ++i) {
			elements[i] = 0;
		}
		size = 0;
	}
	
	public int set (int index, int e) {
		if (index >= 0 && index < size) {
			elements[index] = e;
			return 1;
		}
		return -1;
	}
	
	public boolean remove (int e) {
		boolean eExist = false;
		int counter = 0;

		for (int i = 0; i < size; ++i) {
			if (elements[i] == e) {
				eExist = true;
				counter = i;
				break;
			}
		}
		if (!eExist) {
			return false;
		}
		
		for (int i = counter; i < size; ++i) {
			this.elements[i] = this.elements[i + 1];
		}
		elements[size - 1] = 0;
		--size;
		return true;
	}
	
	public boolean addAll(MyIntArrayList c) {
		if (c == null) {
			return false;
		}
		
		while (true) {
			if (c.size() + size >= elements.length) {
				elements = resizeArray(elements);
			}
			if (elements.length > c.size() + this.size) {
				break;
			}

		}
		
		int counter = 0;
		for (int i = size; i < this.size + c.size(); ++i) {
			this.elements[i] = c.get(counter);
			if (counter == c.size()) {
				break;
			}
			++size;
			++counter;
		}
		return true;
	}
	
	public boolean addAll(int index, MyIntArrayList c) {
		if(index < 0 || index > size()) {
			return false;
		}
		
		if(c == null) {
			return false;
		}
		
		while(true) {
			if(c.size() + this.size >= elements.length) {
				elements = resizeArray(elements);
			}
			if(elements.length > c.size() + size) {
				break;
			}
		}
		
		this.size += c.size;
		int[] copyElemAfterTheIndex = new int[size];
		int cnt = 0;
		int con = 0;
		for(int i = 0; i < copyElemAfterTheIndex.length; i++) {
			
			if(i < index) {
				copyElemAfterTheIndex[i] = this.elements[i]; 
				con++;
			}
			if(i >= index) {
				copyElemAfterTheIndex[i] = c.elements[cnt];
				cnt ++;
			}
			if(i >= c.elements.length - 1 - con) {
				copyElemAfterTheIndex[i] = this.elements[con] ;
				con ++;
			}
		}
		this.elements = copyElemAfterTheIndex;
		return true;
	}
	
	public void trimToSize() {
		int[] copyOfElements =  new int[size + 1];
	
		for (int i = 0; i <= size; ++i) {
			copyOfElements[i] = elements[i];
		}
	
		elements = copyOfElements;
	}
	
	public int[] toArray() {
		trimToSize();
		return elements;
	}
	
	public void ensureCapacity(int minCapacity) {
		this.elements = resizeArray(elements, minCapacity);
	}
}






