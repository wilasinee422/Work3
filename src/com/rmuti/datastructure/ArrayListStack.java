package com.rmuti.datastructure;

public class ArrayListStack {

	private Object elementData[] = new Object[1];
	private int size = 0; 

	public void push(Object e) {
		ensureCapacity(size+1);
		elementData[size] = e;
		size++;
	}

	public void pop() {
		Object arr[] = new Object[elementData.length];
		for (int i = 0; i <= arr.length-1; i++) {
			arr[i] = elementData[i];
		}
		elementData = arr;
		size--;
	}

	public Object peek(){
		return elementData[size-1];
	}

	private void ensureCapacity(int capasity) {
		if(capasity > elementData.length){
			Object arr[] = new Object[elementData.length*2];
			for (int i = 0; i < size; i++) {
				arr[i] = elementData[i];
			}
			elementData = arr;
		}
	}

	public String toString() {
		String ret = "[";
		for (int i = 0; i < elementData.length; i++) {			
			if(i == elementData.length-1){
				ret = ret+elementData[i]+"]";
			}else{
				ret = ret+elementData[i]+",";
			}
		}
		return ret;
	}

}