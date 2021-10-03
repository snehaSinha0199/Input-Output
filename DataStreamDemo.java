package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
	public static void main(String[] args) {
		
		
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("src/temp.data"))){
			for(int i=1;i<6;i++) {
				dos.writeByte(i);
				dos.writeShort(i);
				dos.writeInt(i);
				dos.writeLong(i);
				dos.writeDouble(i);
		} 
		}catch(FileNotFoundException e) {
         System.out.println("filenotfound");
		}catch(IOException e) {
			e.printStackTrace();
		}
		try(DataInputStream dis=new DataInputStream(new FileInputStream("src/temp.data"))){
			for(int i=1;i<6;i++) {
				System.out.printf("%d %d %d %d %f \n",dis.readByte(),dis.readInt(),dis.readLong(),dis.readShort(),dis.readDouble());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
		}

