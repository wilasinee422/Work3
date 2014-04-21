package com.rmuti.datastructure;

public class ArrayListQueue {

	private Object elementData [] = new Object[1];
	private int size = 0;

	public void enQueue(Object e) {
		ensureCapacity(size+1);
		elementData[size] = e;
		size++;
	}

	public void deQueue() {
		for (int i = 0; i < size-1; i++) {
			elementData[i] = elementData[i+1];
		}
		size--;
	}
	private void ensureCapacity(int capasity){			
			if(capasity > elementData.length){
			Object arr[] = new Object[elementData.length*2];
			for (int i = 0; i < size; i++) {
				arr[i] = elementData[i];
			}
			elementData = arr;
			}			
	}
	public Object peek() {
		return elementData[0];
	}
	public String toString() {
		String ret = "[";
		for (int i = 0; i < size; i++) {			
			if(i == size-1){
				ret = ret+elementData[i]+"]";
			}else{
				ret = ret+elementData[i]+",";
			}
		}
		return ret;
	}

}
