package co.micol.prj.service;

public interface Pencil {
	void seletPencil();
	default void  pencilInterface() {
		System.out.println("나는 인터페이스 객체다.");
	}
}
