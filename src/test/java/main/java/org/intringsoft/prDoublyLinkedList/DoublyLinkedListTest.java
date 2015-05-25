package main.java.org.intringsoft.prDoublyLinkedList;

import org.junit.*;
import static org.junit.Assert.*;

public class DoublyLinkedListTest {
	
	@Test
	public void nuevaDLLEstaVacia() {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		assertTrue(DLL.isEmpty());
	}
	
	@Test
	public void insertaNodoAlPrincipio() throws DoublyLinkedListException {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node = new Object();
		DLL.insertBeginning(node);
		assertEquals(node, DLL.first());
	}

	@Test
	public void insertaNodoAlFinal() throws DoublyLinkedListException {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node = new Object();
		DLL.insertEnd(node);
		assertEquals(node, DLL.last());
	}

	@Test
	public void insertaMismoNodoAlPrincipioYFinal() throws DoublyLinkedListException {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node = new Object();
		DLL.insertBeginning(node);
		DLL.insertEnd(node);
		assertEquals(node, DLL.first());
		assertEquals(node, DLL.last());
	}
	
	@Test
	public void listaConElementosAlPrincipioNoEstaVacia() {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node = new Object();
		DLL.insertBeginning(node);
		assertFalse(DLL.isEmpty());
	}
	
	@Test
	public void listaConElementosAlFinalNoEstaVacia() {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node = new Object();
		DLL.insertEnd(node);
		assertFalse(DLL.isEmpty());
	}
	
	@Test
	public void listaConElementosAlPrincipioYFinalNoEstaVacia() {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node = new Object();
		DLL.insertBeginning(node);
		DLL.insertEnd(node);
		assertFalse(DLL.isEmpty());
	}
	
	@Test
	public void insertaDistintoNodoAlPrincipioYFinal() throws DoublyLinkedListException {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node = new Object();
		Object node_ = new Object();
		DLL.insertBeginning(node);
		DLL.insertEnd(node_);
		assertEquals(node, DLL.first());
		assertEquals(node_, DLL.last());
	}
	
	@Test
	public void insertaMismoNodo3VecesAlPrincipio() throws DoublyLinkedListException {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node = new Object();
		DLL.insertBeginning(node);
		DLL.insertBeginning(node);
		DLL.insertBeginning(node);
		assertEquals(node, DLL.first());
		assertEquals(node, DLL.last());
	}
	
	@Test
	public void insertaMismoNodo3VecesAlFinal() throws DoublyLinkedListException {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node = new Object();
		DLL.insertEnd(node);
		DLL.insertEnd(node);
		DLL.insertEnd(node);
		assertEquals(node, DLL.first());
		assertEquals(node, DLL.last());
	}
	
	@Test
	public void insertaMismoNodo3VecesAlPrincipioYFinal() throws DoublyLinkedListException {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node = new Object();
		DLL.insertBeginning(node);
		DLL.insertEnd(node);
		DLL.insertBeginning(node);
		assertEquals(node, DLL.first());
		assertEquals(node, DLL.last());
	}
	
	@Test
	public void insertaDistintosNodos3VecesAlPrincipio() throws DoublyLinkedListException {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node_1 = new Object();
		Object node_2 = new Object();
		Object node_3 = new Object();
		DLL.insertBeginning(node_1);
		DLL.insertBeginning(node_2);
		DLL.insertBeginning(node_3);
		assertEquals(node_3, DLL.first());
		assertEquals(node_1, DLL.last());
	}
	
	@Test
	public void insertaDistintosNodos3VecesAlFinal() throws DoublyLinkedListException {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node_1 = new Object();
		Object node_2 = new Object();
		Object node_3 = new Object();
		DLL.insertEnd(node_1);
		DLL.insertEnd(node_2);
		DLL.insertEnd(node_3);
		assertEquals(node_1, DLL.first());
		assertEquals(node_3, DLL.last());
	}
	
	@Test
	public void insertaDistintosNodos3VecesAlPrincipioYFinal() throws DoublyLinkedListException {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		Object node_1 = new Object();
		Object node_2 = new Object();
		Object node_3 = new Object();
		DLL.insertBeginning(node_1);
		DLL.insertEnd(node_2);
		DLL.insertBeginning(node_3);
		assertEquals(node_3, DLL.first());
		assertEquals(node_2, DLL.last());
	}
	
	@Test
	public void insertaNodoDespuesDetrasDeOtro() throws DoublyLinkedListException {
		DoublyLinkedList<Object> DLL = new DoublyLinkedList<Object>();
		DoublyLinkedList.Node<Object> node_1 = ;
		
	}
	
	public void insertaNodoAntesDetrasDeOtro() {
		
	}
}
