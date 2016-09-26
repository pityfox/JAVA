package packSerial;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestSerial {

	public static void main(String[] args) throws Exception{
		// Serialisation Binaire
//		serializePersonne();
//		unSerializePersonne();
		
		// Serialisation XML
//		serializePersonneXML();
//		unSerializePersonneXML();
		
		// Serialisation ArrayList
		serializeXMLArrayList();
		unSerializeXMLArrayList();
	}

	// Serial BIN
	static void serializePersonne() throws Exception{
		Personne p1 = new Personne("Alka","Pote",10);
		Personne p2 = new Personne("Popo","Lolo",20, new Adresse("9 rue Rougemont", "Paris"));
		Personne p3 = new Personne("Kumar","Olimar",30);
		File filOut = new File("c:/Users/Ajc/Desktop/ABournique/Java/trollol.txt");
		
		FileOutputStream fos = new FileOutputStream(filOut);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		
		oos.close();
		fos.close();
		
	}
	
	// Dé serial BIN
	static void unSerializePersonne() throws Exception{
		File filIn = new File("c:/Users/Ajc/Desktop/ABournique/Java/trollol.txt");
		
		FileInputStream fis = new FileInputStream(filIn);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object o = new Object();
		
		do{
			try{
				o = ois.readObject();
				if(o instanceof Personne)
					System.out.println((Personne) o);
			}catch(Exception e){
				break;
			}
		}
		while(true);
		
		
		ois.close();
		fis.close();
		
	}
	
	// Serial XML
	static void serializePersonneXML() throws Exception{
		Personne p1 = new Personne("Alka","Pote",10);
		Personne p2 = new Personne("Popo","Lolo",20, new Adresse("9 rue Rougemont", "Paris"));
		Personne p3 = new Personne("Kumar","Olimar",30);
		File filOut = new File("c:/Users/Ajc/Desktop/ABournique/Java/trollol.xml");
		
		FileOutputStream fos = new FileOutputStream(filOut);
		
		XMLEncoder oos = new XMLEncoder(fos);
		
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		
		oos.close();
	}
	
	// De serial XML
	static void unSerializePersonneXML() throws Exception{
		File filIn = new File("c:/Users/Ajc/Desktop/ABournique/Java/trollol.xml");
		
		FileInputStream fis = new FileInputStream(filIn);
		
		XMLDecoder ois = new XMLDecoder(fis);
		
		Object o = new Object();
		
		do{
			try{
				o = ois.readObject();
				if(o instanceof Personne)
					System.out.println((Personne) o);
			}catch(Exception e){
				break;
			}
		}
		while(true);
		
		
		ois.close();
		fis.close();
		
	}
	
	// Serial ArrayList
	static void serializeXMLArrayList() throws Exception{
		
		Personne p1 = new Personne("Alka","Pote",10);
		Personne p2 = new Personne("Popo","Lolo",20, new Adresse("9 rue Rougemont", "Paris"));
		Personne p3 = new Personne("Kumar","Olimar",30);
		
		ArrayList<Personne> pArray = new ArrayList<Personne>();
		pArray.add(p1);
		pArray.add(p2);
		pArray.add(p3);
		
		File filOut = new File("c:/Users/Ajc/Desktop/ABournique/Java/trollolarray.xml");
		
		FileOutputStream fos = new FileOutputStream(filOut);
		
		XMLEncoder oos = new XMLEncoder(fos);
		
		oos.writeObject(pArray);
		
		oos.close();
	}
	
	//De serial Arraylist
	static void unSerializeXMLArrayList() throws Exception{
		File filIn = new File("c:/Users/Ajc/Desktop/ABournique/Java/trollolarray.xml");
		
		FileInputStream fis = new FileInputStream(filIn);
		
		XMLDecoder ois = new XMLDecoder(fis);
		
		ArrayList<Personne> pArray = (ArrayList<Personne>) ois.readObject();
		
		for(Personne el:pArray)
			System.out.println(el);
		
		ois.close();
		fis.close();
		
	}
}
