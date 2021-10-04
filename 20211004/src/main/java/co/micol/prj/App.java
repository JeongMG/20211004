package co.micol.prj;

import co.micol.prj.product.LgTV;
import co.micol.prj.product.MyPrint;
import co.micol.prj.product.Pencil4B;
import co.micol.prj.product.Pencil6B;
import co.micol.prj.product.SamsungTV;
import co.micol.prj.service.Pencil;
import co.micol.prj.service.RemoteController;
import co.micol.prj.tryexam.TryCatchTest;

public class App {
	public static void main(String[] args) throws Exception {
//		RemoteController tv = new SamsungTV();
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.powerOff();
//
//		tv = new LgTV();
//		tv.powerOn();
//		tv.powerOff();
//		
//		Pencil pencil = null;
//		pencil = new Pencil4B();
//		pencil.seletPencil();
//		pencil.pencilInterface(); // Pencil 인터페이스가 가지고 있는 기본 메소드
//		
//		pencil = new Pencil6B();
//		pencil.seletPencil();
//		
//		pencil = new Pencil4B();
//		pencil.seletPencil();
		
//		MyPrint myPrint = new MyPrint();
//		myPrint.powerOn();
//		myPrint.seletPencil();
//		myPrint.powerOff();
		
//		RemoteController rc;
//		
//		TestInterface ts = new TestInterface(new LgTV());
//		
//		rc = ts.rcReturn();
//		rc.powerOn();
//		rc.powerOff();
		
//		MyPrint myPrint = new MyPrint(new Pencil4B());
//		myPrint.toPrint();
		
//		TryCatchTest trycatchTest = new TryCatchTest();
//		trycatchTest.method1();
		
		TryCatchTest trycatchTest = new TryCatchTest();
		try { 
			trycatchTest.method1();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("항상 실행하는 구문");
		}
	}
}
